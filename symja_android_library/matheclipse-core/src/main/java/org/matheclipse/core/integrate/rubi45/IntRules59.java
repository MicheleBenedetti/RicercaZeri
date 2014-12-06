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
public class IntRules59 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Times(Sqr(b),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(f,Plus(m,C1),Plus(Sqr(a),Sqr(b)),Plus(Times(b,c),Times(CN1,a,d))),CN1)),Times(Power(Times(Plus(m,C1),Plus(Sqr(a),Sqr(b)),Plus(Times(b,c),Times(CN1,a,d))),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Plus(Times(a,Plus(Times(b,c),Times(CN1,a,d)),Plus(m,C1)),Times(CN1,Sqr(b),d,Plus(m,n,C2)),Times(CN1,b,Plus(Times(b,c),Times(CN1,a,d)),Plus(m,C1),Tan(Plus(e,Times(f,x)))),Times(CN1,Sqr(b),d,Plus(m,n,C2),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))),IntegerQ(Times(C2,m))),Less(m,CN1)),Or(And(RationalQ(n),Less(n,C0)),IntegerQ(m))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,Sqr(b),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(f,Plus(m,C1),Plus(Sqr(a),Sqr(b)),Plus(Times(b,c),Times(CN1,a,d))),CN1)),Times(Power(Times(Plus(m,C1),Plus(Sqr(a),Sqr(b)),Plus(Times(b,c),Times(CN1,a,d))),CN1),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))),n),Simp(Plus(Times(a,Plus(Times(b,c),Times(CN1,a,d)),Plus(m,C1)),Times(CN1,Sqr(b),d,Plus(m,n,C2)),Times(CN1,b,Plus(Times(b,c),Times(CN1,a,d)),Plus(m,C1),Cot(Plus(e,Times(f,x)))),Times(CN1,Sqr(b),d,Plus(m,n,C2),Sqr(Cot(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))),IntegerQ(Times(C2,m))),Less(m,CN1)),Or(And(RationalQ(n),Less(n,C0)),IntegerQ(m))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Times(b,Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,Times(CN1,C1))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Power(Times(f,Plus(m,n,Times(CN1,C1))),CN1)),Times(Power(Plus(m,n,Times(CN1,C1)),CN1),Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,Times(CN1,C2))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,Times(CN1,C1))),Simp(Plus(Times(Sqr(a),c,Plus(m,n,Times(CN1,C1))),Times(CN1,b,Plus(Times(b,c,Plus(m,Times(CN1,C1))),Times(a,d,n))),Times(Plus(Times(C2,a,b,c),Times(Sqr(a),d),Times(CN1,Sqr(b),d)),Plus(m,n,Times(CN1,C1)),Tan(Plus(e,Times(f,x)))),Times(b,Plus(Times(b,c,n),Times(a,d,Plus(Times(C2,m),n,Times(CN1,C2)))),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))),RationalQ(m,n)),Greater(m,C1)),Greater(n,C0)),IntegerQ(Times(C2,n))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Times(CN1,b,Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,Times(CN1,C1))),Power(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))),n),Power(Times(f,Plus(m,n,Times(CN1,C1))),CN1)),Times(Power(Plus(m,n,Times(CN1,C1)),CN1),Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),Plus(m,Times(CN1,C2))),Power(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))),Plus(n,Times(CN1,C1))),Simp(Plus(Times(Sqr(a),c,Plus(m,n,Times(CN1,C1))),Times(CN1,b,Plus(Times(b,c,Plus(m,Times(CN1,C1))),Times(a,d,n))),Times(Plus(Times(C2,a,b,c),Times(Sqr(a),d),Times(CN1,Sqr(b),d)),Plus(m,n,Times(CN1,C1)),Cot(Plus(e,Times(f,x)))),Times(b,Plus(Times(b,c,n),Times(a,d,Plus(Times(C2,m),n,Times(CN1,C2)))),Sqr(Cot(Plus(e,Times(f,x)))))),x)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,f),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))),RationalQ(m,n)),Greater(m,C1)),Greater(n,C0)),IntegerQ(Times(C2,n))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),Plus(c_DEFAULT,Times($p(d,true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),CN1),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,c),Times(CN1,b,d)),x,Power(Times(Plus(Sqr(a),Sqr(b)),Plus(Sqr(c),Sqr(d))),CN1)),Times(Sqr(b),Power(Times(Plus(Times(b,c),Times(CN1,a,d)),Plus(Sqr(a),Sqr(b))),CN1),Int(Times(Plus(b,Times(CN1,a,Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1)),x)),Times(CN1,Sqr(d),Power(Times(Plus(Times(b,c),Times(CN1,a,d)),Plus(Sqr(c),Sqr(d))),CN1),Int(Times(Plus(d,Times(CN1,c,Tan(Plus(e,Times(f,x))))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))))),
ISetDelayed(Int(Power(Times(Plus(a_,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),Plus(c_DEFAULT,Times($p(d,true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),CN1),x_Symbol),
    Condition(Plus(Times(Plus(Times(a,c),Times(CN1,b,d)),x,Power(Times(Plus(Sqr(a),Sqr(b)),Plus(Sqr(c),Sqr(d))),CN1)),Times(Sqr(b),Power(Times(Plus(Times(b,c),Times(CN1,a,d)),Plus(Sqr(a),Sqr(b))),CN1),Int(Times(Plus(b,Times(CN1,a,Cot(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),CN1)),x)),Times(CN1,Sqr(d),Power(Times(Plus(Times(b,c),Times(CN1,a,d)),Plus(Sqr(c),Sqr(d))),CN1),Int(Times(Plus(d,Times(CN1,c,Cot(Plus(e,Times(f,x))))),Power(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(Power(Plus(Sqr(c),Sqr(d)),CN1),Int(Times(Simp(Plus(Times(a,c),Times(b,d),Times(Plus(Times(b,c),Times(CN1,a,d)),Tan(Plus(e,Times(f,x))))),x),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1D2)),x)),Times(CN1,d,Plus(Times(b,c),Times(CN1,a,d)),Power(Plus(Sqr(c),Sqr(d)),CN1),Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Times(Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Plus(c,Times(d,Tan(Plus(e,Times(f,x)))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(Power(Plus(Sqr(c),Sqr(d)),CN1),Int(Times(Simp(Plus(Times(a,c),Times(b,d),Times(Plus(Times(b,c),Times(CN1,a,d)),Cot(Plus(e,Times(f,x))))),x),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),CN1D2)),x)),Times(CN1,d,Plus(Times(b,c),Times(CN1,a,d)),Power(Plus(Sqr(c),Sqr(d)),CN1),Int(Times(Plus(C1,Sqr(Cot(Plus(e,Times(f,x))))),Power(Times(Sqrt(Plus(a,Times(b,Cot(Plus(e,Times(f,x)))))),Plus(c,Times(d,Cot(Plus(e,Times(f,x)))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),QQ(3L,2L)),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(Power(Plus(Sqr(c),Sqr(d)),CN1),Int(Times(Simp(Plus(Times(Sqr(a),c),Times(CN1,Sqr(b),c),Times(C2,a,b,d),Times(Plus(Times(C2,a,b,c),Times(CN1,Sqr(a),d),Times(Sqr(b),d)),Tan(Plus(e,Times(f,x))))),x),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1D2)),x)),Times(Sqr(Plus(Times(b,c),Times(CN1,a,d))),Power(Plus(Sqr(c),Sqr(d)),CN1),Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Times(Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Plus(c,Times(d,Tan(Plus(e,Times(f,x)))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),QQ(3L,2L)),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Plus(Times(Power(Plus(Sqr(c),Sqr(d)),CN1),Int(Times(Simp(Plus(Times(Sqr(a),c),Times(CN1,Sqr(b),c),Times(C2,a,b,d),Times(Plus(Times(C2,a,b,c),Times(CN1,Sqr(a),d),Times(Sqr(b),d)),Cot(Plus(e,Times(f,x))))),x),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),CN1D2)),x)),Times(Sqr(Plus(Times(b,c),Times(CN1,a,d))),Power(Plus(Sqr(c),Sqr(d)),CN1),Int(Times(Plus(C1,Sqr(Cot(Plus(e,Times(f,x))))),Power(Times(Sqrt(Plus(a,Times(b,Cot(Plus(e,Times(f,x)))))),Plus(c,Times(d,Cot(Plus(e,Times(f,x)))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Plus(a,Times(CN1,b,Tan(Plus(e,Times(f,x))))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n)),x)),Times(Sqr(b),Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))),Not(IntegerQ(n))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Times(Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Plus(a,Times(CN1,b,Cot(Plus(e,Times(f,x))))),Power(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))),n)),x)),Times(Sqr(b),Power(Plus(Sqr(a),Sqr(b)),CN1),Int(Times(Power(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))),n),Plus(C1,Sqr(Cot(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))),Not(IntegerQ(n))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Sqrt(Plus(c_,Times($p(d,true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Int(Times(Simp(Plus(Times(a,c),Times(CN1,b,d),Times(Plus(Times(b,c),Times(a,d)),Tan(Plus(e,Times(f,x))))),x),Power(Times(Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))))),CN1)),x),Times(b,d,Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Times(Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Sqrt(Plus(c_,Times($p(d,true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Int(Times(Simp(Plus(Times(a,c),Times(CN1,b,d),Times(Plus(Times(b,c),Times(a,d)),Cot(Plus(e,Times(f,x))))),x),Power(Times(Sqrt(Plus(a,Times(b,Cot(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))))),CN1)),x),Times(b,d,Int(Times(Plus(C1,Sqr(Cot(Plus(e,Times(f,x))))),Power(Times(Sqrt(Plus(a,Times(b,Cot(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Times(C1D2,CN1,Plus(Times(CI,a),b),Int(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Plus(CI,Times(CN1,Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1D2)),x)),Times(CN1,C1D2,Plus(Times(CI,a),Times(CN1,b)),Int(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Plus(CI,Tan(Plus(e,Times(f,x)))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1D2)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))),Not(And(RationalQ(n),Or(Greater(n,C0),LessEqual(n,CN1))))))),
ISetDelayed(Int(Times(Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_)))))),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Times(C1D2,CN1,Plus(Times(CI,a),b),Int(Times(Power(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))),n),Plus(CI,Times(CN1,Cot(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),CN1D2)),x)),Times(CN1,C1D2,Plus(Times(CI,a),Times(CN1,b)),Int(Times(Power(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))),n),Plus(CI,Cot(Plus(e,Times(f,x)))),Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),CN1D2)),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))),Not(And(RationalQ(n),Or(Greater(n,C0),LessEqual(n,CN1))))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),QQ(3L,2L)),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Int(Times(Simp(Plus(Sqr(a),Times(CN1,Sqr(b)),Times(C2,a,b,Tan(Plus(e,Times(f,x))))),x),Power(Times(Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))))),CN1)),x),Times(Sqr(b),Int(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Times(Sqrt(Plus(a,Times(b,Tan(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),QQ(3L,2L)),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Int(Times(Simp(Plus(Sqr(a),Times(CN1,Sqr(b)),Times(C2,a,b,Cot(Plus(e,Times(f,x))))),x),Power(Times(Sqrt(Plus(a,Times(b,Cot(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))))),CN1)),x),Times(Sqr(b),Int(Times(Plus(C1,Sqr(Cot(Plus(e,Times(f,x))))),Power(Times(Sqrt(Plus(a,Times(b,Cot(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§tan"),Plus($p(e,true),Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Plus(C1,Times(CN1,CI,Tan(Plus(e,Times(f,x)))))),x)),Times(C1D2,Int(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Plus(C1,Times(CI,Tan(Plus(e,Times(f,x)))))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))),Not(IntegerQ(m))))),
ISetDelayed(Int(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times($p(d,true),$($s("§cot"),Plus($p(e,true),Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Times(C1D2,Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))),n),Plus(C1,Times(CN1,CI,Cot(Plus(e,Times(f,x)))))),x)),Times(C1D2,Int(Times(Power(Plus(a,Times(b,Cot(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Cot(Plus(e,Times(f,x))))),n),Plus(C1,Times(CI,Cot(Plus(e,Times(f,x)))))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Sqr(a),Sqr(b)))),NonzeroQ(Plus(Sqr(c),Sqr(d)))),Not(IntegerQ(m)))))
  );
}
