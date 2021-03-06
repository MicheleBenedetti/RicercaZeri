package org.matheclipse.core.expression;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import org.apfloat.Apcomplex;
import org.apfloat.ApcomplexMath;
import org.apfloat.Apfloat;
import org.apfloat.ApfloatMath;
import org.apfloat.ApfloatRuntimeException;
import org.hipparchus.complex.Complex;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.interfaces.IComplex;
import org.matheclipse.core.interfaces.IComplexNum;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.INumber;
import org.matheclipse.core.interfaces.ISignedNumber;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.visit.IVisitor;
import org.matheclipse.core.visit.IVisitorBoolean;
import org.matheclipse.core.visit.IVisitorInt;
import org.matheclipse.core.visit.IVisitorLong;

/**
 * <code>IComplexNum</code> implementation which wraps a <code>org.apache.commons.math3.complex.Apcomplex</code> value
 * to represent a numeric complex floating-point number.
 */
public class ApcomplexNum implements IComplexNum {

	public static ApcomplexNum valueOf(final Apcomplex value) {
		return new ApcomplexNum(value);
	}

	public static ApcomplexNum valueOf(final Apfloat real) {
		return new ApcomplexNum(real);
	}

	public static ApcomplexNum valueOf(final Apfloat real, final Apfloat imag) {
		return new ApcomplexNum(real, imag);
	}

	public static ApcomplexNum valueOf(final double real, long precision) {
		return valueOf(new Apcomplex(new Apfloat(new BigDecimal(real), precision), Apcomplex.ZERO));
	}

	public static ApcomplexNum valueOf(final double real, final double imaginary, long precision) {
		return valueOf(new Apcomplex(new Apfloat(new BigDecimal(real), precision),
				new Apfloat(new BigDecimal(imaginary), precision)));
	}

	public static ApcomplexNum valueOf(final Complex c, long precision) {
		return valueOf(new Apcomplex(new Apfloat(new BigDecimal(c.getReal()), precision),
				new Apfloat(new BigDecimal(c.getImaginary()), precision)));
	}

	/**
	 * Create a <code>ApcomplexNum</code> complex number from the real and imaginary <code>BigInteger</code> parts.
	 * 
	 * @param realNumerator
	 *            the real numbers numerator part
	 * @param realDenominator
	 *            the real numbers denominator part
	 * @param imagNumerator
	 *            the imaginary numbers numerator part
	 * @param imagDenominator
	 *            the imaginary numbers denominator part
	 * @param precision
	 *            the precision of the number.
	 * @return a new <code>ApcomplexNum</code> complex number object
	 */
	public static ApcomplexNum valueOf(final BigInteger realNumerator, final BigInteger realDenominator,
			final BigInteger imagNumerator, final BigInteger imagDenominator, long precision) {
		Apfloat real = new Apfloat(realNumerator, precision).divide(new Apfloat(realDenominator, precision));
		Apfloat imag = new Apfloat(imagNumerator, precision).divide(new Apfloat(imagDenominator, precision));
		return new ApcomplexNum(real, imag);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -6033055105824482264L;

	/** The square root of -1. A number representing "0.0 + 1.0i" */
	public static final ApcomplexNum I = new ApcomplexNum(Apcomplex.I);

	/** A complex number representing "NaN + NaNi" */
	// public static final ApfloatComplexNum NaN = valueOf(Double.NaN,
	// Double.NaN);

	/** A complex number representing "1.0 + 0.0i" */
	public static final ApcomplexNum ONE = new ApcomplexNum(Apcomplex.ONE);

	/** A complex number representing "-1.0 + 0.0i" */
	public static final ApcomplexNum MINUS_ONE = ONE.negate();

	/** A complex number representing "0.0 + 0.0i" */
	public static final ApcomplexNum ZERO = new ApcomplexNum(Apcomplex.ZERO);

	Apcomplex fApcomplex;

	private ApcomplexNum(Apcomplex complex) {
		fApcomplex = complex;
	}

	private ApcomplexNum(Apfloat real) {
		fApcomplex = new Apcomplex(real);
	}

	private ApcomplexNum(Apfloat real, Apfloat imag) {
		fApcomplex = new Apcomplex(real, imag);
	}

	/**
	 * @return
	 */
	@Override
	public double getImaginaryPart() {
		double temp = fApcomplex.imag().doubleValue();
		if (temp == (-0.0)) {
			temp = 0.0;
		}
		return temp;
	}

	public Apcomplex apcomplexValue() {
		return fApcomplex;
	}

	@Override
	public ApcomplexNum apcomplexNumValue(long precision) {
		return this;
	}

	@Override
	public ComplexNum complexNumValue() {
		return ComplexNum.valueOf(fApcomplex.real().doubleValue(), fApcomplex.imag().doubleValue());
	}

	/** {@inheritDoc} */
	@Override
	public IExpr dec() {
		return add(MINUS_ONE);
	}

	/** {@inheritDoc} */
	@Override
	public long determinePrecision() {
		return precision();
	}

	/** {@inheritDoc} */
	@Override
	public IExpr inc() {
		return add(ONE);
	}

	/**
	 * @return
	 */
	@Override
	public double getRealPart() {
		double temp = fApcomplex.real().doubleValue();
		if (temp == (-0.0)) {
			temp = 0.0;
		}
		return temp;
	}

	@Override
	public boolean isZero() {
		return fApcomplex.equals(Apcomplex.ZERO);
	}

	@Override
	public int hierarchy() {
		return DOUBLECOMPLEXID;
	}

	@Override
	public IComplexNum add(final IComplexNum val) {
		return valueOf(fApcomplex.add(((ApcomplexNum) val).fApcomplex));
	}

	public ApcomplexNum add(final ApcomplexNum that) {
		return valueOf(fApcomplex.add(that.fApcomplex));
	}

	@Override
	public IComplexNum multiply(final IComplexNum val) {
		return valueOf(fApcomplex.multiply(((ApcomplexNum) val).fApcomplex));
	}

	@Override
	public IComplexNum pow(final IComplexNum val) {
		return valueOf(ApcomplexMath.pow(fApcomplex, ((ApcomplexNum) val).fApcomplex));
	}

	/**
	 * @param that
	 * @return
	 */
	public Apcomplex add(final Apcomplex that) {
		return fApcomplex.add(that);
	}

	/**
	 * @return
	 */
	@Override
	public IComplexNum conjugate() {
		return valueOf(fApcomplex.conj());
	}

	@Override
	public IExpr copy() {
		try {
			return (IExpr) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * @param that
	 * @return
	 */
	public Apcomplex divide(final Apcomplex that) {
		return fApcomplex.divide(that);
	}

	public ApcomplexNum divide(final ApcomplexNum that) throws ArithmeticException {
		return valueOf(fApcomplex.divide(that.fApcomplex));
	}

	@Override
	public IComplexNum divide(final IComplexNum val) {
		return valueOf(fApcomplex.divide(((ApcomplexNum) val).fApcomplex));
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof ApcomplexNum) {
			return fApcomplex.equals(((ApcomplexNum) obj).fApcomplex);
		}
		return false;
	}

	/** {@inheritDoc} */
	@Override
	public IExpr evaluate(EvalEngine engine) {
		// if (fApcomplex.imag().equals(Apcomplex.ZERO)) {
		// return ApfloatNum.valueOf(fApcomplex.real());
		// }
		return F.NIL;
	}

	@Override
	public INumber evalNumber() {
		return this;
	}

	@Override
	public boolean isSame(IExpr expression, double epsilon) {
		if (expression instanceof ApcomplexNum) {
			return fApcomplex.equals(((ApcomplexNum) expression).fApcomplex);
		}
		return false;
	}

	/** {@inheritDoc} */
	@Override
	public double dabs() {
		// if (isNaN()) {
		// return Double.NaN;
		// }
		//
		// if (isInfinite()) {
		// return Double.POSITIVE_INFINITY;
		// }

		if (Math.abs(reDoubleValue()) < Math.abs(imDoubleValue())) {
			if (imDoubleValue() == 0.0) {
				return Math.abs(reDoubleValue());
			}
			final double q = reDoubleValue() / imDoubleValue();
			return (Math.abs(imDoubleValue()) * Math.sqrt(1 + q * q));
		} else {
			if (reDoubleValue() == 0.0) {
				return Math.abs(imDoubleValue());
			}
			final double q = imDoubleValue() / reDoubleValue();
			return (Math.abs(reDoubleValue()) * Math.sqrt(1 + q * q));
		}
	}

	@Override
	public Num abs() {
		return Num.valueOf(dabs());
	}

	@Override
	public IExpr complexArg() {
		return F.num(ApcomplexMath.arg(fApcomplex));
	}

	/** {@inheritDoc} */
	@Override
	public int compareAbsValueToOne() {
		double temp = dabs();
		return Double.compare(temp, 1.0);
	}

	/**
	 * @return
	 */
	// public Apcomplex exp() {
	// return fComplex.exp();
	// }
	/**
	 * @return
	 */

	// public Object export() {
	// return fComplex.export();
	// }
	/**
	 * @return
	 */
	// public float floatValue() {
	// return fComplex.floatValue();
	// }

	@Override
	public double imDoubleValue() {
		return fApcomplex.imag().doubleValue();
	}

	@Override
	public double reDoubleValue() {
		return fApcomplex.real().doubleValue();
	}

	@Override
	public final int hashCode() {
		return fApcomplex.hashCode();
	}

	@Override
	public long leafCountSimplify() {
		return 5;
	}

	/**
	 * @param that
	 * @return
	 */
	public ApcomplexNum multiply(final ApcomplexNum that) {
		return valueOf(fApcomplex.multiply(that.fApcomplex));
	}

	/**
	 * @return
	 */
	@Override
	public ApcomplexNum negate() {
		return valueOf(fApcomplex.negate());
	}

	/**
	 * @return
	 */
	@Override
	public INumber opposite() {
		return valueOf(fApcomplex.negate());
	}

	/**
	 * @param that
	 * @return
	 */
	@Override
	public IExpr plus(final IExpr that) {
		if (that instanceof ApcomplexNum) {
			return valueOf(fApcomplex.add(((ApcomplexNum) that).fApcomplex));
		}
		if (that instanceof ApfloatNum) {
			return add(ApcomplexNum.valueOf(((ApfloatNum) that).fApfloat, Apcomplex.ZERO));
		}
		if (that instanceof Num) {
			return add(ApcomplexNum.valueOf(((Num) that).getRealPart(), fApcomplex.precision()));
		}
		if (that instanceof ComplexNum) {
			ComplexNum cn = (ComplexNum) that;
			return add(ApcomplexNum.valueOf(cn.getRealPart(), cn.getImaginaryPart(), fApcomplex.precision()));
		}
		return IComplexNum.super.plus(that);
	}

	@Override
	public IExpr inverse() {
		return valueOf(ApcomplexMath.inverseRoot(fApcomplex, 1));
	}

	/**
	 * @param that
	 * @return
	 */
	public Apcomplex subtract(final Apcomplex that) {
		return fApcomplex.subtract(that);
	}

	public ApcomplexNum subtract(final ApcomplexNum that) {
		return valueOf(fApcomplex.subtract(that.fApcomplex));
	}

	@Override
	public IComplexNum subtract(final IComplexNum val) {
		return valueOf(fApcomplex.subtract(((ApcomplexNum) val).fApcomplex));
	}

	/**
	 * @param that
	 * @return
	 */
	@Override
	public IExpr times(final IExpr that) {
		if (that instanceof ApcomplexNum) {
			return valueOf(fApcomplex.multiply(((ApcomplexNum) that).fApcomplex));
		}
		if (that instanceof ApfloatNum) {
			return multiply(ApcomplexNum.valueOf(((ApfloatNum) that).fApfloat, Apcomplex.ZERO));
		}
		if (that instanceof Num) {
			return multiply(ApcomplexNum.valueOf(((Num) that).getRealPart(), fApcomplex.precision()));
		}
		if (that instanceof ComplexNum) {
			ComplexNum cn = (ComplexNum) that;
			return multiply(ApcomplexNum.valueOf(cn.getRealPart(), cn.getImaginaryPart(), fApcomplex.precision()));
		}
		return IComplexNum.super.times(that);
	}

	@Override
	public String toString() {
		String str = fApcomplex.toString();
		int index = str.indexOf('e');
		if (index > 0) {
			String exponentStr1 = str.substring(++index);
			str = str.replace("e", "*10^");
			int index2 = exponentStr1.indexOf('e');
			if (index2 > 0) {
				str = str.replace("e", "*10^");
			}
		}
		return str;
	}

	@Override
	public int complexSign() {
		final int i = fApcomplex.real().signum();
		if (i == 0) {
			return fApcomplex.imag().signum();
		}
		return i;
	}

	public int compareTo(final Apcomplex that) {
		if (fApcomplex.real().compareTo(that.real()) < 0) {
			return -1;
		}
		if (fApcomplex.real().compareTo(that.real()) > 0) {
			return 1;
		}
		if (that.imag().signum() == 0) {
			if (fApcomplex.imag().signum() != 0) {
				return 1;
			}
		} else if (fApcomplex.imag().signum() == 0) {
			return -1;
		}
		return fApcomplex.imag().compareTo(that.imag());
	}

	/**
	 * Compares this expression with the specified expression for order. Returns a negative integer, zero, or a positive
	 * integer as this expression is canonical less than, equal to, or greater than the specified expression.
	 */
	@Override
	public int compareTo(final IExpr expr) {
		if (expr.isNumber()) {
			if (expr instanceof ApcomplexNum) {
				return compareTo(((ApcomplexNum) expr).fApcomplex);
			}
			Apcomplex apc = ((INumber) expr).apcomplexNumValue(precision()).fApcomplex;
			return compareTo(apc);
		}
		return -1;
		// return IComplexNum.super.compareTo(expr);
	}

	@Override
	public ISymbol head() {
		return F.Complex;
	}

	public Apcomplex getComplex() {
		return fApcomplex;
	}

	public Complex getCMComplex() {
		return new Complex(fApcomplex.real().doubleValue(), fApcomplex.imag().doubleValue());
	}

	/** {@inheritDoc} */
	@Override
	public IExpr accept(IVisitor visitor) {
		return visitor.visit(this);
	}

	/** {@inheritDoc} */
	@Override
	public boolean accept(IVisitorBoolean visitor) {
		return visitor.visit(this);
	}

	/** {@inheritDoc} */
	@Override
	public int accept(IVisitorInt visitor) {
		return visitor.visit(this);
	}

	/** {@inheritDoc} */
	@Override
	public long accept(IVisitorLong visitor) {
		return visitor.visit(this);
	}

	@Override
	public boolean equalsInt(int i) {
		return false;
	}

	/** {@inheritDoc} */
	@Override
	public ISignedNumber im() {
		return F.num(getImaginaryPart());
	}

	/** {@inheritDoc} */
	@Override
	public ISignedNumber re() {
		return F.num(getRealPart());
	}

	/** {@inheritDoc} */
	@Override
	public INumber round() {
		Apfloat re = ApfloatMath.round(fApcomplex.real(), 1, RoundingMode.HALF_EVEN);
		Apfloat im = ApfloatMath.round(fApcomplex.imag(), 1, RoundingMode.HALF_EVEN);
		return F.complex(F.ZZ(ApfloatMath.floor(re).toBigInteger()), F.ZZ(ApfloatMath.floor(im).toBigInteger()));
	}

	public IExpr sqrt() {
		return valueOf(ApcomplexMath.sqrt(fApcomplex));
	}

	@Override
	public INumber ceilFraction() throws ArithmeticException {
		return F.complex(F.ZZ(ApfloatMath.ceil(fApcomplex.real()).toBigInteger()),
				F.ZZ(ApfloatMath.ceil(fApcomplex.imag()).toBigInteger()));
	}

	/** {@inheritDoc} */
	@Override
	public INumber fractionalPart() {
		return F.complexNum(fApcomplex.real().frac(), fApcomplex.imag().frac());
	}

	@Override
	public INumber floorFraction() throws ArithmeticException {
		return F.complex(F.ZZ(ApfloatMath.floor(fApcomplex.real()).toBigInteger()),
				F.ZZ(ApfloatMath.floor(fApcomplex.imag()).toBigInteger()));
	}

	/** {@inheritDoc} */
	@Override
	public IComplex integerPart() {
		// isNegative() ? ceilFraction() : floorFraction();
		Apfloat re = fApcomplex.real();
		Apfloat im = fApcomplex.imag();
		IInteger reInt;
		IInteger imInt;
		if (re.signum() == -1) {
			// ceilFraction
			reInt = F.ZZ(ApfloatMath.ceil(re).toBigInteger());
		} else {
			// floorFraction
			reInt = F.ZZ(ApfloatMath.floor(re).toBigInteger());
		}
		if (im.signum() == -1) {
			// ceilFraction
			imInt = F.ZZ(ApfloatMath.ceil(im).toBigInteger());
		} else {
			// floorFraction
			imInt = F.ZZ(ApfloatMath.floor(im).toBigInteger());
		}
		return F.complex(reInt, imInt);
	}

	@Override
	public long precision() throws ApfloatRuntimeException {
		return fApcomplex.precision();
	}

}