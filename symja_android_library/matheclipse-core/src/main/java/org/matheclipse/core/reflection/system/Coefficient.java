package org.matheclipse.core.reflection.system;

import org.matheclipse.core.convert.ExprVariables;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.polynomials.Polynomial;
import org.matheclipse.parser.client.SyntaxError;

/**
 * 
 * See: <a href="http://en.wikipedia.org/wiki/Coefficient">Wikipedia - Coefficient</a>
 */
public class Coefficient extends AbstractFunctionEvaluator {

	public Coefficient() {
	}

	private boolean setExponent(IAST list, IExpr expr, long[] exponents, long value) {
		for (int j = 1; j < list.size(); j++) {
			if (list.get(j).equals(expr)) {
				exponents[j - 1] = value;
				return true;
			}
		}
		return false;
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkRange(ast, 3, 4);

		IExpr arg2 = ast.arg2();
		// list of variable expressions extracted from the second argument
		IAST listOfVariables = null;
		// array of corresponding exponents for the list of variables
		long[] exponents = null;
		
		if (arg2.isTimes()) {
			// Times(x, y^a,...)
			IAST arg2AST = (IAST) arg2;
			ExprVariables eVar = new ExprVariables(arg2AST);
			listOfVariables = eVar.getVarList();
			exponents = new long[listOfVariables.size() - 1];
			for (int i = 0; i < exponents.length; i++) {
				exponents[i] = 0L;
			}
			for (int i = 1; i < arg2AST.size(); i++) {
				long value = 1L;
				IExpr a1 = arg2AST.get(i);
				if (arg2AST.get(i).isPower() && arg2AST.get(i).getAt(2).isInteger()) {
					a1 = arg2AST.get(i).getAt(1);
					IInteger ii = (IInteger) arg2AST.get(i).getAt(2);
					try {
						value = ii.toLong();
					} catch (ArithmeticException ae) {
						return null;
					}
				}

				if (!setExponent(listOfVariables, a1, exponents, value)) {
					return null;
				}
			}
		} else {
			listOfVariables = F.List();
			listOfVariables.add(arg2);
			exponents = new long[1];
			exponents[0] = 1;
		}

		try {
			long n = 1;
			if (ast.size() == 4) {
				if (ast.arg3().isNegativeInfinity()) {
					return F.C0;
				}
				n = Validate.checkLongType(ast.arg3());
				for (int i = 0; i < exponents.length; i++) {
					exponents[i] *= n;
				}
			}
			IExpr expr = F.evalExpandAll(ast.arg1());
			Polynomial poly = new Polynomial(expr, listOfVariables);
			if (poly.isPolynomial()) {
				return poly.coefficient(exponents);
			}
			return F.C0;
		} catch (ArithmeticException ae) {

		}
		return null;
	}

	@Override
	public void setUp(final ISymbol symbol) throws SyntaxError {
		symbol.setAttributes(ISymbol.LISTABLE);
		super.setUp(symbol);
	}
}