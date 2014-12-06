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
public class IntRules61 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus($p("A"),Times($p("C",true),Sqr($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times($s("A"),Power(f,CN1),Subst(Int(Power(Plus(a,Times(b,x)),m),x),x,Tan(Plus(e,Times(f,x))))),And(FreeQ(List(a,b,e,f,$s("A"),$s("C"),m),x),ZeroQ(Plus($s("A"),Times(CN1,$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("C",true),Sqr($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,$s("A"),Power(f,CN1),Subst(Int(Power(Plus(a,Times(b,x)),m),x),x,Cot(Plus(e,Times(f,x))))),And(FreeQ(List(a,b,e,f,$s("A"),$s("C"),m),x),ZeroQ(Plus($s("A"),Times(CN1,$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(b,CN2),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(b,$s("B")),Times(CN1,a,$s("C")),Times(b,$s("C"),Tan(Plus(e,Times(f,x))))),x)),x)),And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C"),m),x),ZeroQ(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(b,CN2),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(b,$s("B")),Times(CN1,a,$s("C")),Times(b,$s("C"),Cot(Plus(e,Times(f,x))))),x)),x)),And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C"),m),x),ZeroQ(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,$s("C"),Power(b,CN2),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Plus(a,Times(CN1,b,Tan(Plus(e,Times(f,x)))))),x)),And(FreeQ(List(a,b,e,f,$s("A"),$s("C"),m),x),ZeroQ(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,$s("C"),Power(b,CN2),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Plus(a,Times(CN1,b,Cot(Plus(e,Times(f,x)))))),x)),And(FreeQ(List(a,b,e,f,$s("A"),$s("C"),m),x),ZeroQ(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(a,$s("A")),Times(b,$s("B")),Times(CN1,a,$s("C"))),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Times(C2,a,f,m),CN1)),Times(Power(Times(C2,Sqr(a),m),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(b,$s("B")),Times(CN1,a,$s("C")),Times(a,$s("A"),Plus(Times(C2,m),C1)),Times(CN1,Plus(Times(b,$s("C"),Plus(m,Times(CN1,C1))),Times(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Plus(m,C1))),Tan(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))))),RationalQ(m)),LessEqual(m,CN1)),ZeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,$s("A")),Times(b,$s("B")),Times(CN1,a,$s("C"))),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),m),Power(Times(C2,a,f,m),CN1)),Times(Power(Times(C2,Sqr(a),m),CN1),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(b,$s("B")),Times(CN1,a,$s("C")),Times(a,$s("A"),Plus(Times(C2,m),C1)),Times(CN1,Plus(Times(b,$s("C"),Plus(m,Times(CN1,C1))),Times(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Plus(m,C1))),Cot(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))))),RationalQ(m)),LessEqual(m,CN1)),ZeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(a,$s("A")),Times(CN1,a,$s("C"))),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Times(C2,a,f,m),CN1)),Times(Power(Times(C2,Sqr(a),m),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(CN1,a,$s("C")),Times(a,$s("A"),Plus(Times(C2,m),C1)),Times(CN1,Plus(Times(b,$s("C"),Plus(m,Times(CN1,C1))),Times($s("A"),b,Plus(m,C1))),Tan(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))))),RationalQ(m)),LessEqual(m,CN1)),ZeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,$s("A")),Times(CN1,a,$s("C"))),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),m),Power(Times(C2,a,f,m),CN1)),Times(Power(Times(C2,Sqr(a),m),CN1),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(CN1,a,$s("C")),Times(a,$s("A"),Plus(Times(C2,m),C1)),Times(CN1,Plus(Times(b,$s("C"),Plus(m,Times(CN1,C1))),Times($s("A"),b,Plus(m,C1))),Cot(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))))),RationalQ(m)),LessEqual(m,CN1)),ZeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,$s("A")),Times(b,$s("B")),Times(CN1,a,$s("C"))),x,Power(Plus(Sqr(a),Sqr(b)),CN1)),Times(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))),Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1)),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Sqr(b)))),ZeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times(CN1,b,$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,$s("A")),Times(b,$s("B")),Times(CN1,a,$s("C"))),x,Power(Plus(Sqr(a),Sqr(b)),CN1)),Times(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))),Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Plus(C1,Sqr(Cot(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),CN1)),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Sqr(b)))),ZeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times(CN1,b,$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))),CN1)),x_Symbol),
    Condition(Plus(Times($s("B"),x),Times($s("A"),Int(Power(Tan(Plus(e,Times(f,x))),CN1),x)),Times($s("C"),Int(Tan(Plus(e,Times(f,x))),x))),And(FreeQ(List(e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus($s("A"),Times(CN1,$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))),CN1)),x_Symbol),
    Condition(Plus(Times($s("B"),x),Times($s("A"),Int(Power(Cot(Plus(e,Times(f,x))),CN1),x)),Times($s("C"),Int(Cot(Plus(e,Times(f,x))),x))),And(FreeQ(List(e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus($s("A"),Times(CN1,$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("C",true),Sqr($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))),CN1)),x_Symbol),
    Condition(Plus(Times($s("A"),Int(Power(Tan(Plus(e,Times(f,x))),CN1),x)),Times($s("C"),Int(Tan(Plus(e,Times(f,x))),x))),And(FreeQ(List(e,f,$s("A"),$s("C")),x),NonzeroQ(Plus($s("A"),Times(CN1,$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("C",true),Sqr($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))),CN1)),x_Symbol),
    Condition(Plus(Times($s("A"),Int(Power(Cot(Plus(e,Times(f,x))),CN1),x)),Times($s("C"),Int(Cot(Plus(e,Times(f,x))),x))),And(FreeQ(List(e,f,$s("A"),$s("C")),x),NonzeroQ(Plus($s("A"),Times(CN1,$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,$s("A")),Times(b,$s("B")),Times(CN1,a,$s("C"))),x,Power(Plus(Sqr(a),Sqr(b)),CN1)),Times(CN1,Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times(CN1,b,$s("C"))),Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Tan(Plus(e,Times(f,x))),x)),Times(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))),Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times(CN1,b,$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,$s("A")),Times(b,$s("B")),Times(CN1,a,$s("C"))),x,Power(Plus(Sqr(a),Sqr(b)),CN1)),Times(CN1,Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times(CN1,b,$s("C"))),Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Cot(Plus(e,Times(f,x))),x)),Times(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))),Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Plus(C1,Sqr(Cot(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times(CN1,b,$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("C",true),Sqr($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(a,Plus($s("A"),Times(CN1,$s("C"))),x,Power(Plus(Sqr(a),Sqr(b)),CN1)),Times(CN1,b,Plus($s("A"),Times(CN1,$s("C"))),Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Tan(Plus(e,Times(f,x))),x)),Times(Plus(Times(Sqr(a),$s("C")),Times($s("A"),Sqr(b))),Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Times(Sqr(a),$s("C")),Times($s("A"),Sqr(b))))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus($s("A"),Times(CN1,$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("C",true),Sqr($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(a,Plus($s("A"),Times(CN1,$s("C"))),x,Power(Plus(Sqr(a),Sqr(b)),CN1)),Times(CN1,b,Plus($s("A"),Times(CN1,$s("C"))),Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Cot(Plus(e,Times(f,x))),x)),Times(Plus(Times(Sqr(a),$s("C")),Times($s("A"),Sqr(b))),Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Plus(C1,Sqr(Cot(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Times(Sqr(a),$s("C")),Times($s("A"),Sqr(b))))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus($s("A"),Times(CN1,$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1),Plus(Sqr(a),Sqr(b))),CN1)),Times(Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(b,$s("B")),Times(a,Plus($s("A"),Times(CN1,$s("C")))),Times(CN1,Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times(CN1,b,$s("C"))),Tan(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1),Plus(Sqr(a),Sqr(b))),CN1)),Times(Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(b,$s("B")),Times(a,Plus($s("A"),Times(CN1,$s("C")))),Times(CN1,Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times(CN1,b,$s("C"))),Cot(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1),Plus(Sqr(a),Sqr(b))),CN1)),Times(Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(a,Plus($s("A"),Times(CN1,$s("C")))),Times(CN1,Plus(Times($s("A"),b),Times(CN1,b,$s("C"))),Tan(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1),Plus(Sqr(a),Sqr(b))),CN1)),Times(Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times(a,Plus($s("A"),Times(CN1,$s("C")))),Times(CN1,Plus(Times($s("A"),b),Times(CN1,b,$s("C"))),Cot(Plus(e,Times(f,x))))),x)),x))),And(And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))))),RationalQ(m)),Less(m,CN1)),NonzeroQ(Plus(Sqr(a),Sqr(b)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("C"),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Simp(Plus($s("A"),Times(CN1,$s("C")),Times($s("B"),Tan(Plus(e,Times(f,x))))),x)),x)),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C"),m),x),NonzeroQ(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))))),Not(And(RationalQ(m),LessEqual(m,CN1)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,$s("C"),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),CN1)),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),m),Simp(Plus($s("A"),Times(CN1,$s("C")),Times($s("B"),Cot(Plus(e,Times(f,x))))),x)),x)),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C"),m),x),NonzeroQ(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))))),Not(And(RationalQ(m),LessEqual(m,CN1)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("C"),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),CN1)),Times(Plus($s("A"),Times(CN1,$s("C"))),Int(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C"),m),x),NonzeroQ(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))))),Not(And(RationalQ(m),LessEqual(m,CN1)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,$s("C"),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),CN1)),Times(Plus($s("A"),Times(CN1,$s("C"))),Int(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),m),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C"),m),x),NonzeroQ(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))))),Not(And(RationalQ(m),LessEqual(m,CN1))))))
  );
}
