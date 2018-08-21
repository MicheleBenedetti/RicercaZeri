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
public class IntRules113 { 
  public static IAST RULES = List( 
IIntegrate(5651,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Sinh(Times(d_DEFAULT,Sqr(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))))))),x_Symbol),
    Condition(Plus(Negate(Dist(Power(C2,-1),Int(Times(Power(Times(e,x),m),Power(Exp(Times(d,Sqr(Plus(a,Times(b,Log(Times(c,Power(x,n)))))))),-1)),x),x)),Dist(C1D2,Int(Times(Power(Times(e,x),m),Exp(Times(d,Sqr(Plus(a,Times(b,Log(Times(c,Power(x,n))))))))),x),x)),FreeQ(List(a,b,c,d,e,m,n),x))),
IIntegrate(5652,Int(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Cosh(Times(d_DEFAULT,Sqr(Plus(a_DEFAULT,Times(b_DEFAULT,Log(Times(c_DEFAULT,Power(x_,n_DEFAULT))))))))),x_Symbol),
    Condition(Plus(Dist(C1D2,Int(Times(Power(Times(e,x),m),Power(Exp(Times(d,Sqr(Plus(a,Times(b,Log(Times(c,Power(x,n)))))))),-1)),x),x),Dist(C1D2,Int(Times(Power(Times(e,x),m),Exp(Times(d,Sqr(Plus(a,Times(b,Log(Times(c,Power(x,n))))))))),x),x)),FreeQ(List(a,b,c,d,e,m,n),x))),
IIntegrate(5653,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),Negate(Dist(Times(b,c,n),Int(Times(x,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c),x),GtQ(n,C0)))),
IIntegrate(5654,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),Negate(Dist(Times(b,c,n),Int(Times(x,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x),x))),And(FreeQ(List(a,b,c),x),GtQ(n,C0)))),
IIntegrate(5655,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_),x_Symbol),
    Condition(Plus(Simp(Times(Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),x),Negate(Dist(Times(c,Power(Times(b,Plus(n,C1)),-1)),Int(Times(x,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c),x),LtQ(n,CN1)))),
IIntegrate(5656,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_),x_Symbol),
    Condition(Plus(Simp(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),x),Negate(Dist(Times(c,Power(Times(b,Plus(n,C1)),-1)),Int(Times(x,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x),x))),And(FreeQ(List(a,b,c),x),LtQ(n,CN1)))),
IIntegrate(5657,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_),x_Symbol),
    Condition(Dist(Power(Times(b,c),-1),Subst(Int(Times(Power(x,n),Cosh(Plus(Times(a,Power(b,-1)),Times(CN1,x,Power(b,-1))))),x),x,Plus(a,Times(b,ArcSinh(Times(c,x))))),x),FreeQ(List(a,b,c,n),x))),
IIntegrate(5658,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_),x_Symbol),
    Condition(Negate(Dist(Power(Times(b,c),-1),Subst(Int(Times(Power(x,n),Sinh(Plus(Times(a,Power(b,-1)),Times(CN1,x,Power(b,-1))))),x),x,Plus(a,Times(b,ArcCosh(Times(c,x))))),x)),FreeQ(List(a,b,c,n),x))),
IIntegrate(5659,Int(Times(Power(x_,-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Tanh(x),-1)),x),x,ArcSinh(Times(c,x))),And(FreeQ(List(a,b,c),x),IGtQ(n,C0)))),
IIntegrate(5660,Int(Times(Power(x_,-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Coth(x),-1)),x),x,ArcCosh(Times(c,x))),And(FreeQ(List(a,b,c),x),IGtQ(n,C0)))),
IIntegrate(5661,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,c,n,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,m),x),IGtQ(n,C0),NeQ(m,CN1)))),
IIntegrate(5662,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(d,Plus(m,C1)),-1)),x),Negate(Dist(Times(b,c,n,Power(Times(d,Plus(m,C1)),-1)),Int(Times(Power(Times(d,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x),x))),And(FreeQ(List(a,b,c,d,m),x),IGtQ(n,C0),NeQ(m,CN1)))),
IIntegrate(5663,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(b,c,n,Power(Plus(m,C1),-1)),Int(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c),x),IGtQ(m,C0),GtQ(n,C0)))),
IIntegrate(5664,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Plus(m,C1),-1)),x),Negate(Dist(Times(b,c,n,Power(Plus(m,C1),-1)),Int(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1))),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x),x))),And(FreeQ(List(a,b,c),x),IGtQ(m,C0),GtQ(n,C0)))),
IIntegrate(5665,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,m),Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),x),Negate(Dist(Power(Times(b,Power(c,Plus(m,C1)),Plus(n,C1)),-1),Subst(Int(ExpandTrigReduce(Power(Plus(a,Times(b,x)),Plus(n,C1)),Times(Power(Sinh(x),Plus(m,Negate(C1))),Plus(m,Times(Plus(m,C1),Sqr(Sinh(x))))),x),x),x,ArcSinh(Times(c,x))),x))),And(FreeQ(List(a,b,c),x),IGtQ(m,C0),GeQ(n,CN2),LtQ(n,CN1)))),
IIntegrate(5666,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,m),Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),x),Dist(Power(Times(b,Power(c,Plus(m,C1)),Plus(n,C1)),-1),Subst(Int(ExpandTrigReduce(Times(Power(Plus(a,Times(b,x)),Plus(n,C1)),Power(Cosh(x),Plus(m,Negate(C1))),Plus(m,Times(CN1,Plus(m,C1),Sqr(Cosh(x))))),x),x),x,ArcCosh(Times(c,x))),x)),And(FreeQ(List(a,b,c),x),IGtQ(m,C0),GeQ(n,CN2),LtQ(n,CN1)))),
IIntegrate(5667,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,m),Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),x),Negate(Dist(Times(c,Plus(m,C1),Power(Times(b,Plus(n,C1)),-1)),Int(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x)),Negate(Dist(Times(m,Power(Times(b,c,Plus(n,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c),x),IGtQ(m,C0),LtQ(n,CN2)))),
IIntegrate(5668,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,m),Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),x),Negate(Dist(Times(c,Plus(m,C1),Power(Times(b,Plus(n,C1)),-1)),Int(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x),x)),Dist(Times(m,Power(Times(b,c,Plus(n,C1)),-1)),Int(Times(Power(x,Plus(m,Negate(C1))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(Sqrt(Plus(CN1,Times(c,x))),Sqrt(Plus(C1,Times(c,x)))),-1)),x),x)),And(FreeQ(List(a,b,c),x),IGtQ(m,C0),LtQ(n,CN2)))),
IIntegrate(5669,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Dist(Power(Power(c,Plus(m,C1)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Sinh(x),m),Cosh(x)),x),x,ArcSinh(Times(c,x))),x),And(FreeQ(List(a,b,c,n),x),IGtQ(m,C0)))),
IIntegrate(5670,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Dist(Power(Power(c,Plus(m,C1)),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Cosh(x),m),Sinh(x)),x),x,ArcCosh(Times(c,x))),x),And(FreeQ(List(a,b,c,n),x),IGtQ(m,C0)))),
IIntegrate(5671,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(d,x),m),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,m,n),x))),
IIntegrate(5672,Int(Times(Power(Times(d_DEFAULT,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(d,x),m),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),FreeQ(List(a,b,c,d,m,n),x))),
IIntegrate(5673,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),-1)),x_Symbol),
    Condition(Simp(Times(Log(Plus(a,Times(b,ArcSinh(Times(c,x))))),Power(Times(b,c,Sqrt(d)),-1)),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(d,C0)))),
IIntegrate(5674,Int(Times(Power(Plus($p("d1"),Times($p("e1",true),x_)),CN1D2),Power(Plus($p("d2"),Times($p("e2",true),x_)),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),-1)),x_Symbol),
    Condition(Simp(Times(Log(Plus(a,Times(b,ArcCosh(Times(c,x))))),Power(Times(b,c,Sqrt(Times(CN1,$s("d1"),$s("d2")))),-1)),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),GtQ($s("d1"),C0),LtQ($s("d2"),C0)))),
IIntegrate(5675,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Simp(Times(Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(d),Plus(n,C1)),-1)),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(e,Times(Sqr(c),d)),GtQ(d,C0),NeQ(n,CN1)))),
IIntegrate(5676,Int(Times(Power(Plus($p("d1"),Times($p("e1",true),x_)),CN1D2),Power(Plus($p("d2"),Times($p("e2",true),x_)),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Simp(Times(Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Sqrt(Times(CN1,$s("d1"),$s("d2"))),Plus(n,C1)),-1)),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),n),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),GtQ($s("d1"),C0),LtQ($s("d2"),C0),NeQ(n,CN1)))),
IIntegrate(5677,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Int(Times(Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(e,Times(Sqr(c),d)),Not(GtQ(d,C0))))),
IIntegrate(5678,Int(Times(Power(Plus($p("d1"),Times($p("e1",true),x_)),CN1D2),Power(Plus($p("d2"),Times($p("e2",true),x_)),CN1D2),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x))),Power(Times(Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x)))),-1)),Int(Times(Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),-1)),x),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),n),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),Not(And(GtQ($s("d1"),C0),LtQ($s("d2"),C0)))))),
IIntegrate(5679,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Sqr(x))),p),x))),Plus(Dist(Plus(a,Times(b,ArcSinh(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),x)))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IGtQ(p,C0)))),
IIntegrate(5680,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(u,IntHide(Power(Plus(d,Times(e,Sqr(x))),p),x))),Plus(Dist(Plus(a,Times(b,ArcCosh(Times(c,x)))),u,x),Negate(Dist(Times(b,c),Int(SimplifyIntegrand(Times(u,Power(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),-1)),x),x),x)))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0)))),
IIntegrate(5681,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Plus(Times(C2,p),C1),-1)),x),Negate(Dist(Times(b,c,n,Power(Negate(d),p),Power(Plus(Times(C2,p),C1),-1)),Int(Times(x,Power(Plus(CN1,Times(c,x)),Plus(p,Negate(C1D2))),Power(Plus(C1,Times(c,x)),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x),x)),Dist(Times(C2,d,p,Power(Plus(Times(C2,p),C1),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,Negate(C1))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),GtQ(p,C0),IntegerQ(p)))),
IIntegrate(5682,Int(Times(Sqrt(Plus(d_,Times(e_DEFAULT,Sqr(x_)))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(C1D2,x,Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),Dist(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(C2,Sqrt(Plus(C1,Times(Sqr(c),Sqr(x))))),-1)),Int(Times(Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1D2)),x),x),Negate(Dist(Times(b,c,n,Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Times(C2,Sqrt(Plus(C1,Times(Sqr(c),Sqr(x))))),-1)),Int(Times(x,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(n,C0)))),
IIntegrate(5683,Int(Times(Sqrt(Plus($p("d1"),Times($p("e1",true),x_))),Sqrt(Plus($p("d2"),Times($p("e2",true),x_))),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(C1D2,x,Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),Negate(Dist(Times(Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x))),Power(Times(C2,Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),-1)),Int(Times(Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),-1)),x),x)),Negate(Dist(Times(b,c,n,Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x))),Power(Times(C2,Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),-1)),Int(Times(x,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),GtQ(n,C0)))),
IIntegrate(5684,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Power(Plus(Times(C2,p),C1),-1)),x),Dist(Times(C2,d,p,Power(Plus(Times(C2,p),C1),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,Negate(C1))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),Negate(Dist(Times(b,c,n,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(Plus(Times(C2,p),C1),Power(Plus(C1,Times(Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(x,Power(Plus(C1,Times(Sqr(c),Sqr(x))),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(n,C0),GtQ(p,C0)))),
IIntegrate(5685,Int(Times(Power(Plus($p("d1"),Times($p("e1",true),x_)),p_DEFAULT),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Plus(Times(C2,p),C1),-1)),x),Dist(Times(C2,$s("d1"),$s("d2"),p,Power(Plus(Times(C2,p),C1),-1)),Int(Times(Power(Plus($s("d1"),Times($s("e1"),x)),Plus(p,Negate(C1))),Power(Plus($s("d2"),Times($s("e2"),x)),Plus(p,Negate(C1))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),Negate(Dist(Times(b,c,n,Power(Times(CN1,$s("d1"),$s("d2")),Plus(p,Negate(C1D2))),Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x))),Power(Times(Plus(Times(C2,p),C1),Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),-1)),Int(Times(x,Power(Plus(CN1,Times(Sqr(c),Sqr(x))),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),GtQ(n,C0),GtQ(p,C0),IntegerQ(Plus(p,Negate(C1D2)))))),
IIntegrate(5686,Int(Times(Power(Plus($p("d1"),Times($p("e1",true),x_)),p_DEFAULT),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Plus(Times(C2,p),C1),-1)),x),Dist(Times(C2,$s("d1"),$s("d2"),p,Power(Plus(Times(C2,p),C1),-1)),Int(Times(Power(Plus($s("d1"),Times($s("e1"),x)),Plus(p,Negate(C1))),Power(Plus($s("d2"),Times($s("e2"),x)),Plus(p,Negate(C1))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),Negate(Dist(Times(b,c,n,Power(Times(CN1,$s("d1"),$s("d2")),IntPart(p)),Power(Plus($s("d1"),Times($s("e1"),x)),FracPart(p)),Power(Plus($s("d2"),Times($s("e2"),x)),FracPart(p)),Power(Times(Plus(Times(C2,p),C1),Power(Plus(C1,Times(c,x)),FracPart(p)),Power(Plus(CN1,Times(c,x)),FracPart(p))),-1)),Int(Times(x,Power(Plus(CN1,Times(c,x)),Plus(p,Negate(C1D2))),Power(Plus(C1,Times(c,x)),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),GtQ(n,C0),GtQ(p,C0)))),
IIntegrate(5687,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),QQ(-3L,2L)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),x),Negate(Dist(Times(b,c,n,Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Times(d,Sqrt(Plus(d,Times(e,Sqr(x))))),-1)),Int(Times(x,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(Sqr(c),Sqr(x))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(n,C0)))),
IIntegrate(5688,Int(Times(Power(Plus($p("d1"),Times($p("e1",true),x_)),QQ(-3L,2L)),Power(Plus($p("d2"),Times($p("e2",true),x_)),QQ(-3L,2L)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times($s("d1"),$s("d2"),Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x)))),-1)),x),Dist(Times(b,c,n,Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x))),Power(Times($s("d1"),$s("d2"),Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x)))),-1)),Int(Times(x,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1))),Power(Plus(C1,Times(CN1,Sqr(c),Sqr(x))),-1)),x),x)),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),GtQ(n,C0)))),
IIntegrate(5689,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(C2,d,Plus(p,C1)),-1)),x)),Negate(Dist(Times(b,c,n,Power(Negate(d),p),Power(Times(C2,Plus(p,C1)),-1)),Int(Times(x,Power(Plus(C1,Times(c,x)),Plus(p,C1D2)),Power(Plus(CN1,Times(c,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x),x)),Dist(Times(Plus(Times(C2,p),C3),Power(Times(C2,d,Plus(p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),GtQ(n,C0),LtQ(p,CN1),IntegerQ(p)))),
IIntegrate(5690,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n),Power(Times(C2,d,Plus(p,C1)),-1)),x)),Dist(Times(Plus(Times(C2,p),C3),Power(Times(C2,d,Plus(p,C1)),-1)),Int(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(p,C1)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),Dist(Times(b,c,n,Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(C2,Plus(p,C1),Power(Plus(C1,Times(Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(x,Power(Plus(C1,Times(Sqr(c),Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,Negate(C1)))),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(n,C0),LtQ(p,CN1),NeQ(p,QQ(-3L,2L))))),
IIntegrate(5691,Int(Times(Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus($s("d1"),Times($s("e1"),x)),Plus(p,C1)),Power(Plus($s("d2"),Times($s("e2"),x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(C2,$s("d1"),$s("d2"),Plus(p,C1)),-1)),x)),Dist(Times(Plus(Times(C2,p),C3),Power(Times(C2,$s("d1"),$s("d2"),Plus(p,C1)),-1)),Int(Times(Power(Plus($s("d1"),Times($s("e1"),x)),Plus(p,C1)),Power(Plus($s("d2"),Times($s("e2"),x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),Negate(Dist(Times(b,c,n,Power(Times(CN1,$s("d1"),$s("d2")),Plus(p,C1D2)),Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x))),Power(Times(C2,Plus(p,C1),Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x)))),-1)),Int(Times(x,Power(Plus(CN1,Times(Sqr(c),Sqr(x))),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),GtQ(n,C0),LtQ(p,CN1),NeQ(p,QQ(-3L,2L)),IntegerQ(Plus(p,C1D2))))),
IIntegrate(5692,Int(Times(Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(x,Power(Plus($s("d1"),Times($s("e1"),x)),Plus(p,C1)),Power(Plus($s("d2"),Times($s("e2"),x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n),Power(Times(C2,$s("d1"),$s("d2"),Plus(p,C1)),-1)),x)),Dist(Times(Plus(Times(C2,p),C3),Power(Times(C2,$s("d1"),$s("d2"),Plus(p,C1)),-1)),Int(Times(Power(Plus($s("d1"),Times($s("e1"),x)),Plus(p,C1)),Power(Plus($s("d2"),Times($s("e2"),x)),Plus(p,C1)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),Negate(Dist(Times(b,c,n,Power(Times(CN1,$s("d1"),$s("d2")),IntPart(p)),Power(Plus($s("d1"),Times($s("e1"),x)),FracPart(p)),Power(Plus($s("d2"),Times($s("e2"),x)),FracPart(p)),Power(Times(C2,Plus(p,C1),Power(Plus(C1,Times(c,x)),FracPart(p)),Power(Plus(CN1,Times(c,x)),FracPart(p))),-1)),Int(Times(x,Power(Plus(C1,Times(c,x)),Plus(p,C1D2)),Power(Plus(CN1,Times(c,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,Negate(C1)))),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),GtQ(n,C0),LtQ(p,CN1),NeQ(p,QQ(-3L,2L))))),
IIntegrate(5693,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(c,d),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Sech(x)),x),x,ArcSinh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IGtQ(n,C0)))),
IIntegrate(5694,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),-1),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Negate(Dist(Power(Times(c,d),-1),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Csch(x)),x),x,ArcCosh(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(n,C0)))),
IIntegrate(5695,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Negate(d),p),Power(Plus(CN1,Times(c,x)),Plus(p,C1D2)),Power(Plus(C1,Times(c,x)),Plus(p,C1D2)),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),x),Negate(Dist(Times(c,Power(Negate(d),p),Plus(Times(C2,p),C1),Power(Times(b,Plus(n,C1)),-1)),Int(Times(x,Power(Plus(CN1,Times(c,x)),Plus(p,Negate(C1D2))),Power(Plus(C1,Times(c,x)),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(Plus(Times(Sqr(c),d),e),C0),LtQ(n,CN1),IntegerQ(p)))),
IIntegrate(5696,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),p),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),x),Negate(Dist(Times(c,Plus(Times(C2,p),C1),Power(d,IntPart(p)),Power(Plus(d,Times(e,Sqr(x))),FracPart(p)),Power(Times(b,Plus(n,C1),Power(Plus(C1,Times(Sqr(c),Sqr(x))),FracPart(p))),-1)),Int(Times(x,Power(Plus(C1,Times(Sqr(c),Sqr(x))),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(e,Times(Sqr(c),d)),LtQ(n,CN1)))),
IIntegrate(5697,Int(Times(Power(Plus($p("d1"),Times($p("e1",true),x_)),p_DEFAULT),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x))),Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),x),Negate(Dist(Times(c,Plus(Times(C2,p),C1),Power(Times(CN1,$s("d1"),$s("d2")),Plus(p,Negate(C1D2))),Sqrt(Plus($s("d1"),Times($s("e1"),x))),Sqrt(Plus($s("d2"),Times($s("e2"),x))),Power(Times(b,Plus(n,C1),Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x)))),-1)),Int(Times(x,Power(Plus(CN1,Times(Sqr(c),Sqr(x))),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),p),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),LtQ(n,CN1),IntegerQ(Plus(p,Negate(C1D2)))))),
IIntegrate(5698,Int(Times(Power(Plus($p("d1"),Times($p("e1",true),x_)),p_DEFAULT),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(Plus(Simp(Times(Sqrt(Plus(C1,Times(c,x))),Sqrt(Plus(CN1,Times(c,x))),Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1)),Power(Times(b,c,Plus(n,C1)),-1)),x),Negate(Dist(Times(c,Plus(Times(C2,p),C1),Power(Times(CN1,$s("d1"),$s("d2")),IntPart(p)),Power(Plus($s("d1"),Times($s("e1"),x)),FracPart(p)),Power(Plus($s("d2"),Times($s("e2"),x)),FracPart(p)),Power(Times(b,Plus(n,C1),Power(Plus(C1,Times(c,x)),FracPart(p)),Power(Plus(CN1,Times(c,x)),FracPart(p))),-1)),Int(Times(x,Power(Plus(C1,Times(c,x)),Plus(p,Negate(C1D2))),Power(Plus(CN1,Times(c,x)),Plus(p,Negate(C1D2))),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),p),x),EqQ($s("e1"),Times(c,$s("d1"))),EqQ($s("e2"),Times(CN1,c,$s("d2"))),LtQ(n,CN1)))),
IIntegrate(5699,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcSinh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(d,p),Power(c,-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Cosh(x),Plus(Times(C2,p),C1))),x),x,ArcSinh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(e,Times(Sqr(c),d)),IGtQ(Times(C2,p),C0),Or(IntegerQ(p),GtQ(d,C0))))),
IIntegrate(5700,Int(Times(Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,ArcCosh(Times(c_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Negate(d),p),Power(c,-1)),Subst(Int(Times(Power(Plus(a,Times(b,x)),n),Power(Sinh(x),Plus(Times(C2,p),C1))),x),x,ArcCosh(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,n),x),EqQ(Plus(Times(Sqr(c),d),e),C0),IGtQ(p,C0))))
  );
}
