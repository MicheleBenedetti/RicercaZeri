package org.matheclipse.core.reflection.system;

import java.math.BigInteger;

import org.apache.commons.math3.fraction.BigFraction;
import org.matheclipse.core.eval.interfaces.AbstractArg2;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.IRational;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.parser.client.SyntaxError;

/**
 * Compute Pochhammer's symbol (this)_n.
 * 
 * @param n
 *            The number of product terms in the evaluation.
 * @return Gamma(this+n)/Gamma(this) = this*(this+1)*...*(this+n-1).
 */
public class Pochhammer extends AbstractArg2 {

	public Pochhammer() {
	}

	@Override
	public IExpr e2ObjArg(final IExpr o0, final IExpr o1) {
		if (o0.isRational() && o1.isInteger()) {
			BigFraction bf = ((IRational) o0).getFraction();
			BigFraction ph = pochhammer(bf, ((IInteger) o1).getBigNumerator());
			if (ph != null) {
				return F.fraction(ph);
			}
		}
		return null;
	}

	/**
	 * Compute Pochhammer's symbol (this)_n.
	 * 
	 * @param n
	 *            The number of product terms in the evaluation.
	 * @return Gamma(this+n)/Gamma(this) = this*(this+1)*...*(this+n-1).
	 */
	public static BigFraction pochhammer(BigFraction th, final BigInteger n) {
		if (n.compareTo(BigInteger.ZERO) < 0)
			return null;
		else if (n.compareTo(BigInteger.ZERO) == 0)
			return BigFraction.ONE;
		else {
			/*
			 * initialize results with the current value
			 */
			BigFraction res = new BigFraction(th.getNumerator(), th.getDenominator());
			BigInteger i = BigInteger.ONE;
			for (; i.compareTo(n) < 0; i = i.add(BigInteger.ONE))
				res = res.multiply(th.add(i));
			return res;
		}
	}

	/**
	 * Compute pochhammer's symbol (this)_n.
	 * 
	 * @param n
	 *            The number of product terms in the evaluation.
	 * @return Gamma(this+n)/GAMMA(this).
	 */
	public static BigFraction pochhammer(BigFraction th, int n) {
		return pochhammer(th, BigInteger.valueOf(n));
	}

	@Override
	public void setUp(final ISymbol symbol) throws SyntaxError {
		symbol.setAttributes(ISymbol.LISTABLE);
	}
}
