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
public class IntRules31 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus(f_,Times(g_DEFAULT,Sqr(x_))),Power(Times(Plus($p(d),Times($p(e,true),x_),Times($p(d,true),Sqr(x_))),Sqrt(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times(b_DEFAULT,Power(x_,C3)),Times(a_DEFAULT,Power(x_,C4))))),CN1)),x_Symbol),
    Condition(Times(a,f,Power(Times(d,Rt(Times(Sqr(a),Plus(Times(C2,a),Times(CN1,c))),C2)),CN1),ArcTan(Times(Plus(Times(a,b),Times(Plus(Times(C4,Sqr(a)),Sqr(b),Times(CN1,C2,a,c)),x),Times(a,b,Sqr(x))),Power(Times(C2,Rt(Times(Sqr(a),Plus(Times(C2,a),Times(CN1,c))),C2),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)),Times(b,Power(x,C3)),Times(a,Power(x,C4))))),CN1)))),And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(Times(b,d),Times(CN1,a,e)))),ZeroQ(Plus(f,g))),PosQ(Times(Sqr(a),Plus(Times(C2,a),Times(CN1,c))))))),
ISetDelayed(Int(Times(Plus(f_,Times(g_DEFAULT,Sqr(x_))),Power(Times(Plus($p(d),Times($p(e,true),x_),Times($p(d,true),Sqr(x_))),Sqrt(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times(b_DEFAULT,Power(x_,C3)),Times(a_DEFAULT,Power(x_,C4))))),CN1)),x_Symbol),
    Condition(Times(CN1,a,f,Power(Times(d,Rt(Times(CN1,Sqr(a),Plus(Times(C2,a),Times(CN1,c))),C2)),CN1),ArcTanh(Times(Plus(Times(a,b),Times(Plus(Times(C4,Sqr(a)),Sqr(b),Times(CN1,C2,a,c)),x),Times(a,b,Sqr(x))),Power(Times(C2,Rt(Times(CN1,Sqr(a),Plus(Times(C2,a),Times(CN1,c))),C2),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)),Times(b,Power(x,C3)),Times(a,Power(x,C4))))),CN1)))),And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(Times(b,d),Times(CN1,a,e)))),ZeroQ(Plus(f,g))),NegQ(Times(Sqr(a),Plus(Times(C2,a),Times(CN1,c))))))),
ISetDelayed(Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times($p(d,true),Power(x_,C3)),Times($p(e,true),Power(x_,C4))),p_),x_Symbol),
    Condition(Subst(Int(SimplifyIntegrand(Power(Plus(a,Times(Power(d,C4),Power(Times(ZZ(256L),Power(e,C3)),CN1)),Times(CN1,b,d,Power(Times(C8,e),CN1)),Times(Plus(c,Times(CN1,C3,Sqr(d),Power(Times(C8,e),CN1))),Sqr(x)),Times(e,Power(x,C4))),p),x),x),x,Plus(Times(d,Power(Times(C4,e),CN1)),x)),And(And(And(FreeQ(List(a,b,c,d,e,p),x),ZeroQ(Plus(Power(d,C3),Times(CN1,C4,c,d,e),Times(C8,b,Sqr(e))))),UnsameQ(p,C2)),UnsameQ(p,C3)))),
ISetDelayed(Int(Power(v_,p_),x_Symbol),
    Condition(Module(List(Set(a,Coefficient(v,x,C0)),Set(b,Coefficient(v,x,C1)),Set(c,Coefficient(v,x,C2)),Set(d,Coefficient(v,x,C3)),Set(e,Coefficient(v,x,C4))),Condition(Subst(Int(SimplifyIntegrand(Power(Plus(a,Times(Power(d,C4),Power(Times(ZZ(256L),Power(e,C3)),CN1)),Times(CN1,b,d,Power(Times(C8,e),CN1)),Times(Plus(c,Times(CN1,C3,Sqr(d),Power(Times(C8,e),CN1))),Sqr(x)),Times(e,Power(x,C4))),p),x),x),x,Plus(Times(d,Power(Times(C4,e),CN1)),x)),And(ZeroQ(Plus(Power(d,C3),Times(CN1,C4,c,d,e),Times(C8,b,Sqr(e)))),NonzeroQ(d)))),And(And(And(And(FreeQ(p,x),PolynomialQ(v,x)),Equal(Exponent(v,x),C4)),UnsameQ(p,C2)),UnsameQ(p,C3)))),
ISetDelayed(Int(Times(u_,Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times($p(d,true),Power(x_,C3)),Times($p(e,true),Power(x_,C4))),p_)),x_Symbol),
    Condition(Subst(Int(SimplifyIntegrand(Times(ReplaceAll(u,Rule(x,Plus(Times(CN1,d,Power(Times(C4,e),CN1)),x))),Power(Plus(a,Times(Power(d,C4),Power(Times(ZZ(256L),Power(e,C3)),CN1)),Times(CN1,b,d,Power(Times(C8,e),CN1)),Times(Plus(c,Times(CN1,C3,Sqr(d),Power(Times(C8,e),CN1))),Sqr(x)),Times(e,Power(x,C4))),p)),x),x),x,Plus(Times(d,Power(Times(C4,e),CN1)),x)),And(And(And(FreeQ(List(a,b,c,d,e,p),x),PolynomialQ(u,x)),ZeroQ(Plus(Power(d,C3),Times(CN1,C4,c,d,e),Times(C8,b,Sqr(e))))),Not(PositiveIntegerQ(p))))),
ISetDelayed(Int(Times(u_,Power(v_,p_)),x_Symbol),
    Condition(Module(List(Set(a,Coefficient(v,x,C0)),Set(b,Coefficient(v,x,C1)),Set(c,Coefficient(v,x,C2)),Set(d,Coefficient(v,x,C3)),Set(e,Coefficient(v,x,C4))),Condition(Subst(Int(SimplifyIntegrand(Times(ReplaceAll(u,Rule(x,Plus(Times(CN1,d,Power(Times(C4,e),CN1)),x))),Power(Plus(a,Times(Power(d,C4),Power(Times(ZZ(256L),Power(e,C3)),CN1)),Times(CN1,b,d,Power(Times(C8,e),CN1)),Times(Plus(c,Times(CN1,C3,Sqr(d),Power(Times(C8,e),CN1))),Sqr(x)),Times(e,Power(x,C4))),p)),x),x),x,Plus(Times(d,Power(Times(C4,e),CN1)),x)),And(ZeroQ(Plus(Power(d,C3),Times(CN1,C4,c,d,e),Times(C8,b,Sqr(e)))),NonzeroQ(d)))),And(And(And(And(FreeQ(p,x),PolynomialQ(u,x)),PolynomialQ(v,x)),Equal(Exponent(v,x),C4)),Not(PositiveIntegerQ(p))))),
ISetDelayed(Int(Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times($p(d,true),Power(x_,C3)),Times($p(e,true),Power(x_,C4))),p_),x_Symbol),
    Condition(Times(ZZ(-16L),Sqr(a),Subst(Int(Times(Power(Plus(b,Times(CN1,C4,a,x)),CN2),Power(Times(a,Plus(Times(CN3,Power(b,C4)),Times(ZZ(16L),a,Sqr(b),c),Times(CN1,ZZ(64L),Sqr(a),b,d),Times(ZZ(256L),Power(a,C3),e),Times(CN1,ZZ(32L),Sqr(a),Plus(Times(C3,Sqr(b)),Times(CN1,C8,a,c)),Sqr(x)),Times(ZZ(256L),Power(a,C4),Power(x,C4))),Power(Plus(b,Times(CN1,C4,a,x)),CN4)),p)),x),x,Plus(Times(b,Power(Times(C4,a),CN1)),Power(x,CN1)))),And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Power(b,C3),Times(CN1,C4,a,b,c),Times(C8,Sqr(a),d)))),IntegerQ(Times(C2,p))))),
ISetDelayed(Int(Power(v_,p_),x_Symbol),
    Condition(Module(List(Set(a,Coefficient(v,x,C0)),Set(b,Coefficient(v,x,C1)),Set(c,Coefficient(v,x,C2)),Set(d,Coefficient(v,x,C3)),Set(e,Coefficient(v,x,C4))),Condition(Times(ZZ(-16L),Sqr(a),Subst(Int(Times(Power(Plus(b,Times(CN1,C4,a,x)),CN2),Power(Times(a,Plus(Times(CN3,Power(b,C4)),Times(ZZ(16L),a,Sqr(b),c),Times(CN1,ZZ(64L),Sqr(a),b,d),Times(ZZ(256L),Power(a,C3),e),Times(CN1,ZZ(32L),Sqr(a),Plus(Times(C3,Sqr(b)),Times(CN1,C8,a,c)),Sqr(x)),Times(ZZ(256L),Power(a,C4),Power(x,C4))),Power(Plus(b,Times(CN1,C4,a,x)),CN4)),p)),x),x,Plus(Times(b,Power(Times(C4,a),CN1)),Power(x,CN1)))),And(And(NonzeroQ(a),NonzeroQ(b)),ZeroQ(Plus(Power(b,C3),Times(CN1,C4,a,b,c),Times(C8,Sqr(a),d)))))),And(And(And(FreeQ(p,x),PolynomialQ(v,x)),Equal(Exponent(v,x),C4)),IntegerQ(Times(C2,p))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_),Times($p("C",true),Sqr(x_)),Times($p("D",true),Power(x_,C3))),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times($p(d,true),Power(x_,C3)),Times($p(e,true),Power(x_,C4))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Sqrt(Plus(Times(C8,Sqr(a)),Sqr(b),Times(CN1,C4,a,c))))),Plus(Times(Power(q,CN1),Int(Times(Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times($s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(CN1,C2,a,$s("C")),Times(b,$s("D")),Times($s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,q),x),Times(C2,a,Sqr(x))),CN1)),x)),Times(CN1,Power(q,CN1),Int(Times(Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times(CN1,$s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(CN1,C2,a,$s("C")),Times(b,$s("D")),Times(CN1,$s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,Times(CN1,q)),x),Times(C2,a,Sqr(x))),CN1)),x)))),And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),$s("C"),$s("D")),x),ZeroQ(Plus(d,Times(CN1,b)))),ZeroQ(Plus(e,Times(CN1,a)))),SumQ(Factor(Plus(a,Times(b,x),Times(c,Sqr(x)),Times(b,Power(x,C3)),Times(a,Power(x,C4)))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_),Times($p("D",true),Power(x_,C3))),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times($p(d,true),Power(x_,C3)),Times($p(e,true),Power(x_,C4))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Sqrt(Plus(Times(C8,Sqr(a)),Sqr(b),Times(CN1,C4,a,c))))),Plus(Times(Power(q,CN1),Int(Times(Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times($s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(b,$s("D")),Times($s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,q),x),Times(C2,a,Sqr(x))),CN1)),x)),Times(CN1,Power(q,CN1),Int(Times(Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times(CN1,$s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(b,$s("D")),Times(CN1,$s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,Times(CN1,q)),x),Times(C2,a,Sqr(x))),CN1)),x)))),And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),$s("D")),x),ZeroQ(Plus(d,Times(CN1,b)))),ZeroQ(Plus(e,Times(CN1,a)))),SumQ(Factor(Plus(a,Times(b,x),Times(c,Sqr(x)),Times(b,Power(x,C3)),Times(a,Power(x,C4)))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_),Times($p("C",true),Sqr(x_)),Times($p("D",true),Power(x_,C3))),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times($p(d,true),Power(x_,C3)),Times($p(e,true),Power(x_,C4))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Sqrt(Plus(Times(C8,Sqr(a)),Sqr(b),Times(CN1,C4,a,c))))),Plus(Times(Power(q,CN1),Int(Times(Power(x,m),Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times($s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(CN1,C2,a,$s("C")),Times(b,$s("D")),Times($s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,q),x),Times(C2,a,Sqr(x))),CN1)),x)),Times(CN1,Power(q,CN1),Int(Times(Power(x,m),Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times(CN1,$s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(CN1,C2,a,$s("C")),Times(b,$s("D")),Times(CN1,$s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,Times(CN1,q)),x),Times(C2,a,Sqr(x))),CN1)),x)))),And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),$s("C"),$s("D"),m),x),ZeroQ(Plus(d,Times(CN1,b)))),ZeroQ(Plus(e,Times(CN1,a)))),SumQ(Factor(Plus(a,Times(b,x),Times(c,Sqr(x)),Times(b,Power(x,C3)),Times(a,Power(x,C4)))))))),
ISetDelayed(Int(Times(Plus($p("A",true),Times($p("B",true),x_),Times($p("D",true),Power(x_,C3))),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times($p(d,true),Power(x_,C3)),Times($p(e,true),Power(x_,C4))),CN1)),x_Symbol),
    Condition(Module(List(Set(q,Sqrt(Plus(Times(C8,Sqr(a)),Sqr(b),Times(CN1,C4,a,c))))),Plus(Times(Power(q,CN1),Int(Times(Power(x,m),Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times($s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(b,$s("D")),Times($s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,q),x),Times(C2,a,Sqr(x))),CN1)),x)),Times(CN1,Power(q,CN1),Int(Times(Power(x,m),Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times(CN1,$s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(b,$s("D")),Times(CN1,$s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,Times(CN1,q)),x),Times(C2,a,Sqr(x))),CN1)),x)))),And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),$s("D"),m),x),ZeroQ(Plus(d,Times(CN1,b)))),ZeroQ(Plus(e,Times(CN1,a)))),SumQ(Factor(Plus(a,Times(b,x),Times(c,Sqr(x)),Times(b,Power(x,C3)),Times(a,Power(x,C4))))))))
  );
}
