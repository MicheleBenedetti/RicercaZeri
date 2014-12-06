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
public class IntRules27 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(x,Times(p,q)),Plus($s("A"),Times($s("B"),Power(x,Plus(n,Times(CN1,q))))),Power(Plus(a,Times(b,Power(x,Plus(n,Times(CN1,q)))),Times(c,Power(x,Times(C2,Plus(n,Times(CN1,q)))))),p)),x),And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),n,q),x),ZeroQ(Plus(r,Times(CN1,Plus(n,Times(CN1,q)))))),ZeroQ(Plus(j,Times(CN1,Plus(Times(C2,n),Times(CN1,q)))))),IntegerQ(p)),PosQ(Plus(n,Times(CN1,q)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,j_DEFAULT))),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,r_DEFAULT))),CN1D2)),x_Symbol),
    Condition(Times(Power(x,Times(C1D2,q)),Sqrt(Plus(a,Times(b,Power(x,Plus(n,Times(CN1,q)))),Times(c,Power(x,Times(C2,Plus(n,Times(CN1,q))))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Times(CN1,q))))),CN1D2),Int(Times(Plus($s("A"),Times($s("B"),Power(x,Plus(n,Times(CN1,q))))),Power(Times(Power(x,Times(C1D2,q)),Sqrt(Plus(a,Times(b,Power(x,Plus(n,Times(CN1,q)))),Times(c,Power(x,Times(C2,Plus(n,Times(CN1,q)))))))),CN1)),x)),And(And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),n,q),x),ZeroQ(Plus(j,Times(CN1,Plus(n,Times(CN1,q)))))),ZeroQ(Plus(r,Times(CN1,Plus(Times(C2,n),Times(CN1,q)))))),PosQ(Plus(n,Times(CN1,q)))),ZeroQ(Plus(n,Times(CN1,C3)))),ZeroQ(Plus(q,Times(CN1,C2)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Times(x,Plus(Times(b,$s("B"),Plus(n,Times(CN1,q)),p),Times($s("A"),c,Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),Plus(Times(C2,p),C1)),C1)),Times($s("B"),c,Plus(Times(p,Plus(Times(C2,n),Times(CN1,q))),C1),Power(x,Plus(n,Times(CN1,q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Times(CN1,q))))),p),Power(Times(c,Plus(Times(p,Plus(Times(C2,n),Times(CN1,q))),C1),Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),Plus(Times(C2,p),C1)),C1)),CN1)),Times(Plus(n,Times(CN1,q)),p,Power(Times(c,Plus(Times(p,Plus(Times(C2,n),Times(CN1,q))),C1),Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),Plus(Times(C2,p),C1)),C1)),CN1),Int(Times(Power(x,q),Plus(Times(C2,a,$s("A"),c,Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),Plus(Times(C2,p),C1)),C1)),Times(CN1,a,b,$s("B"),Plus(Times(p,q),C1)),Times(Plus(Times(C2,a,$s("B"),c,Plus(Times(p,Plus(Times(C2,n),Times(CN1,q))),C1)),Times($s("A"),b,c,Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),Plus(Times(C2,p),C1)),C1)),Times(CN1,Sqr(b),$s("B"),Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),p),C1))),Power(x,Plus(n,Times(CN1,q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Times(CN1,q))))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),n,q),x),ZeroQ(Plus(r,Times(CN1,Plus(n,Times(CN1,q)))))),ZeroQ(Plus(j,Times(CN1,Plus(Times(C2,n),Times(CN1,q)))))),Not(IntegerQ(p))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),RationalQ(p)),Greater(p,C0)),NonzeroQ(Plus(Times(p,Plus(Times(C2,n),Times(CN1,q))),C1))),NonzeroQ(Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),Plus(Times(C2,p),C1)),C1))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(Plus(Times(c_DEFAULT,Power(x_,j_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT))),p_)),x_Symbol),
    Condition(Module(List(Set(n,Plus(q,r))),Condition(Plus(Times(x,Plus(Times($s("A"),Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),Plus(Times(C2,p),C1)),C1)),Times($s("B"),Plus(Times(p,Plus(Times(C2,n),Times(CN1,q))),C1),Power(x,Plus(n,Times(CN1,q))))),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Times(CN1,q))))),p),Power(Times(Plus(Times(p,Plus(Times(C2,n),Times(CN1,q))),C1),Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),Plus(Times(C2,p),C1)),C1)),CN1)),Times(Plus(n,Times(CN1,q)),p,Power(Times(Plus(Times(p,Plus(Times(C2,n),Times(CN1,q))),C1),Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),Plus(Times(C2,p),C1)),C1)),CN1),Int(Times(Power(x,q),Plus(Times(C2,a,$s("A"),Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),Plus(Times(C2,p),C1)),C1)),Times(C2,a,$s("B"),Plus(Times(p,Plus(Times(C2,n),Times(CN1,q))),C1),Power(x,Plus(n,Times(CN1,q))))),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Times(CN1,q))))),Plus(p,Times(CN1,C1)))),x))),And(And(ZeroQ(Plus(j,Times(CN1,Plus(Times(C2,n),Times(CN1,q))))),NonzeroQ(Plus(Times(p,Plus(Times(C2,n),Times(CN1,q))),C1))),NonzeroQ(Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),Plus(Times(C2,p),C1)),C1))))),And(And(And(FreeQ(List(a,c,$s("A"),$s("B"),q),x),Not(IntegerQ(p))),RationalQ(p)),Greater(p,C0)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,j_DEFAULT))),p_)),x_Symbol),
    Condition(Plus(Times(CN1,Power(x,Plus(Times(CN1,q),C1)),Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(CN1,C2,a,$s("A"),c),Times(Plus(Times($s("A"),b),Times(CN1,C2,a,$s("B"))),c,Power(x,Plus(n,Times(CN1,q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Times(CN1,q))))),Plus(p,C1)),Power(Times(a,Plus(n,Times(CN1,q)),Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),CN1)),Times(Power(Times(a,Plus(n,Times(CN1,q)),Plus(p,C1),Plus(Sqr(b),Times(CN1,C4,a,c))),CN1),Int(Times(Power(x,Times(CN1,q)),Plus(Times($s("A"),Sqr(b),Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),Plus(p,C1)),C1)),Times(CN1,a,b,$s("B"),Plus(Times(p,q),C1)),Times(CN1,C2,a,$s("A"),c,Plus(Times(p,q),Times(C2,Plus(n,Times(CN1,q)),Plus(p,C1)),C1)),Times(Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),Plus(Times(C2,p),C3)),C1),Plus(Times($s("A"),b),Times(CN1,C2,a,$s("B"))),c,Power(x,Plus(n,Times(CN1,q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Times(CN1,q))))),Plus(p,C1))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),n,q),x),ZeroQ(Plus(r,Times(CN1,Plus(n,Times(CN1,q)))))),ZeroQ(Plus(j,Times(CN1,Plus(Times(C2,n),Times(CN1,q)))))),Not(IntegerQ(p))),NonzeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,r_DEFAULT))),Power(Plus(Times(c_DEFAULT,Power(x_,j_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT))),p_)),x_Symbol),
    Condition(Module(List(Set(n,Plus(q,r))),Condition(Plus(Times(CN1,Power(x,Plus(Times(CN1,q),C1)),Plus(Times(a,$s("A"),c),Times(a,$s("B"),c,Power(x,Plus(n,Times(CN1,q))))),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Times(CN1,q))))),Plus(p,C1)),Power(Times(a,Plus(n,Times(CN1,q)),Plus(p,C1),C2,a,c),CN1)),Times(Power(Times(a,Plus(n,Times(CN1,q)),Plus(p,C1),C2,a,c),CN1),Int(Times(Power(x,Times(CN1,q)),Plus(Times(a,$s("A"),c,Plus(Times(p,q),Times(C2,Plus(n,Times(CN1,q)),Plus(p,C1)),C1)),Times(a,$s("B"),c,Plus(Times(p,q),Times(Plus(n,Times(CN1,q)),Plus(Times(C2,p),C3)),C1),Power(x,Plus(n,Times(CN1,q))))),Power(Plus(Times(a,Power(x,q)),Times(c,Power(x,Plus(Times(C2,n),Times(CN1,q))))),Plus(p,C1))),x))),ZeroQ(Plus(j,Times(CN1,Plus(Times(C2,n),Times(CN1,q))))))),And(And(And(FreeQ(List(a,c,$s("A"),$s("B"),q),x),Not(IntegerQ(p))),RationalQ(p)),Less(p,CN1)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(x_,j_DEFAULT))),Power(Plus(Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(a_DEFAULT,Power(x_,q_DEFAULT)),Times(c_DEFAULT,Power(x_,r_DEFAULT))),p_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Plus($s("A"),Times($s("B"),Power(x,Plus(n,Times(CN1,q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Times(CN1,q))))),p)),x),And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),n,p,q),x),ZeroQ(Plus(j,Times(CN1,Plus(n,Times(CN1,q)))))),ZeroQ(Plus(r,Times(CN1,Plus(Times(C2,n),Times(CN1,q)))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),Power(u_,j_DEFAULT))),Power(Plus(Times(a_DEFAULT,Power(v_,q_DEFAULT)),Times(b_DEFAULT,Power(w_,n_DEFAULT)),Times(c_DEFAULT,Power(z_,r_DEFAULT))),p_)),x_Symbol),
    Condition(Times(Power(Coefficient(u,x,C1),CN1),Subst(Int(Times(Plus($s("A"),Times($s("B"),Power(x,Plus(n,Times(CN1,q))))),Power(Plus(Times(a,Power(x,q)),Times(b,Power(x,n)),Times(c,Power(x,Plus(Times(C2,n),Times(CN1,q))))),p)),x),x,u)),And(And(And(And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),n,p,q),x),ZeroQ(Plus(j,Times(CN1,Plus(n,Times(CN1,q)))))),ZeroQ(Plus(r,Times(CN1,Plus(Times(C2,n),Times(CN1,q)))))),ZeroQ(Plus(u,Times(CN1,v)))),ZeroQ(Plus(u,Times(CN1,w)))),ZeroQ(Plus(u,Times(CN1,z)))),LinearQ(u,x)),NonzeroQ(Plus(u,Times(CN1,x)))))),
ISetDelayed(Int(Times(z_,Power(u_,p_DEFAULT)),x_Symbol),
    Condition(Int(Times(ExpandToSum(z,x),Power(ExpandToSum(u,x),p)),x),And(And(And(And(FreeQ(p,x),BinomialQ(z,x)),GeneralizedTrinomialQ(u,x)),ZeroQ(Plus(BinomialDegree(z,x),Times(CN1,GeneralizedTrinomialDegree(u,x))))),Not(And(BinomialMatchQ(z,x),GeneralizedTrinomialMatchQ(u,x))))))
  );
}
