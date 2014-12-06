package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules97 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_DEFAULT),x_Symbol),
    Condition(Module(List(Set(g,Numerator(Power(n,CN1)))),Times(g,Subst(Int(Times(Power(x,Plus(g,Times(CN1,C1))),Power(Sinh(Plus(a,Times(b,Power(x,Times(n,g))))),p)),x),x,Power(x,Power(g,CN1))))),And(And(FreeQ(List(a,b,p),x),RationalQ(n)),Or(Less(n,C0),FractionQ(n))))),
ISetDelayed(Int(Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_DEFAULT),x_Symbol),
    Condition(Module(List(Set(g,Numerator(Power(n,CN1)))),Times(g,Subst(Int(Times(Power(x,Plus(g,Times(CN1,C1))),Power(Cosh(Plus(a,Times(b,Power(x,Times(n,g))))),p)),x),x,Power(x,Power(g,CN1))))),And(And(FreeQ(List(a,b,p),x),RationalQ(n)),Or(Less(n,C0),FractionQ(n))))),
ISetDelayed(Int(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Power(E,Plus(a,Times(b,Power(x,n)))),x)),Times(CN1,C1D2,Int(Power(E,Plus(Times(CN1,a),Times(CN1,b,Power(x,n)))),x))),FreeQ(List(a,b,n),x))),
ISetDelayed(Int(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Power(E,Plus(a,Times(b,Power(x,n)))),x)),Times(C1D2,Int(Power(E,Plus(Times(CN1,a),Times(CN1,b,Power(x,n)))),x))),FreeQ(List(a,b,n),x))),
ISetDelayed(Int(Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Sinh(Plus(a,Times(b,Power(x,n)))),p),x),x),And(And(FreeQ(List(a,b,n),x),IntegerQ(p)),Greater(p,C1)))),
ISetDelayed(Int(Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Cosh(Plus(a,Times(b,Power(x,n)))),p),x),x),And(And(FreeQ(List(a,b,n),x),IntegerQ(p)),Greater(p,C1)))),
ISetDelayed(Int(Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_DEFAULT),x_Symbol),
    Condition($(Defer($s("Int")),Power(Sinh(Plus(a,Times(b,Power(x,n)))),p),x),FreeQ(List(a,b,n,p),x))),
ISetDelayed(Int(Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_DEFAULT),x_Symbol),
    Condition($(Defer($s("Int")),Power(Cosh(Plus(a,Times(b,Power(x,n)))),p),x),FreeQ(List(a,b,n,p),x))),
ISetDelayed(Int(Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(u_,n_)))),p_DEFAULT),x_Symbol),
    Condition(Times(Power(Coefficient(u,x,C1),CN1),Subst(Int(Power(Sinh(Plus(a,Times(b,Power(x,n)))),p),x),x,u)),And(And(FreeQ(List(a,b,n,p),x),LinearQ(u,x)),NonzeroQ(Plus(u,Times(CN1,x)))))),
ISetDelayed(Int(Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(u_,n_)))),p_DEFAULT),x_Symbol),
    Condition(Times(Power(Coefficient(u,x,C1),CN1),Subst(Int(Power(Cosh(Plus(a,Times(b,Power(x,n)))),p),x),x,u)),And(And(FreeQ(List(a,b,n,p),x),LinearQ(u,x)),NonzeroQ(Plus(u,Times(CN1,x)))))),
ISetDelayed(Int(Times(Power(x_,CN1),Sinh(Times(b_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Times(SinhIntegral(Times(b,Power(x,n))),Power(n,CN1)),FreeQ(List(b,n),x))),
ISetDelayed(Int(Times(Cosh(Times(b_DEFAULT,Power(x_,n_))),Power(x_,CN1)),x_Symbol),
    Condition(Times(CoshIntegral(Times(b,Power(x,n))),Power(n,CN1)),FreeQ(List(b,n),x))),
ISetDelayed(Int(Times(Power(x_,CN1),Sinh(Plus(a_,Times(b_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Times(Sinh(a),Int(Times(Cosh(Times(b,Power(x,n))),Power(x,CN1)),x)),Times(Cosh(a),Int(Times(Sinh(Times(b,Power(x,n))),Power(x,CN1)),x))),FreeQ(List(a,b,n),x))),
ISetDelayed(Int(Times(Cosh(Plus(a_,Times(b_DEFAULT,Power(x_,n_)))),Power(x_,CN1)),x_Symbol),
    Condition(Plus(Times(Cosh(a),Int(Times(Cosh(Times(b,Power(x,n))),Power(x,CN1)),x)),Times(Sinh(a),Int(Times(Sinh(Times(b,Power(x,n))),Power(x,CN1)),x))),FreeQ(List(a,b,n),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Times(Cosh(Plus(a,Times(b,Power(x,n)))),Power(Times(b,n),CN1)),And(FreeQ(List(a,b,m,n),x),ZeroQ(Plus(m,Times(CN1,Plus(n,Times(CN1,C1)))))))),
ISetDelayed(Int(Times(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Times(Sinh(Plus(a,Times(b,Power(x,n)))),Power(Times(b,n),CN1)),And(FreeQ(List(a,b,m,n),x),ZeroQ(Plus(m,Times(CN1,Plus(n,Times(CN1,C1)))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,n),C1)),Cosh(Plus(a,Times(b,Power(x,n)))),Power(Times(b,n),CN1)),Times(CN1,Plus(m,Times(CN1,n),C1),Power(Times(b,n),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Cosh(Plus(a,Times(b,Power(x,n))))),x))),And(And(FreeQ(List(a,b),x),RationalQ(m,n)),Or(Less(Less(C0,n),Plus(m,C1)),Less(Less(Plus(m,C1),n),C0))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Module(List(Set($s("mn"),Simplify(Plus(m,Times(CN1,n))))),Plus(Times(Power(x,Plus($s("mn"),C1)),Cosh(Plus(a,Times(b,Power(x,n)))),Power(Times(b,n),CN1)),Times(CN1,Plus($s("mn"),C1),Power(Times(b,n),CN1),Int(Times(Power(x,$s("mn")),Cosh(Plus(a,Times(b,Power(x,n))))),x)))),And(And(FreeQ(List(a,b,m,n),x),NonzeroQ(Plus(m,Times(CN1,n),C1))),PositiveIntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1))))))),
ISetDelayed(Int(Times(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,n),C1)),Sinh(Plus(a,Times(b,Power(x,n)))),Power(Times(b,n),CN1)),Times(CN1,Plus(m,Times(CN1,n),C1),Power(Times(b,n),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Sinh(Plus(a,Times(b,Power(x,n))))),x))),And(And(FreeQ(List(a,b),x),RationalQ(m,n)),Or(Less(Less(C0,n),Plus(m,C1)),Less(Less(Plus(m,C1),n),C0))))),
ISetDelayed(Int(Times(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Module(List(Set($s("mn"),Simplify(Plus(m,Times(CN1,n))))),Plus(Times(Power(x,Plus($s("mn"),C1)),Sinh(Plus(a,Times(b,Power(x,n)))),Power(Times(b,n),CN1)),Times(CN1,Plus($s("mn"),C1),Power(Times(b,n),CN1),Int(Times(Power(x,$s("mn")),Sinh(Plus(a,Times(b,Power(x,n))))),x)))),And(And(FreeQ(List(a,b,m,n),x),NonzeroQ(Plus(m,Times(CN1,n),C1))),PositiveIntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Sinh(Plus(a,Times(b,Power(x,n)))),Power(Plus(m,C1),CN1)),Times(CN1,b,n,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,n)),Cosh(Plus(a,Times(b,Power(x,n))))),x))),And(And(FreeQ(List(a,b),x),RationalQ(m,n)),Or(And(Greater(n,C0),Less(m,CN1)),And(Less(n,C0),Greater(m,CN1)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Sinh(Plus(a,Times(b,Power(x,n)))),Power(Plus(m,C1),CN1)),Times(CN1,b,n,Power(Plus(m,C1),CN1),Int(Times(Power(x,Simplify(Plus(m,n))),Cosh(Plus(a,Times(b,Power(x,n))))),x))),And(FreeQ(List(a,b,m,n),x),NegativeIntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1))))))),
ISetDelayed(Int(Times(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Cosh(Plus(a,Times(b,Power(x,n)))),Power(Plus(m,C1),CN1)),Times(CN1,b,n,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,n)),Sinh(Plus(a,Times(b,Power(x,n))))),x))),And(And(FreeQ(List(a,b),x),RationalQ(m,n)),Or(And(Greater(n,C0),Less(m,CN1)),And(Less(n,C0),Greater(m,CN1)))))),
ISetDelayed(Int(Times(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Cosh(Plus(a,Times(b,Power(x,n)))),Power(Plus(m,C1),CN1)),Times(CN1,b,n,Power(Plus(m,C1),CN1),Int(Times(Power(x,Simplify(Plus(m,n))),Sinh(Plus(a,Times(b,Power(x,n))))),x))),And(FreeQ(List(a,b,m,n),x),NegativeIntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_))))),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Power(x,m),Power(E,Plus(a,Times(b,Power(x,n))))),x)),Times(CN1,C1D2,Int(Times(Power(x,m),Power(E,Plus(Times(CN1,a),Times(CN1,b,Power(x,n))))),x))),FreeQ(List(a,b,m,n),x))),
ISetDelayed(Int(Times(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Power(x,m),Power(E,Plus(a,Times(b,Power(x,n))))),x)),Times(C1D2,Int(Times(Power(x,m),Power(E,Plus(Times(CN1,a),Times(CN1,b,Power(x,n))))),x))),FreeQ(List(a,b,m,n),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Sinh(Plus(a,Times(b,Power(x,n)))),p),Power(Times(Plus(n,Times(CN1,C1)),Power(x,Plus(n,Times(CN1,C1)))),CN1)),Times(b,n,p,Power(Plus(n,Times(CN1,C1)),CN1),Int(Times(Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C1))),Cosh(Plus(a,Times(b,Power(x,n))))),x))),And(And(And(And(FreeQ(List(a,b),x),IntegersQ(n,p)),ZeroQ(Plus(m,n))),Greater(p,C1)),NonzeroQ(Plus(n,Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(Cosh(Plus(a,Times(b,Power(x,n)))),p),Power(Times(Plus(n,Times(CN1,C1)),Power(x,Plus(n,Times(CN1,C1)))),CN1)),Times(b,n,p,Power(Plus(n,Times(CN1,C1)),CN1),Int(Times(Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C1))),Sinh(Plus(a,Times(b,Power(x,n))))),x))),And(And(And(And(FreeQ(List(a,b),x),IntegersQ(n,p)),ZeroQ(Plus(m,n))),Greater(p,C1)),NonzeroQ(Plus(n,Times(CN1,C1)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,n,Power(Sinh(Plus(a,Times(b,Power(x,n)))),p),Power(Times(Sqr(b),Sqr(n),Sqr(p)),CN1)),Times(Power(x,n),Cosh(Plus(a,Times(b,Power(x,n)))),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C1))),Power(Times(b,n,p),CN1)),Times(CN1,Plus(p,Times(CN1,C1)),Power(p,CN1),Int(Times(Power(x,m),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,m,n),x),ZeroQ(Plus(m,Times(CN1,C2,n),C1))),RationalQ(p)),Greater(p,C1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,n,Power(Cosh(Plus(a,Times(b,Power(x,n)))),p),Power(Times(Sqr(b),Sqr(n),Sqr(p)),CN1)),Times(Power(x,n),Sinh(Plus(a,Times(b,Power(x,n)))),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C1))),Power(Times(b,n,p),CN1)),Times(Plus(p,Times(CN1,C1)),Power(p,CN1),Int(Times(Power(x,m),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,m,n),x),ZeroQ(Plus(m,Times(CN1,C2,n),C1))),RationalQ(p)),Greater(p,C1)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(m,Times(CN1,n),C1),Power(x,Plus(m,Times(CN1,C2,n),C1)),Power(Sinh(Plus(a,Times(b,Power(x,n)))),p),Power(Times(Sqr(b),Sqr(n),Sqr(p)),CN1)),Times(Power(x,Plus(m,Times(CN1,n),C1)),Cosh(Plus(a,Times(b,Power(x,n)))),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C1))),Power(Times(b,n,p),CN1)),Times(CN1,Plus(p,Times(CN1,C1)),Power(p,CN1),Int(Times(Power(x,m),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C2)))),x)),Times(Plus(m,Times(CN1,n),C1),Plus(m,Times(CN1,C2,n),C1),Power(Times(Sqr(b),Sqr(n),Sqr(p)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2,n))),Power(Sinh(Plus(a,Times(b,Power(x,n)))),p)),x))),And(And(And(And(FreeQ(List(a,b),x),IntegersQ(m,n)),RationalQ(p)),Greater(p,C1)),Less(Less(C0,Times(C2,n)),Plus(m,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(m,Times(CN1,n),C1),Power(x,Plus(m,Times(CN1,C2,n),C1)),Power(Cosh(Plus(a,Times(b,Power(x,n)))),p),Power(Times(Sqr(b),Sqr(n),Sqr(p)),CN1)),Times(Power(x,Plus(m,Times(CN1,n),C1)),Sinh(Plus(a,Times(b,Power(x,n)))),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C1))),Power(Times(b,n,p),CN1)),Times(Plus(p,Times(CN1,C1)),Power(p,CN1),Int(Times(Power(x,m),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C2)))),x)),Times(Plus(m,Times(CN1,n),C1),Plus(m,Times(CN1,C2,n),C1),Power(Times(Sqr(b),Sqr(n),Sqr(p)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2,n))),Power(Cosh(Plus(a,Times(b,Power(x,n)))),p)),x))),And(And(And(And(FreeQ(List(a,b),x),IntegersQ(m,n)),RationalQ(p)),Greater(p,C1)),Less(Less(C0,Times(C2,n)),Plus(m,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Sinh(Plus(a,Times(b,Power(x,n)))),p),Power(Plus(m,C1),CN1)),Times(CN1,b,n,p,Power(x,Plus(m,n,C1)),Cosh(Plus(a,Times(b,Power(x,n)))),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C1))),Power(Times(Plus(m,C1),Plus(m,n,C1)),CN1)),Times(Sqr(b),Sqr(n),Sqr(p),Power(Times(Plus(m,C1),Plus(m,n,C1)),CN1),Int(Times(Power(x,Plus(m,Times(C2,n))),Power(Sinh(Plus(a,Times(b,Power(x,n)))),p)),x)),Times(Sqr(b),Sqr(n),p,Plus(p,Times(CN1,C1)),Power(Times(Plus(m,C1),Plus(m,n,C1)),CN1),Int(Times(Power(x,Plus(m,Times(C2,n))),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C2)))),x))),And(And(And(And(And(FreeQ(List(a,b),x),IntegersQ(m,n)),RationalQ(p)),Greater(p,C1)),Less(Less(C0,Times(C2,n)),Plus(C1,Times(CN1,m)))),NonzeroQ(Plus(m,n,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Cosh(Plus(a,Times(b,Power(x,n)))),p),Power(Plus(m,C1),CN1)),Times(CN1,b,n,p,Power(x,Plus(m,n,C1)),Sinh(Plus(a,Times(b,Power(x,n)))),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C1))),Power(Times(Plus(m,C1),Plus(m,n,C1)),CN1)),Times(Sqr(b),Sqr(n),Sqr(p),Power(Times(Plus(m,C1),Plus(m,n,C1)),CN1),Int(Times(Power(x,Plus(m,Times(C2,n))),Power(Cosh(Plus(a,Times(b,Power(x,n)))),p)),x)),Times(CN1,Sqr(b),Sqr(n),p,Plus(p,Times(CN1,C1)),Power(Times(Plus(m,C1),Plus(m,n,C1)),CN1),Int(Times(Power(x,Plus(m,Times(C2,n))),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C2)))),x))),And(And(And(And(And(FreeQ(List(a,b),x),IntegersQ(m,n)),RationalQ(p)),Greater(p,C1)),Less(Less(C0,Times(C2,n)),Plus(C1,Times(CN1,m)))),NonzeroQ(Plus(m,n,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Times(Power(Plus(m,C1),CN1),Subst(Int(Power(Sinh(Plus(a,Times(b,Power(x,Simplify(Times(n,Power(Plus(m,C1),CN1))))))),p),x),x,Power(x,Plus(m,C1)))),And(And(FreeQ(List(a,b,m,n,p),x),NonzeroQ(Plus(m,C1))),PositiveIntegerQ(Simplify(Times(n,Power(Plus(m,C1),CN1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Times(Power(Plus(m,C1),CN1),Subst(Int(Power(Cosh(Plus(a,Times(b,Power(x,Simplify(Times(n,Power(Plus(m,C1),CN1))))))),p),x),x,Power(x,Plus(m,C1)))),And(And(FreeQ(List(a,b,m,n,p),x),NonzeroQ(Plus(m,C1))),PositiveIntegerQ(Simplify(Times(n,Power(Plus(m,C1),CN1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(x,m),Power(Sinh(Plus(a,Times(b,Power(x,n)))),p),x),x),And(And(And(And(FreeQ(List(a,b,m,n),x),IntegerQ(p)),Greater(p,C1)),Not(FractionQ(m))),Not(FractionQ(n))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(x,m),Power(Cosh(Plus(a,Times(b,Power(x,n)))),p),x),x),And(And(And(And(FreeQ(List(a,b,m,n),x),IntegerQ(p)),Greater(p,C1)),Not(FractionQ(m))),Not(FractionQ(n))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(Power(x,n),Cosh(Plus(a,Times(b,Power(x,n)))),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),CN1)),Times(CN1,n,Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,C2)),Power(Times(Sqr(b),Sqr(n),Plus(p,C1),Plus(p,C2)),CN1)),Times(CN1,Plus(p,C2),Power(Plus(p,C1),CN1),Int(Times(Power(x,m),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,C2))),x))),And(And(And(And(FreeQ(List(a,b,m,n),x),ZeroQ(Plus(m,Times(CN1,C2,n),C1))),RationalQ(p)),Less(p,CN1)),Unequal(p,CN2)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,n),Sinh(Plus(a,Times(b,Power(x,n)))),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),CN1)),Times(n,Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,C2)),Power(Times(Sqr(b),Sqr(n),Plus(p,C1),Plus(p,C2)),CN1)),Times(Plus(p,C2),Power(Plus(p,C1),CN1),Int(Times(Power(x,m),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,C2))),x))),And(And(And(And(FreeQ(List(a,b,m,n),x),ZeroQ(Plus(m,Times(CN1,C2,n),C1))),RationalQ(p)),Less(p,CN1)),Unequal(p,CN2)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,n),C1)),Cosh(Plus(a,Times(b,Power(x,n)))),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),CN1)),Times(CN1,Plus(m,Times(CN1,n),C1),Power(x,Plus(m,Times(CN1,C2,n),C1)),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,C2)),Power(Times(Sqr(b),Sqr(n),Plus(p,C1),Plus(p,C2)),CN1)),Times(CN1,Plus(p,C2),Power(Plus(p,C1),CN1),Int(Times(Power(x,m),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,C2))),x)),Times(Plus(m,Times(CN1,n),C1),Plus(m,Times(CN1,C2,n),C1),Power(Times(Sqr(b),Sqr(n),Plus(p,C1),Plus(p,C2)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2,n))),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,C2))),x))),And(And(And(And(And(FreeQ(List(a,b),x),IntegersQ(m,n)),RationalQ(p)),Less(p,CN1)),Unequal(p,CN2)),Less(Less(C0,Times(C2,n)),Plus(m,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,Plus(m,Times(CN1,n),C1)),Sinh(Plus(a,Times(b,Power(x,n)))),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),CN1)),Times(Plus(m,Times(CN1,n),C1),Power(x,Plus(m,Times(CN1,C2,n),C1)),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,C2)),Power(Times(Sqr(b),Sqr(n),Plus(p,C1),Plus(p,C2)),CN1)),Times(Plus(p,C2),Power(Plus(p,C1),CN1),Int(Times(Power(x,m),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,C2))),x)),Times(CN1,Plus(m,Times(CN1,n),C1),Plus(m,Times(CN1,C2,n),C1),Power(Times(Sqr(b),Sqr(n),Plus(p,C1),Plus(p,C2)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2,n))),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,C2))),x))),And(And(And(And(And(FreeQ(List(a,b),x),IntegersQ(m,n)),RationalQ(p)),Less(p,CN1)),Unequal(p,CN2)),Less(Less(C0,Times(C2,n)),Plus(m,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(u_,n_)))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Power(Coefficient(u,x,C1),Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(x,Times(CN1,Coefficient(u,x,C0))),m),Power(Sinh(Plus(a,Times(b,Power(x,n)))),p)),x),x,u)),And(And(And(FreeQ(List(a,b,n,p),x),LinearQ(u,x)),IntegerQ(m)),NonzeroQ(Plus(u,Times(CN1,x)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(u_,n_)))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(Power(Coefficient(u,x,C1),Plus(m,C1)),CN1),Subst(Int(Times(Power(Plus(x,Times(CN1,Coefficient(u,x,C0))),m),Power(Cosh(Plus(a,Times(b,Power(x,n)))),p)),x),x,u)),And(And(And(FreeQ(List(a,b,n,p),x),LinearQ(u,x)),IntegerQ(m)),NonzeroQ(Plus(u,Times(CN1,x)))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT),Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))))),x_Symbol),
    Condition(Times(Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),CN1)),And(And(FreeQ(List(a,b,m,n,p),x),ZeroQ(Plus(m,Times(CN1,n),C1))),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))))),x_Symbol),
    Condition(Times(Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),CN1)),And(And(FreeQ(List(a,b,m,n,p),x),ZeroQ(Plus(m,Times(CN1,n),C1))),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT),Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))))),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,n),C1)),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),CN1)),Times(CN1,Plus(m,Times(CN1,n),C1),Power(Times(b,n,Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Sinh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1))),x))),And(And(And(FreeQ(List(a,b,p),x),RationalQ(m,n)),Less(Less(C0,n),Plus(m,C1))),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))))),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,n),C1)),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),CN1)),Times(CN1,Plus(m,Times(CN1,n),C1),Power(Times(b,n,Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Cosh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1))),x))),And(And(And(FreeQ(List(a,b,p),x),RationalQ(m,n)),Less(Less(C0,n),Plus(m,C1))),NonzeroQ(Plus(p,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(n,CN1),Subst(Int(Power(Tanh(Plus(a,Times(b,x))),p),x),x,Power(x,n))),And(FreeQ(List(a,b,m,n,p),x),ZeroQ(Plus(m,Times(CN1,Plus(n,Times(CN1,C1)))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(n,CN1),Subst(Int(Power(Coth(Plus(a,Times(b,x))),p),x),x,Power(x,n))),And(FreeQ(List(a,b,m,n,p),x),ZeroQ(Plus(m,Times(CN1,Plus(n,Times(CN1,C1)))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,Plus(m,Times(CN1,n),C1)),Power(Tanh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C1))),Power(Times(b,n,Plus(p,Times(CN1,C1))),CN1)),Times(Plus(m,Times(CN1,n),C1),Power(Times(b,n,Plus(p,Times(CN1,C1))),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Tanh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C1)))),x)),Int(Times(Power(x,m),Power(Tanh(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C2)))),x)),And(And(And(FreeQ(List(a,b),x),RationalQ(m,n,p)),Greater(p,C1)),Less(Less(C0,n),Plus(m,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,Plus(m,Times(CN1,n),C1)),Power(Coth(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C1))),Power(Times(b,n,Plus(p,Times(CN1,C1))),CN1)),Times(Plus(m,Times(CN1,n),C1),Power(Times(b,n,Plus(p,Times(CN1,C1))),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Coth(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C1)))),x)),Int(Times(Power(x,m),Power(Coth(Plus(a,Times(b,Power(x,n)))),Plus(p,Times(CN1,C2)))),x)),And(And(And(FreeQ(List(a,b),x),RationalQ(m,n,p)),Greater(p,C1)),Less(Less(C0,n),Plus(m,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,n),C1)),Power(Tanh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),CN1)),Times(CN1,Plus(m,Times(CN1,n),C1),Power(Times(b,n,Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Tanh(Plus(a,Times(b,Power(x,n)))),Plus(p,C1))),x)),Int(Times(Power(x,m),Power(Tanh(Plus(a,Times(b,Power(x,n)))),Plus(p,C2))),x)),And(And(And(FreeQ(List(a,b),x),RationalQ(m,n,p)),Less(p,CN1)),Less(Less(C0,n),Plus(m,C1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_)),x_Symbol),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,n),C1)),Power(Coth(Plus(a,Times(b,Power(x,n)))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),CN1)),Times(CN1,Plus(m,Times(CN1,n),C1),Power(Times(b,n,Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Coth(Plus(a,Times(b,Power(x,n)))),Plus(p,C1))),x)),Int(Times(Power(x,m),Power(Coth(Plus(a,Times(b,Power(x,n)))),Plus(p,C2))),x)),And(And(And(FreeQ(List(a,b),x),RationalQ(m,n,p)),Less(p,CN1)),Less(Less(C0,n),Plus(m,C1))))),
ISetDelayed(Int(Sech(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Times(Power(n,CN1),Subst(Int(Times(Power(x,Plus(Power(n,CN1),Times(CN1,C1))),Sech(Plus(a,Times(b,x)))),x),x,Power(x,n))),And(FreeQ(List(a,b),x),PositiveIntegerQ(Power(n,CN1))))),
ISetDelayed(Int(Csch(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Times(Power(n,CN1),Subst(Int(Times(Power(x,Plus(Power(n,CN1),Times(CN1,C1))),Csch(Plus(a,Times(b,x)))),x),x,Power(x,n))),And(FreeQ(List(a,b),x),PositiveIntegerQ(Power(n,CN1))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sech(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(n,CN1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,CN1))),Times(CN1,C1))),Power(Sech(Plus(a,Times(b,x))),p)),x),x,Power(x,n))),And(FreeQ(List(a,b,m,n,p),x),PositiveIntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Csch(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_DEFAULT)),x_Symbol),
    Condition(Times(Power(n,CN1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,CN1))),Times(CN1,C1))),Power(Csch(Plus(a,Times(b,x))),p)),x),x,Power(x,n))),And(FreeQ(List(a,b,m,n,p),x),PositiveIntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1))))))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Sech(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Sech(Plus(a,Times(b,Power(x,n)))),p)),x),FreeQ(List(a,b,m,n,p),x))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),Power(Csch(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_)))),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(x,m),Power(Csch(Plus(a,Times(b,Power(x,n)))),p)),x),FreeQ(List(a,b,m,n,p),x)))
  );
}
