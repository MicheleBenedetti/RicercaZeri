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
public class IntRules74 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§sec"),Plus(c_DEFAULT,Times($p(d,true),x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus(c_DEFAULT,Times($p(d,true),x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times($p(d,true),x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(b,CN2),Int(Times(Power(Plus(a,Times(b,Sec(Plus(c,Times(d,x))))),Plus(m,C1)),Simp(Plus(Times(b,$s("B")),Times(CN1,a,$s("C")),Times(b,$s("C"),Sec(Plus(c,Times(d,x))))),x)),x)),And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),$s("C"),m),x),ZeroQ(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§csc"),Plus(c_DEFAULT,Times($p(d,true),x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus(c_DEFAULT,Times($p(d,true),x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(c_DEFAULT,Times($p(d,true),x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times(Power(b,CN2),Int(Times(Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),Plus(m,C1)),Simp(Plus(Times(b,$s("B")),Times(CN1,a,$s("C")),Times(b,$s("C"),Csc(Plus(c,Times(d,x))))),x)),x)),And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),$s("C"),m),x),ZeroQ(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§sec"),Plus(c_DEFAULT,Times($p(d,true),x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times($p(d,true),x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times($s("C"),Power(b,CN2),Int(Times(Power(Plus(a,Times(b,Sec(Plus(c,Times(d,x))))),Plus(m,C1)),Simp(Plus(Times(CN1,a),Times(b,Sec(Plus(c,Times(d,x))))),x)),x)),And(FreeQ(List(a,b,c,d,$s("A"),$s("C"),m),x),ZeroQ(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§csc"),Plus(c_DEFAULT,Times($p(d,true),x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(c_DEFAULT,Times($p(d,true),x_))))),m_DEFAULT)),x_Symbol),
    Condition(Times($s("C"),Power(b,CN2),Int(Times(Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),Plus(m,C1)),Simp(Plus(Times(CN1,a),Times(b,Csc(Plus(c,Times(d,x))))),x)),x)),And(FreeQ(List(a,b,c,d,$s("A"),$s("C"),m),x),ZeroQ(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Times(CN1,$s("A"),Tan(Plus(e,Times(f,x))),Power(Times(b,Sec(Plus(e,Times(f,x)))),m),Power(Times(f,m),CN1)),And(FreeQ(List(b,e,f,$s("A"),$s("C"),m),x),ZeroQ(Plus(Times($s("C"),m),Times($s("A"),Plus(m,C1))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Times($s("A"),Cot(Plus(e,Times(f,x))),Power(Times(b,Csc(Plus(e,Times(f,x)))),m),Power(Times(f,m),CN1)),And(FreeQ(List(b,e,f,$s("A"),$s("C"),m),x),ZeroQ(Plus(Times($s("C"),m),Times($s("A"),Plus(m,C1))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,$s("A"),Tan(Plus(e,Times(f,x))),Power(Times(b,Sec(Plus(e,Times(f,x)))),m),Power(Times(f,m),CN1)),Times(Plus(Times($s("C"),m),Times($s("A"),Plus(m,C1))),Power(Times(Sqr(b),m),CN1),Int(Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(m,C2)),x))),And(And(And(FreeQ(List(b,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Times($s("C"),m),Times($s("A"),Plus(m,C1))))),RationalQ(m)),LessEqual(m,CN1)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("A"),Cot(Plus(e,Times(f,x))),Power(Times(b,Csc(Plus(e,Times(f,x)))),m),Power(Times(f,m),CN1)),Times(Plus(Times($s("C"),m),Times($s("A"),Plus(m,C1))),Power(Times(Sqr(b),m),CN1),Int(Power(Times(b,Csc(Plus(e,Times(f,x)))),Plus(m,C2)),x))),And(And(And(FreeQ(List(b,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Times($s("C"),m),Times($s("A"),Plus(m,C1))))),RationalQ(m)),LessEqual(m,CN1)))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("C"),Tan(Plus(e,Times(f,x))),Power(Times(b,Sec(Plus(e,Times(f,x)))),m),Power(Times(f,Plus(m,C1)),CN1)),Times(Plus(Times($s("C"),m),Times($s("A"),Plus(m,C1))),Power(Plus(m,C1),CN1),Int(Power(Times(b,Sec(Plus(e,Times(f,x)))),m),x))),And(And(FreeQ(List(b,e,f,$s("A"),$s("C"),m),x),NonzeroQ(Plus(Times($s("C"),m),Times($s("A"),Plus(m,C1))))),Not(And(RationalQ(m),LessEqual(m,CN1)))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,$s("C"),Cot(Plus(e,Times(f,x))),Power(Times(b,Csc(Plus(e,Times(f,x)))),m),Power(Times(f,Plus(m,C1)),CN1)),Times(Plus(Times($s("C"),m),Times($s("A"),Plus(m,C1))),Power(Plus(m,C1),CN1),Int(Power(Times(b,Csc(Plus(e,Times(f,x)))),m),x))),And(And(FreeQ(List(b,e,f,$s("A"),$s("C"),m),x),NonzeroQ(Plus(Times($s("C"),m),Times($s("A"),Plus(m,C1))))),Not(And(RationalQ(m),LessEqual(m,CN1)))))),
ISetDelayed(Int(Times(Plus(Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),Times($p("B",true),$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),Power(Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("B"),Power(b,CN1),Int(Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(m,C1)),x)),Times($s("C"),Power(b,CN2),Int(Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(m,C2)),x))),FreeQ(List(b,e,f,$s("B"),$s("C"),m),x))),
ISetDelayed(Int(Times(Plus(Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),Times($p("B",true),$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),Power(Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("B"),Power(b,CN1),Int(Power(Times(b,Csc(Plus(e,Times(f,x)))),Plus(m,C1)),x)),Times($s("C"),Power(b,CN2),Int(Power(Times(b,Csc(Plus(e,Times(f,x)))),Plus(m,C2)),x))),FreeQ(List(b,e,f,$s("B"),$s("C"),m),x))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("B"),Power(b,CN1),Int(Power(Times(b,Sec(Plus(e,Times(f,x)))),Plus(m,C1)),x)),Int(Times(Plus($s("A"),Times($s("C"),Sqr(Sec(Plus(e,Times(f,x)))))),Power(Times(b,Sec(Plus(e,Times(f,x)))),m)),x)),FreeQ(List(b,e,f,$s("A"),$s("B"),$s("C"),m),x))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("B"),Power(b,CN1),Int(Power(Times(b,Csc(Plus(e,Times(f,x)))),Plus(m,C1)),x)),Int(Times(Plus($s("A"),Times($s("C"),Sqr(Csc(Plus(e,Times(f,x)))))),Power(Times(b,Csc(Plus(e,Times(f,x)))),m)),x)),FreeQ(List(b,e,f,$s("A"),$s("B"),$s("C"),m),x))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(b,$s("C"),Sec(Plus(e,Times(f,x))),Tan(Plus(e,Times(f,x))),Power(Times(C2,f),CN1)),Times(C1D2,Int(Simp(Plus(Times(C2,$s("A"),a),Times(Plus(Times(C2,$s("B"),a),Times(b,Plus(Times(C2,$s("A")),$s("C")))),Sec(Plus(e,Times(f,x)))),Times(C2,Plus(Times(a,$s("C")),Times($s("B"),b)),Sqr(Sec(Plus(e,Times(f,x)))))),x),x))),FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(CN1,b,$s("C"),Csc(Plus(e,Times(f,x))),Cot(Plus(e,Times(f,x))),Power(Times(C2,f),CN1)),Times(C1D2,Int(Simp(Plus(Times(C2,$s("A"),a),Times(Plus(Times(C2,$s("B"),a),Times(b,Plus(Times(C2,$s("A")),$s("C")))),Csc(Plus(e,Times(f,x)))),Times(C2,Plus(Times(a,$s("C")),Times($s("B"),b)),Sqr(Csc(Plus(e,Times(f,x)))))),x),x))),FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(b,$s("C"),Sec(Plus(e,Times(f,x))),Tan(Plus(e,Times(f,x))),Power(Times(C2,f),CN1)),Times(C1D2,Int(Simp(Plus(Times(C2,$s("A"),a),Times(b,Plus(Times(C2,$s("A")),$s("C")),Sec(Plus(e,Times(f,x)))),Times(C2,a,$s("C"),Sqr(Sec(Plus(e,Times(f,x)))))),x),x))),FreeQ(List(a,b,e,f,$s("A"),$s("C")),x))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(CN1,b,$s("C"),Csc(Plus(e,Times(f,x))),Cot(Plus(e,Times(f,x))),Power(Times(C2,f),CN1)),Times(C1D2,Int(Simp(Plus(Times(C2,$s("A"),a),Times(b,Plus(Times(C2,$s("A")),$s("C")),Csc(Plus(e,Times(f,x)))),Times(C2,a,$s("C"),Sqr(Csc(Plus(e,Times(f,x)))))),x),x))),FreeQ(List(a,b,e,f,$s("A"),$s("C")),x))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times($s("C"),Power(b,CN1),Int(Sec(Plus(e,Times(f,x))),x)),Times(Power(b,CN1),Int(Times(Plus(Times($s("A"),b),Times(Plus(Times(b,$s("B")),Times(CN1,a,$s("C"))),Sec(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1)),x))),FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times($s("C"),Power(b,CN1),Int(Csc(Plus(e,Times(f,x))),x)),Times(Power(b,CN1),Int(Times(Plus(Times($s("A"),b),Times(Plus(Times(b,$s("B")),Times(CN1,a,$s("C"))),Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1)),x))),FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times($s("C"),Power(b,CN1),Int(Sec(Plus(e,Times(f,x))),x)),Times(Power(b,CN1),Int(Times(Plus(Times($s("A"),b),Times(CN1,a,$s("C"),Sec(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1)),x))),FreeQ(List(a,b,e,f,$s("A"),$s("C")),x))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times($s("C"),Power(b,CN1),Int(Csc(Plus(e,Times(f,x))),x)),Times(Power(b,CN1),Int(Times(Plus(Times($s("A"),b),Times(CN1,a,$s("C"),Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1)),x))),FreeQ(List(a,b,e,f,$s("A"),$s("C")),x))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,$s("A")),Times(CN1,b,$s("B")),Times(a,$s("C"))),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(a,f,Plus(Times(C2,m),C1)),CN1)),Times(Power(Times(a,b,Plus(Times(C2,m),C1)),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times($s("A"),b,Plus(Times(C2,m),C1)),Times(Plus(Times(b,$s("B"),Plus(m,C1)),Times(CN1,a,Plus(Times($s("A"),Plus(m,C1)),Times(CN1,$s("C"),m)))),Sec(Plus(e,Times(f,x))))),x)),x))),And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Less(m,CN1D2)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times(a,$s("A")),Times(CN1,b,$s("B")),Times(a,$s("C"))),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(a,f,Plus(Times(C2,m),C1)),CN1)),Times(Power(Times(a,b,Plus(Times(C2,m),C1)),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times($s("A"),b,Plus(Times(C2,m),C1)),Times(Plus(Times(b,$s("B"),Plus(m,C1)),Times(CN1,a,Plus(Times($s("A"),Plus(m,C1)),Times(CN1,$s("C"),m)))),Csc(Plus(e,Times(f,x))))),x)),x))),And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Less(m,CN1D2)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(a,Plus($s("A"),$s("C")),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(a,f,Plus(Times(C2,m),C1)),CN1)),Times(Power(Times(a,b,Plus(Times(C2,m),C1)),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times($s("A"),b,Plus(Times(C2,m),C1)),Times(CN1,a,Plus(Times($s("A"),Plus(m,C1)),Times(CN1,$s("C"),m)),Sec(Plus(e,Times(f,x))))),x)),x))),And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C")),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Less(m,CN1D2)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,a,Plus($s("A"),$s("C")),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(a,f,Plus(Times(C2,m),C1)),CN1)),Times(Power(Times(a,b,Plus(Times(C2,m),C1)),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times($s("A"),b,Plus(Times(C2,m),C1)),Times(CN1,a,Plus(Times($s("A"),Plus(m,C1)),Times(CN1,$s("C"),m)),Csc(Plus(e,Times(f,x))))),x)),x))),And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C")),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Less(m,CN1D2)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("C"),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(f,Plus(m,C1)),CN1)),Times(Power(Times(b,Plus(m,C1)),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Simp(Plus(Times($s("A"),b,Plus(m,C1)),Times(Plus(Times(a,$s("C"),m),Times(b,$s("B"),Plus(m,C1))),Sec(Plus(e,Times(f,x))))),x)),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C"),m),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),Not(And(RationalQ(m),Less(m,CN1D2)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,$s("C"),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(f,Plus(m,C1)),CN1)),Times(Power(Times(b,Plus(m,C1)),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Simp(Plus(Times($s("A"),b,Plus(m,C1)),Times(Plus(Times(a,$s("C"),m),Times(b,$s("B"),Plus(m,C1))),Csc(Plus(e,Times(f,x))))),x)),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C"),m),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),Not(And(RationalQ(m),Less(m,CN1D2)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("C"),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(f,Plus(m,C1)),CN1)),Times(Power(Times(b,Plus(m,C1)),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Simp(Plus(Times($s("A"),b,Plus(m,C1)),Times(a,$s("C"),m,Sec(Plus(e,Times(f,x))))),x)),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C"),m),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),Not(And(RationalQ(m),Less(m,CN1D2)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,$s("C"),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(f,Plus(m,C1)),CN1)),Times(Power(Times(b,Plus(m,C1)),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Simp(Plus(Times($s("A"),b,Plus(m,C1)),Times(a,$s("C"),m,Csc(Plus(e,Times(f,x))))),x)),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C"),m),x),ZeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),Not(And(RationalQ(m),Less(m,CN1D2)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("C"),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(f,Plus(m,C1)),CN1)),Times(Power(Plus(m,C1),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,Times(CN1,C1))),Simp(Plus(Times(a,$s("A"),Plus(m,C1)),Times(Plus(Times(Plus(Times($s("A"),b),Times(a,$s("B"))),Plus(m,C1)),Times(b,$s("C"),m)),Sec(Plus(e,Times(f,x)))),Times(Plus(Times(b,$s("B"),Plus(m,C1)),Times(a,$s("C"),m)),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),PositiveIntegerQ(Times(C2,m))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,$s("C"),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(f,Plus(m,C1)),CN1)),Times(Power(Plus(m,C1),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Times(CN1,C1))),Simp(Plus(Times(a,$s("A"),Plus(m,C1)),Times(Plus(Times(Plus(Times($s("A"),b),Times(a,$s("B"))),Plus(m,C1)),Times(b,$s("C"),m)),Csc(Plus(e,Times(f,x)))),Times(Plus(Times(b,$s("B"),Plus(m,C1)),Times(a,$s("C"),m)),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),PositiveIntegerQ(Times(C2,m))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times($s("C"),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Power(Times(f,Plus(m,C1)),CN1)),Times(Power(Plus(m,C1),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,Times(CN1,C1))),Simp(Plus(Times(a,$s("A"),Plus(m,C1)),Times(Plus(Times($s("A"),b,Plus(m,C1)),Times(b,$s("C"),m)),Sec(Plus(e,Times(f,x)))),Times(a,$s("C"),m,Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),PositiveIntegerQ(Times(C2,m))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_DEFAULT)),x_Symbol),
    Condition(Plus(Times(CN1,$s("C"),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(f,Plus(m,C1)),CN1)),Times(Power(Plus(m,C1),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Times(CN1,C1))),Simp(Plus(Times(a,$s("A"),Plus(m,C1)),Times(Plus(Times($s("A"),b,Plus(m,C1)),Times(b,$s("C"),m)),Csc(Plus(e,Times(f,x)))),Times(a,$s("C"),m,Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),PositiveIntegerQ(Times(C2,m))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Int(Times(Plus($s("A"),Times(Plus($s("B"),Times(CN1,$s("C"))),Sec(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x),Times($s("C"),Int(Times(Sec(Plus(e,Times(f,x))),Plus(C1,Sec(Plus(e,Times(f,x)))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x))),And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("B",true),$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Int(Times(Plus($s("A"),Times(Plus($s("B"),Times(CN1,$s("C"))),Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),Times($s("C"),Int(Times(Csc(Plus(e,Times(f,x))),Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x))),And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Int(Times(Plus($s("A"),Times(CN1,$s("C"),Sec(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x),Times($s("C"),Int(Times(Sec(Plus(e,Times(f,x))),Plus(C1,Sec(Plus(e,Times(f,x)))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),CN1D2)),x))),And(FreeQ(List(a,b,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus($p("A"),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Int(Times(Plus($s("A"),Times(CN1,$s("C"),Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),Times($s("C"),Int(Times(Csc(Plus(e,Times(f,x))),Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x))),And(FreeQ(List(a,b,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(a,f,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(Power(Times(a,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times($s("A"),Plus(Sqr(a),Times(CN1,Sqr(b))),Plus(m,C1)),Times(CN1,a,Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times(b,$s("C"))),Plus(m,C1),Sec(Plus(e,Times(f,x)))),Times(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))),Plus(m,C2),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),IntegerQ(Times(C2,m))),Less(m,CN1)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(a,f,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(Power(Times(a,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times($s("A"),Plus(Sqr(a),Times(CN1,Sqr(b))),Plus(m,C1)),Times(CN1,a,Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times(b,$s("C"))),Plus(m,C1),Csc(Plus(e,Times(f,x)))),Times(Plus(Times($s("A"),Sqr(b)),Times(CN1,a,b,$s("B")),Times(Sqr(a),$s("C"))),Plus(m,C2),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Less(m,CN1)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(CN1,Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(a,f,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(Power(Times(a,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times($s("A"),Plus(Sqr(a),Times(CN1,Sqr(b))),Plus(m,C1)),Times(CN1,a,b,Plus($s("A"),$s("C")),Plus(m,C1),Sec(Plus(e,Times(f,x)))),Times(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))),Plus(m,C2),Sqr(Sec(Plus(e,Times(f,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),IntegerQ(Times(C2,m))),Less(m,CN1)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(a,f,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(Power(Times(a,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Plus(Times($s("A"),Plus(Sqr(a),Times(CN1,Sqr(b))),Plus(m,C1)),Times(CN1,a,b,Plus($s("A"),$s("C")),Plus(m,C1),Csc(Plus(e,Times(f,x)))),Times(Plus(Times($s("A"),Sqr(b)),Times(Sqr(a),$s("C"))),Plus(m,C2),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x))),And(And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C")),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),IntegerQ(Times(C2,m))),Less(m,CN1)))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(Power(b,CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Plus(Times($s("A"),b),Times(Plus(Times(b,$s("B")),Times(CN1,a,$s("C"))),Sec(Plus(e,Times(f,x)))))),x)),Times($s("C"),Power(b,CN1),Int(Times(Sec(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1))),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C"),m),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),Not(IntegerQ(Times(C2,m)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(Power(b,CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Plus(Times($s("A"),b),Times(Plus(Times(b,$s("B")),Times(CN1,a,$s("C"))),Csc(Plus(e,Times(f,x)))))),x)),Times($s("C"),Power(b,CN1),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1))),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("B"),$s("C"),m),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),Not(IntegerQ(Times(C2,m)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(Power(b,CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),m),Plus(Times($s("A"),b),Times(CN1,a,$s("C"),Sec(Plus(e,Times(f,x)))))),x)),Times($s("C"),Power(b,CN1),Int(Times(Sec(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),Plus(m,C1))),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C"),m),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),Not(IntegerQ(Times(C2,m)))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("C",true),Sqr($($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_)),x_Symbol),
    Condition(Plus(Times(Power(b,CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Plus(Times($s("A"),b),Times(CN1,a,$s("C"),Csc(Plus(e,Times(f,x)))))),x)),Times($s("C"),Power(b,CN1),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1))),x))),And(And(FreeQ(List(a,b,e,f,$s("A"),$s("C"),m),x),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),Not(IntegerQ(Times(C2,m))))))
  );
}
