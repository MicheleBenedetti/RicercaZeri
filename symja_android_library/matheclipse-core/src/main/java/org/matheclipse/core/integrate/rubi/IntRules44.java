package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules44 { 
  public static IAST RULES = List( 
IIntegrate(2201,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Plus(e_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Log(Times(d_DEFAULT,x_)))),Power(Log(Times(d_DEFAULT,x_)),n_DEFAULT)),x_Symbol),
    Condition(Simp(Times(e,x,Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Log(Times(d,x)),Plus(n,C1)),Power(Plus(n,C1),-1)),x),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h,n),x),EqQ(Plus(e,Times(CN1,f,h,Plus(n,C1))),C0),EqQ(Plus(Times(g,h,Plus(n,C1)),Times(CN1,b,c,e,Log(FSymbol))),C0),NeQ(n,CN1)))),
IIntegrate(2202,Int(Times(Power(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),Power(x_,m_DEFAULT),Plus(e_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Log(Times(d_DEFAULT,x_)))),Power(Log(Times(d_DEFAULT,x_)),n_DEFAULT)),x_Symbol),
    Condition(Simp(Times(e,Power(x,Plus(m,C1)),Power(FSymbol,Times(c,Plus(a,Times(b,x)))),Power(Log(Times(d,x)),Plus(n,C1)),Power(Plus(n,C1),-1)),x),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h,m,n),x),EqQ(Plus(Times(e,Plus(m,C1)),Times(CN1,f,h,Plus(n,C1))),C0),EqQ(Plus(Times(g,h,Plus(n,C1)),Times(CN1,b,c,e,Log(FSymbol))),C0),NeQ(n,CN1)))),
IIntegrate(2203,Int(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),x_Symbol),
    Condition(Simp(Times(Power(FSymbol,Plus(a,Times(b,Plus(c,Times(d,x))))),Power(Times(b,d,Log(FSymbol)),-1)),x),FreeQ(List(FSymbol,a,b,c,d),x))),
IIntegrate(2204,Int(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Simp(Times(Power(FSymbol,a),Sqrt(Pi),Erfi(Times(Plus(c,Times(d,x)),Rt(Times(b,Log(FSymbol)),C2))),Power(Times(C2,d,Rt(Times(b,Log(FSymbol)),C2)),-1)),x),And(FreeQ(List(FSymbol,a,b,c,d),x),PosQ(b)))),
IIntegrate(2205,Int(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),x_Symbol),
    Condition(Simp(Times(Power(FSymbol,a),Sqrt(Pi),Erf(Times(Plus(c,Times(d,x)),Rt(Times(CN1,b,Log(FSymbol)),C2))),Power(Times(C2,d,Rt(Times(CN1,b,Log(FSymbol)),C2)),-1)),x),And(FreeQ(List(FSymbol,a,b,c,d),x),NegQ(b)))),
IIntegrate(2206,Int(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(c,Times(d,x)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(d,-1)),x),Negate(Dist(Times(b,n,Log(FSymbol)),Int(Times(Power(Plus(c,Times(d,x)),n),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),x),x))),And(FreeQ(List(FSymbol,a,b,c,d),x),IntegerQ(Times(C2,Power(n,-1))),ILtQ(n,C0)))),
IIntegrate(2207,Int(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),x_Symbol),
    Condition(With(List(Set(k,Denominator(n))),Dist(Times(k,Power(d,-1)),Subst(Int(Times(Power(x,Plus(k,Negate(C1))),Power(FSymbol,Plus(a,Times(b,Power(x,Times(k,n)))))),x),x,Power(Plus(c,Times(d,x)),Power(k,-1))),x)),And(FreeQ(List(FSymbol,a,b,c,d),x),IntegerQ(Times(C2,Power(n,-1))),Not(IntegerQ(n))))),
IIntegrate(2208,Int(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),x_Symbol),
    Condition(Negate(Simp(Times(Power(FSymbol,a),Plus(c,Times(d,x)),Gamma(Power(n,-1),Times(CN1,b,Power(Plus(c,Times(d,x)),n),Log(FSymbol))),Power(Times(d,n,Power(Times(CN1,b,Power(Plus(c,Times(d,x)),n),Log(FSymbol)),Power(n,-1))),-1)),x)),And(FreeQ(List(FSymbol,a,b,c,d,n),x),Not(IntegerQ(Times(C2,Power(n,-1))))))),
IIntegrate(2209,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Simp(Times(Power(Plus(e,Times(f,x)),n),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(Times(b,f,n,Power(Plus(c,Times(d,x)),n),Log(FSymbol)),-1)),x),And(FreeQ(List(FSymbol,a,b,c,d,e,f,n),x),EqQ(m,Plus(n,Negate(C1))),EqQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(2210,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Simp(Times(Power(FSymbol,a),ExpIntegralEi(Times(b,Power(Plus(c,Times(d,x)),n),Log(FSymbol))),Power(Times(f,n),-1)),x),And(FreeQ(List(FSymbol,a,b,c,d,e,f,n),x),EqQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(2211,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(d,Plus(m,C1)),-1),Subst(Int(Power(FSymbol,Plus(a,Times(b,Sqr(x)))),x),x,Power(Plus(c,Times(d,x)),Plus(m,C1))),x),And(FreeQ(List(FSymbol,a,b,c,d,m,n),x),EqQ(n,Times(C2,Plus(m,C1)))))),
IIntegrate(2212,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(n),C1)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(Times(b,d,n,Log(FSymbol)),-1)),x),Negate(Dist(Times(Plus(m,Negate(n),C1),Power(Times(b,n,Log(FSymbol)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(n))),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),x),x))),And(FreeQ(List(FSymbol,a,b,c,d),x),IntegerQ(Times(C2,Plus(m,C1),Power(n,-1))),LtQ(C0,Times(Plus(m,C1),Power(n,-1)),C5),IntegerQ(n),Or(LtQ(C0,n,Plus(m,C1)),LtQ(m,n,C0))))),
IIntegrate(2213,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(n),C1)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(Times(b,d,n,Log(FSymbol)),-1)),x),Negate(Dist(Times(Plus(m,Negate(n),C1),Power(Times(b,n,Log(FSymbol)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Simplify(Plus(m,Negate(n)))),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,m,n),x),IntegerQ(Times(C2,Simplify(Times(Plus(m,C1),Power(n,-1))))),LtQ(C0,Simplify(Times(Plus(m,C1),Power(n,-1))),C5),Not(RationalQ(m)),SumSimplerQ(m,Negate(n))))),
IIntegrate(2214,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,n,Log(FSymbol),Power(Plus(m,C1),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,n)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),x),x))),And(FreeQ(List(FSymbol,a,b,c,d),x),IntegerQ(Times(C2,Plus(m,C1),Power(n,-1))),LtQ(CN4,Times(Plus(m,C1),Power(n,-1)),C5),IntegerQ(n),Or(And(GtQ(n,C0),LtQ(m,CN1)),And(GtQ(Negate(n),C0),LeQ(Negate(n),Plus(m,C1))))))),
IIntegrate(2215,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,n,Log(FSymbol),Power(Plus(m,C1),-1)),Int(Times(Power(Plus(c,Times(d,x)),Simplify(Plus(m,n))),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,m,n),x),IntegerQ(Times(C2,Simplify(Times(Plus(m,C1),Power(n,-1))))),LtQ(CN4,Simplify(Times(Plus(m,C1),Power(n,-1))),C5),Not(RationalQ(m)),SumSimplerQ(m,n)))),
IIntegrate(2216,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(k,Denominator(n))),Dist(Times(k,Power(d,-1)),Subst(Int(Times(Power(x,Plus(Times(k,Plus(m,C1)),Negate(C1))),Power(FSymbol,Plus(a,Times(b,Power(x,Times(k,n)))))),x),x,Power(Plus(c,Times(d,x)),Power(k,-1))),x)),And(FreeQ(List(FSymbol,a,b,c,d,m,n),x),IntegerQ(Times(C2,Plus(m,C1),Power(n,-1))),LtQ(C0,Times(Plus(m,C1),Power(n,-1)),C5),Not(IntegerQ(n))))),
IIntegrate(2217,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Plus(e,Times(f,x)),m),Power(Power(Plus(c,Times(d,x)),m),-1)),Int(Times(Power(Plus(c,Times(d,x)),m),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),x),x),And(FreeQ(List(FSymbol,a,b,c,d,e,f,m,n),x),EqQ(Plus(Times(d,e),Times(CN1,c,f)),C0),IntegerQ(Times(C2,Simplify(Times(Plus(m,C1),Power(n,-1))))),NeQ(f,d),Not(IntegerQ(m)),NeQ(Times(c,e),C0)))),
IIntegrate(2218,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Negate(Simp(Times(Power(FSymbol,a),Power(Plus(e,Times(f,x)),Plus(m,C1)),Gamma(Times(Plus(m,C1),Power(n,-1)),Times(CN1,b,Power(Plus(c,Times(d,x)),n),Log(FSymbol))),Power(Times(f,n,Power(Times(CN1,b,Power(Plus(c,Times(d,x)),n),Log(FSymbol)),Times(Plus(m,C1),Power(n,-1)))),-1)),x)),And(FreeQ(List(FSymbol,a,b,c,d,e,f,m,n),x),EqQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(2219,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Simp(Times(f,Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Power(FSymbol,Plus(a,Times(b,Sqr(Plus(c,Times(d,x)))))),Power(Times(C2,b,Sqr(d),Log(FSymbol)),-1)),x),Dist(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(d,-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C1))),Power(FSymbol,Plus(a,Times(b,Sqr(Plus(c,Times(d,x))))))),x),x),Negate(Dist(Times(Plus(m,Negate(C1)),Sqr(f),Power(Times(C2,b,Sqr(d),Log(FSymbol)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,Negate(C2))),Power(FSymbol,Plus(a,Times(b,Sqr(Plus(c,Times(d,x))))))),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e,f),x),NeQ(Plus(Times(d,e),Times(CN1,c,f)),C0),FractionQ(m),GtQ(m,C1)))),
IIntegrate(2220,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Sqr(Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Simp(Times(f,Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,Sqr(Plus(c,Times(d,x)))))),Power(Times(Plus(m,C1),Sqr(f)),-1)),x),Negate(Dist(Times(C2,b,Sqr(d),Log(FSymbol),Power(Times(Sqr(f),Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C2)),Power(FSymbol,Plus(a,Times(b,Sqr(Plus(c,Times(d,x))))))),x),x)),Dist(Times(C2,b,d,Plus(Times(d,e),Times(CN1,c,f)),Log(FSymbol),Power(Times(Sqr(f),Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,Sqr(Plus(c,Times(d,x))))))),x),x)),And(FreeQ(List(FSymbol,a,b,c,d,e,f),x),NeQ(Plus(Times(d,e),Times(CN1,c,f)),C0),LtQ(m,CN1)))),
IIntegrate(2221,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(Times(f,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,d,n,Log(FSymbol),Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(Plus(c,Times(d,x)),Plus(n,Negate(C1))),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n))))),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e,f),x),NeQ(Plus(Times(d,e),Times(CN1,c,f)),C0),IGtQ(n,C2),LtQ(m,CN1)))),
IIntegrate(2222,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Dist(Times(d,Power(f,-1)),Int(Times(Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),-1)))),Power(Plus(c,Times(d,x)),-1)),x),x),Negate(Dist(Times(Plus(Times(d,e),Times(CN1,c,f)),Power(f,-1)),Int(Times(Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),-1)))),Power(Times(Plus(c,Times(d,x)),Plus(e,Times(f,x))),-1)),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e,f),x),NeQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(2223,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),-1)))),Power(Times(f,Plus(m,C1)),-1)),x),Dist(Times(b,d,Log(FSymbol),Power(Times(f,Plus(m,C1)),-1)),Int(Times(Power(Plus(e,Times(f,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),-1)))),Power(Plus(c,Times(d,x)),-2)),x),x)),And(FreeQ(List(FSymbol,a,b,c,d,e,f),x),NeQ(Plus(Times(d,e),Times(CN1,c,f)),C0),ILtQ(m,CN1)))),
IIntegrate(2224,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Unintegrable(Times(Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),Power(Plus(e,Times(f,x)),-1)),x),And(FreeQ(List(FSymbol,a,b,c,d,e,f,n),x),NeQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(2225,Int(Times(Power(F_,v_),Power(u_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(FSymbol,ExpandToSum(v,x))),x),And(FreeQ(List(FSymbol,m),x),LinearQ(u,x),BinomialQ(v,x),Not(And(LinearMatchQ(u,x),BinomialMatchQ(v,x)))))),
IIntegrate(2226,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),n_)))),u_),x_Symbol),
    Condition(Int(ExpandLinearProduct(Power(FSymbol,Plus(a,Times(b,Power(Plus(c,Times(d,x)),n)))),u,c,d,x),x),And(FreeQ(List(FSymbol,a,b,c,d,n),x),PolynomialQ(u,x)))),
IIntegrate(2227,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,v_))),u_DEFAULT),x_Symbol),
    Condition(Int(Times(u,Power(FSymbol,Plus(a,Times(b,NormalizePowerOfLinear(v,x))))),x),And(FreeQ(List(FSymbol,a,b),x),PolynomialQ(u,x),PowerOfLinearQ(v,x),Not(PowerOfLinearMatchQ(v,x))))),
IIntegrate(2228,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),-1),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Negate(Dist(Times(d,Power(Times(f,Plus(Times(d,g),Times(CN1,c,h))),-1)),Subst(Int(Times(Power(FSymbol,Plus(a,Times(CN1,b,h,Power(Plus(Times(d,g),Times(CN1,c,h)),-1)),Times(d,b,x,Power(Plus(Times(d,g),Times(CN1,c,h)),-1)))),Power(x,-1)),x),x,Times(Plus(g,Times(h,x)),Power(Plus(c,Times(d,x)),-1))),x)),And(FreeQ(List(FSymbol,a,b,c,d,e,f),x),EqQ(Plus(Times(d,e),Times(CN1,c,f)),C0)))),
IIntegrate(2229,Int(Times(Power(F_,Plus(e_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(FSymbol,Plus(e,Times(f,b,Power(d,-1)))),Int(Power(Plus(g,Times(h,x)),m),x),x),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h,m),x),EqQ(Plus(Times(b,c),Times(CN1,a,d)),C0)))),
IIntegrate(2230,Int(Times(Power(F_,Plus(e_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Plus(g,Times(h,x)),m),Power(FSymbol,Plus(Times(Plus(Times(d,e),Times(b,f)),Power(d,-1)),Times(CN1,f,Plus(Times(b,c),Times(CN1,a,d)),Power(Times(d,Plus(c,Times(d,x))),-1))))),x),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h,m),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),EqQ(Plus(Times(d,g),Times(CN1,c,h)),C0)))),
IIntegrate(2231,Int(Times(Power(F_,Plus(e_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Plus(Dist(Times(d,Power(h,-1)),Int(Times(Power(FSymbol,Plus(e,Times(f,Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),-1)))),Power(Plus(c,Times(d,x)),-1)),x),x),Negate(Dist(Times(Plus(Times(d,g),Times(CN1,c,h)),Power(h,-1)),Int(Times(Power(FSymbol,Plus(e,Times(f,Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),-1)))),Power(Times(Plus(c,Times(d,x)),Plus(g,Times(h,x))),-1)),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Times(d,g),Times(CN1,c,h)),C0)))),
IIntegrate(2232,Int(Times(Power(F_,Plus(e_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(g,Times(h,x)),Plus(m,C1)),Power(FSymbol,Plus(e,Times(f,Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),-1)))),Power(Times(h,Plus(m,C1)),-1)),x),Negate(Dist(Times(f,Plus(Times(b,c),Times(CN1,a,d)),Log(FSymbol),Power(Times(h,Plus(m,C1)),-1)),Int(Times(Power(Plus(g,Times(h,x)),Plus(m,C1)),Power(FSymbol,Plus(e,Times(f,Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),-1)))),Power(Plus(c,Times(d,x)),-2)),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h),x),NeQ(Plus(Times(b,c),Times(CN1,a,d)),C0),NeQ(Plus(Times(d,g),Times(CN1,c,h)),C0),ILtQ(m,CN1)))),
IIntegrate(2233,Int(Times(Power(F_,Plus(e_DEFAULT,Times(f_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),-1)))),Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_)),-1),Power(Plus(i_DEFAULT,Times(j_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Negate(Dist(Times(d,Power(Times(h,Plus(Times(d,i),Times(CN1,c,j))),-1)),Subst(Int(Times(Power(FSymbol,Plus(e,Times(f,Plus(Times(b,i),Times(CN1,a,j)),Power(Plus(Times(d,i),Times(CN1,c,j)),-1)),Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),f,x,Power(Plus(Times(d,i),Times(CN1,c,j)),-1)))),Power(x,-1)),x),x,Times(Plus(i,Times(j,x)),Power(Plus(c,Times(d,x)),-1))),x)),And(FreeQ(List(FSymbol,a,b,c,d,e,f,g,h),x),EqQ(Plus(Times(d,g),Times(CN1,c,h)),C0)))),
IIntegrate(2234,Int(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),x_Symbol),
    Condition(Dist(Power(FSymbol,Plus(a,Times(CN1,Sqr(b),Power(Times(C4,c),-1)))),Int(Power(FSymbol,Times(Sqr(Plus(b,Times(C2,c,x))),Power(Times(C4,c),-1))),x),x),FreeQ(List(FSymbol,a,b,c),x))),
IIntegrate(2235,Int(Power(F_,v_),x_Symbol),
    Condition(Int(Power(FSymbol,ExpandToSum(v,x)),x),And(FreeQ(FSymbol,x),QuadraticQ(v,x),Not(QuadraticMatchQ(v,x))))),
IIntegrate(2236,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),x_Symbol),
    Condition(Simp(Times(e,Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c,Log(FSymbol)),-1)),x),And(FreeQ(List(FSymbol,a,b,c,d,e),x),EqQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(2237,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c,Log(FSymbol)),-1)),x),Negate(Dist(Times(Plus(m,Negate(C1)),Sqr(e),Power(Times(C2,c,Log(FSymbol)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),EqQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0),GtQ(m,C1)))),
IIntegrate(2238,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),-1)),x_Symbol),
    Condition(Simp(Times(C1,Power(FSymbol,Plus(a,Times(CN1,Sqr(b),Power(Times(C4,c),-1)))),ExpIntegralEi(Times(Sqr(Plus(b,Times(C2,c,x))),Log(FSymbol),Power(Times(C4,c),-1))),Power(Times(C2,e),-1)),x),And(FreeQ(List(FSymbol,a,b,c,d,e),x),EqQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(2239,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(C2,c,Log(FSymbol),Power(Times(Sqr(e),Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C2)),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),EqQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0),LtQ(m,CN1)))),
IIntegrate(2240,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c,Log(FSymbol)),-1)),x),Negate(Dist(Times(Plus(Times(b,e),Times(CN1,C2,c,d)),Power(Times(C2,c),-1)),Int(Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0)))),
IIntegrate(2241,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Simp(Times(e,Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(C2,c,Log(FSymbol)),-1)),x),Negate(Dist(Times(Plus(Times(b,e),Times(CN1,C2,c,d)),Power(Times(C2,c),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C1))),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x)),Negate(Dist(Times(Plus(m,Negate(C1)),Sqr(e),Power(Times(C2,c,Log(FSymbol)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,Negate(C2))),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0),GtQ(m,C1)))),
IIntegrate(2242,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Times(e,Plus(m,C1)),-1)),x),Negate(Dist(Times(C2,c,Log(FSymbol),Power(Times(Sqr(e),Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C2)),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x)),Negate(Dist(Times(Plus(Times(b,e),Times(CN1,C2,c,d)),Log(FSymbol),Power(Times(Sqr(e),Plus(m,C1)),-1)),Int(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x))))),x),x))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),NeQ(Plus(Times(b,e),Times(CN1,C2,c,d)),C0),LtQ(m,CN1)))),
IIntegrate(2243,Int(Times(Power(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(FSymbol,Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Plus(d,Times(e,x)),m)),x),FreeQ(List(FSymbol,a,b,c,d,e,m),x))),
IIntegrate(2244,Int(Times(Power(F_,v_),Power(u_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(FSymbol,ExpandToSum(v,x))),x),And(FreeQ(List(FSymbol,m),x),LinearQ(u,x),QuadraticQ(v,x),Not(And(LinearMatchQ(u,x),QuadraticMatchQ(v,x)))))),
IIntegrate(2245,Int(Times(Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Power(F_,v_))),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(FSymbol,Times(e,Plus(c,Times(d,x)))),Power(Plus(a,Times(b,Power(FSymbol,v))),p)),x))),Plus(Dist(Power(x,m),u,x),Negate(Dist(m,Int(Times(Power(x,Plus(m,Negate(C1))),u),x),x)))),And(FreeQ(List(FSymbol,a,b,c,d,e),x),EqQ(v,Times(C2,e,Plus(c,Times(d,x)))),GtQ(m,C0),ILtQ(p,C0)))),
IIntegrate(2246,Int(Times(Power(Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),n_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),n_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(d,e,n,Log(FSymbol)),-1),Subst(Int(Power(Plus(a,Times(b,x)),p),x),x,Power(Power(FSymbol,Times(e,Plus(c,Times(d,x)))),n)),x),FreeQ(List(FSymbol,a,b,c,d,e,n,p),x))),
IIntegrate(2247,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),n_DEFAULT))),p_DEFAULT),Power(Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Power(GSymbol,Times(h,Plus(f,Times(g,x)))),m),Power(Power(Power(FSymbol,Times(e,Plus(c,Times(d,x)))),n),-1)),Int(Times(Power(Power(FSymbol,Times(e,Plus(c,Times(d,x)))),n),Power(Plus(a,Times(b,Power(Power(FSymbol,Times(e,Plus(c,Times(d,x)))),n))),p)),x),x),And(FreeQ(List(FSymbol,GSymbol,a,b,c,d,e,f,g,h,m,n,p),x),EqQ(Times(d,e,n,Log(FSymbol)),Times(g,h,m,Log(GSymbol)))))),
IIntegrate(2248,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_DEFAULT),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(m,FullSimplify(Times(g,h,Log(GSymbol),Power(Times(d,e,Log(FSymbol)),-1))))),Condition(Dist(Times(Denominator(m),Power(GSymbol,Plus(Times(f,h),Times(CN1,c,g,h,Power(d,-1)))),Power(Times(d,e,Log(FSymbol)),-1)),Subst(Int(Times(Power(x,Plus(Numerator(m),Negate(C1))),Power(Plus(a,Times(b,Power(x,Denominator(m)))),p)),x),x,Power(FSymbol,Times(e,Plus(c,Times(d,x)),Power(Denominator(m),-1)))),x),Or(LeQ(m,CN1),GeQ(m,C1)))),FreeQ(List(FSymbol,GSymbol,a,b,c,d,e,f,g,h,p),x))),
IIntegrate(2249,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_DEFAULT),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(m,FullSimplify(Times(d,e,Log(FSymbol),Power(Times(g,h,Log(GSymbol)),-1))))),Condition(Dist(Times(Denominator(m),Power(Times(g,h,Log(GSymbol)),-1)),Subst(Int(Times(Power(x,Plus(Denominator(m),Negate(C1))),Power(Plus(a,Times(b,Power(FSymbol,Plus(Times(c,e),Times(CN1,d,e,f,Power(g,-1)))),Power(x,Numerator(m)))),p)),x),x,Power(GSymbol,Times(h,Plus(f,Times(g,x)),Power(Denominator(m),-1)))),x),Or(LtQ(m,CN1),GtQ(m,C1)))),FreeQ(List(FSymbol,GSymbol,a,b,c,d,e,f,g,h,p),x))),
IIntegrate(2250,Int(Times(Power(Plus(a_,Times(b_DEFAULT,Power(F_,Times(e_DEFAULT,Plus(c_DEFAULT,Times(d_DEFAULT,x_)))))),p_DEFAULT),Power(G_,Times(h_DEFAULT,Plus(f_DEFAULT,Times(g_DEFAULT,x_))))),x_Symbol),
    Condition(Int(Expand(Times(Power(GSymbol,Times(h,Plus(f,Times(g,x)))),Power(Plus(a,Times(b,Power(FSymbol,Times(e,Plus(c,Times(d,x)))))),p)),x),x),And(FreeQ(List(FSymbol,GSymbol,a,b,c,d,e,f,g,h),x),IGtQ(p,C0))))
  );
}
