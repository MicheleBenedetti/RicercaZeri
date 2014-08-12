package org.matheclipse.core.builtin.function;

import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractCoreFunctionEvaluator;
import org.matheclipse.core.eval.util.Options;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.generic.Functors;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.visit.VisitorLevelSpecification;
import org.matheclipse.parser.client.SyntaxError;

import com.google.common.base.Function;

public class Apply extends AbstractCoreFunctionEvaluator {

	public Apply() {
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkRange(ast, 3, 5);
		
		IAST evaledAST = ast.clone();
		for (int i = 1; i < evaledAST.size(); i++) {
			evaledAST.set(i, F.eval(evaledAST.get(i)));
		}
		int lastIndex = evaledAST.size() - 1;
		boolean heads = false;
		final Options options = new Options(evaledAST.topHead(), evaledAST, lastIndex);
		IExpr option = options.getOption("Heads");
		if (option != null) {
			lastIndex--;
			if (option.isTrue()) {
				heads = true;
			}
		} else {
			Validate.checkRange(evaledAST, 3, 4);
		}

		VisitorLevelSpecification level = null;
		Function<IExpr, IExpr> af = Functors.apply(evaledAST.arg1());
		if (lastIndex == 3) {
			level = new VisitorLevelSpecification(af, evaledAST.get(lastIndex), heads);
		} else {
			level = new VisitorLevelSpecification(af, 0);
		}

		try {

			if (!evaledAST.arg2().isAtom()) {
				final IExpr result = evaledAST.arg2().accept(level);

				return result == null ? evaledAST.arg2() : result;
			} else if (evaledAST.size() == 3) {
				if (evaledAST.arg1().isFunction()) {
					IAST fun = F.ast(evaledAST.arg1());
					fun.add(evaledAST.arg2());
					return fun;
				}
				return evaledAST.arg2();
			}
		} catch (final ArithmeticException e) {

		}
		return null;
	}

	@Override
	public void setUp(final ISymbol symbol) throws SyntaxError {
		symbol.setAttributes(ISymbol.HOLDALL);
	}

}
