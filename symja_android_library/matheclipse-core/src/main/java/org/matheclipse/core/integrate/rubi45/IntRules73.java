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
public class IntRules73 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(pd,Plus(Times(pa,b),Times(CN1,a,pb)),Tan(Plus(pe,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C1))),Power(Times(f,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(Power(Times(Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C1))),Simp(Plus(Times(pd,Plus(pn,Times(CN1,C1)),Plus(Times(pa,b),Times(CN1,a,pb))),Times(pd,Plus(Times(a,pa),Times(CN1,b,pb)),Plus(m,C1),Sec(Plus(pe,Times(f,x)))),Times(CN1,pd,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,pn,C1),Sqr(Sec(Plus(pe,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Less(m,CN1)),Less(Less(C0,pn),C1)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,pd,Plus(Times(pa,b),Times(CN1,a,pb)),Cot(Plus(pe,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C1))),Power(Times(f,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(Power(Times(Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C1))),Simp(Plus(Times(pd,Plus(pn,Times(CN1,C1)),Plus(Times(pa,b),Times(CN1,a,pb))),Times(pd,Plus(Times(a,pa),Times(CN1,b,pb)),Plus(m,C1),Csc(Plus(pe,Times(f,x)))),Times(CN1,pd,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,pn,C1),Sqr(Csc(Plus(pe,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Less(m,CN1)),Less(Less(C0,pn),C1)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,a,Sqr(pd),Plus(Times(pa,b),Times(CN1,a,pb)),Tan(Plus(pe,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C2))),Power(Times(b,f,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(CN1,pd,Power(Times(b,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C2))),Simp(Plus(Times(a,pd,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(pn,Times(CN1,C2))),Times(b,pd,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,C1),Sec(Plus(pe,Times(f,x)))),Times(CN1,Plus(Times(a,pa,b,pd,Plus(m,pn)),Times(CN1,pd,pb,Plus(Times(Sqr(a),Plus(pn,Times(CN1,C1))),Times(Sqr(b),Plus(m,C1))))),Sqr(Sec(Plus(pe,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Less(m,CN1)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(a,Sqr(pd),Plus(Times(pa,b),Times(CN1,a,pb)),Cot(Plus(pe,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C2))),Power(Times(b,f,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(CN1,pd,Power(Times(b,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C2))),Simp(Plus(Times(a,pd,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(pn,Times(CN1,C2))),Times(b,pd,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,C1),Csc(Plus(pe,Times(f,x)))),Times(CN1,Plus(Times(a,pa,b,pd,Plus(m,pn)),Times(CN1,pd,pb,Plus(Times(Sqr(a),Plus(pn,Times(CN1,C1))),Times(Sqr(b),Plus(m,C1))))),Sqr(Csc(Plus(pe,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Less(m,CN1)),Greater(pn,C1)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,b,Plus(Times(pa,b),Times(CN1,a,pb)),Tan(Plus(pe,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),pn),Power(Times(a,f,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(Power(Times(a,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),pn),Simp(Plus(Times(pa,Plus(Times(Sqr(a),Plus(m,C1)),Times(CN1,Sqr(b),Plus(m,pn,C1)))),Times(a,b,pb,pn),Times(CN1,a,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,C1),Sec(Plus(pe,Times(f,x)))),Times(b,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,pn,C2),Sqr(Sec(Plus(pe,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,pd,pe,f,pa,pb,pn),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Less(m,CN1)),Not(NegativeIntegerQ(Plus(m,C1D2),pn))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(b,Plus(Times(pa,b),Times(CN1,a,pb)),Cot(Plus(pe,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),pn),Power(Times(a,f,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1)),Times(Power(Times(a,Plus(m,C1),Plus(Sqr(a),Times(CN1,Sqr(b)))),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),pn),Simp(Plus(Times(pa,Plus(Times(Sqr(a),Plus(m,C1)),Times(CN1,Sqr(b),Plus(m,pn,C1)))),Times(a,b,pb,pn),Times(CN1,a,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,C1),Csc(Plus(pe,Times(f,x)))),Times(b,Plus(Times(pa,b),Times(CN1,a,pb)),Plus(m,pn,C2),Sqr(Csc(Plus(pe,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,pd,pe,f,pa,pb,pn),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m)),Less(m,CN1)),Not(NegativeIntegerQ(Plus(m,C1D2),pn))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(pb,pd,Tan(Plus(pe,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),m),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C1))),Power(Times(f,Plus(m,pn)),CN1)),Times(pd,Power(Plus(m,pn),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),Plus(m,Times(CN1,C1))),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C1))),Simp(Plus(Times(a,pb,Plus(pn,Times(CN1,C1))),Times(Plus(Times(b,pb,Plus(m,pn,Times(CN1,C1))),Times(a,pa,Plus(m,pn))),Sec(Plus(pe,Times(f,x)))),Times(Plus(Times(a,pb,m),Times(pa,b,Plus(m,pn))),Sqr(Sec(Plus(pe,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Less(Less(C0,m),C1)),Greater(pn,C0)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,pb,pd,Cot(Plus(pe,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),m),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C1))),Power(Times(f,Plus(m,pn)),CN1)),Times(pd,Power(Plus(m,pn),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),Plus(m,Times(CN1,C1))),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C1))),Simp(Plus(Times(a,pb,Plus(pn,Times(CN1,C1))),Times(Plus(Times(b,pb,Plus(m,pn,Times(CN1,C1))),Times(a,pa,Plus(m,pn))),Csc(Plus(pe,Times(f,x)))),Times(Plus(Times(a,pb,m),Times(pa,b,Plus(m,pn))),Sqr(Csc(Plus(pe,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Less(Less(C0,m),C1)),Greater(pn,C0)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,pa,Tan(Plus(pe,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),m),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),pn),Power(Times(f,pn),CN1)),Times(CN1,Power(Times(pd,pn),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),Plus(m,Times(CN1,C1))),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),Plus(pn,C1)),Simp(Plus(Times(pa,b,m),Times(CN1,a,pb,pn),Times(CN1,Plus(Times(b,pb,pn),Times(a,pa,Plus(pn,C1))),Sec(Plus(pe,Times(f,x)))),Times(CN1,pa,b,Plus(m,pn,C1),Sqr(Sec(Plus(pe,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Less(Less(C0,m),C1)),LessEqual(pn,CN1)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(pa,Cot(Plus(pe,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),m),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),pn),Power(Times(f,pn),CN1)),Times(CN1,Power(Times(pd,pn),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),Plus(m,Times(CN1,C1))),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),Plus(pn,C1)),Simp(Plus(Times(pa,b,m),Times(CN1,a,pb,pn),Times(CN1,Plus(Times(b,pb,pn),Times(a,pa,Plus(pn,C1))),Csc(Plus(pe,Times(f,x)))),Times(CN1,pa,b,Plus(m,pn,C1),Sqr(Csc(Plus(pe,Times(f,x)))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(m,pn)),Less(Less(C0,m),C1)),LessEqual(pn,CN1)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(pb,Sqr(pd),Tan(Plus(pe,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C2))),Power(Times(b,f,Plus(m,pn)),CN1)),Times(Sqr(pd),Power(Times(b,Plus(m,pn)),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),m),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C2))),Simp(Plus(Times(a,pb,Plus(pn,Times(CN1,C2))),Times(pb,b,Plus(m,pn,Times(CN1,C1)),Sec(Plus(pe,Times(f,x)))),Times(Plus(Times(pa,b,Plus(m,pn)),Times(CN1,a,pb,Plus(pn,Times(CN1,C1)))),Sqr(Sec(Plus(pe,Times(f,x)))))),x)),x))),And(And(And(And(And(And(FreeQ(List(a,b,pd,pe,f,pa,pb,m),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(pn)),Greater(pn,C1)),NonzeroQ(Plus(m,pn))),Not(And(IntegerQ(m),Greater(m,C1)))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,pb,Sqr(pd),Cot(Plus(pe,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C2))),Power(Times(b,f,Plus(m,pn)),CN1)),Times(Sqr(pd),Power(Times(b,Plus(m,pn)),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),m),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),Plus(pn,Times(CN1,C2))),Simp(Plus(Times(a,pb,Plus(pn,Times(CN1,C2))),Times(pb,b,Plus(m,pn,Times(CN1,C1)),Csc(Plus(pe,Times(f,x)))),Times(Plus(Times(pa,b,Plus(m,pn)),Times(CN1,a,pb,Plus(pn,Times(CN1,C1)))),Sqr(Csc(Plus(pe,Times(f,x)))))),x)),x))),And(And(And(And(And(And(FreeQ(List(a,b,pd,pe,f,pa,pb,m),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(pn)),Greater(pn,C1)),NonzeroQ(Plus(m,pn))),Not(And(IntegerQ(m),Greater(m,C1)))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(CN1,pa,Tan(Plus(pe,Times(f,x))),Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),pn),Power(Times(a,f,pn),CN1)),Times(Power(Times(a,pd,pn),CN1),Int(Times(Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),m),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),Plus(pn,C1)),Simp(Plus(Times(a,pb,pn),Times(CN1,pa,b,Plus(m,pn,C1)),Times(pa,a,Plus(pn,C1),Sec(Plus(pe,Times(f,x)))),Times(pa,b,Plus(m,pn,C2),Sqr(Sec(Plus(pe,Times(f,x)))))),x)),x))),And(And(And(And(FreeQ(List(a,b,pd,pe,f,pa,pb,m),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(pn)),LessEqual(pn,CN1)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(pa,Cot(Plus(pe,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),Plus(m,C1)),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),pn),Power(Times(a,f,pn),CN1)),Times(Power(Times(a,pd,pn),CN1),Int(Times(Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),m),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),Plus(pn,C1)),Simp(Plus(Times(a,pb,pn),Times(CN1,pa,b,Plus(m,pn,C1)),Times(pa,a,Plus(pn,C1),Csc(Plus(pe,Times(f,x)))),Times(pa,b,Plus(m,pn,C2),Sqr(Csc(Plus(pe,Times(f,x)))))),x)),x))),And(And(And(And(FreeQ(List(a,b,pd,pe,f,pa,pb,m),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))),RationalQ(pn)),LessEqual(pn,CN1)))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Times(pd_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))))),CN1)),x_Symbol),
    Condition(Plus(Times(pa,Power(a,CN1),Int(Times(Sqrt(Plus(a,Times(b,Sec(Plus(pe,Times(f,x)))))),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),CN1D2)),x)),Times(CN1,Plus(Times(pa,b),Times(CN1,a,pb)),Power(Times(a,pd),CN1),Int(Times(Sqrt(Times(pd,Sec(Plus(pe,Times(f,x))))),Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),CN1D2)),x))),And(And(FreeQ(List(a,b,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))))),Sqrt(Times(pd_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))))),CN1)),x_Symbol),
    Condition(Plus(Times(pa,Power(a,CN1),Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(pe,Times(f,x)))))),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),CN1D2)),x)),Times(CN1,Plus(Times(pa,b),Times(CN1,a,pb)),Power(Times(a,pd),CN1),Int(Times(Sqrt(Times(pd,Csc(Plus(pe,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),CN1D2)),x))),And(And(FreeQ(List(a,b,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2),Sqrt(Times(pd_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(pa,Int(Times(Sqrt(Times(pd,Sec(Plus(pe,Times(f,x))))),Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),CN1D2)),x)),Times(pb,Power(pd,CN1),Int(Times(Power(Times(pd,Sec(Plus(pe,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),CN1D2)),x))),And(And(FreeQ(List(a,b,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2),Sqrt(Times(pd_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))))),x_Symbol),
    Condition(Plus(Times(pa,Int(Times(Sqrt(Times(pd,Csc(Plus(pe,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),CN1D2)),x)),Times(pb,Power(pd,CN1),Int(Times(Power(Times(pd,Csc(Plus(pe,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),CN1D2)),x))),And(And(FreeQ(List(a,b,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),CN1D2)),x_Symbol),
    Condition(Plus(Times(pb,Power(pd,CN1),Int(Times(Sqrt(Plus(a,Times(b,Sec(Plus(pe,Times(f,x)))))),Sqrt(Times(pd,Sec(Plus(pe,Times(f,x)))))),x)),Times(pa,Int(Times(Sqrt(Plus(a,Times(b,Sec(Plus(pe,Times(f,x)))))),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),CN1D2)),x))),And(And(FreeQ(List(a,b,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Times(pd_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),CN1D2)),x_Symbol),
    Condition(Plus(Times(pb,Power(pd,CN1),Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(pe,Times(f,x)))))),Sqrt(Times(pd,Csc(Plus(pe,Times(f,x)))))),x)),Times(pa,Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(pe,Times(f,x)))))),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),CN1D2)),x))),And(And(FreeQ(List(a,b,pd,pe,f,pa,pb),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(pa,Power(a,CN1),Int(Power(Times(pd,Sec(Plus(pe,Times(f,x)))),pn),x)),Times(CN1,Plus(Times(pa,b),Times(CN1,a,pb)),Power(Times(a,pd),CN1),Int(Times(Power(Times(pd,Sec(Plus(pe,Times(f,x)))),Plus(pn,C1)),Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),CN1)),x))),And(And(FreeQ(List(a,b,pd,pe,f,pa,pb,pn),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Power(Times(pd_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_)),x_Symbol),
    Condition(Plus(Times(pa,Power(a,CN1),Int(Power(Times(pd,Csc(Plus(pe,Times(f,x)))),pn),x)),Times(CN1,Plus(Times(pa,b),Times(CN1,a,pb)),Power(Times(a,pd),CN1),Int(Times(Power(Times(pd,Csc(Plus(pe,Times(f,x)))),Plus(pn,C1)),Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),CN1)),x))),And(And(FreeQ(List(a,b,pd,pe,f,pa,pb,pn),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§sec"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(a,Times(b,Sec(Plus(pe,Times(f,x))))),m),Power(Times(pd,Sec(Plus(pe,Times(f,x)))),pn),Plus(pa,Times(pb,Sec(Plus(pe,Times(f,x)))))),x),And(And(FreeQ(List(a,b,pd,pe,f,pa,pb,m,pn),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b))))))),
ISetDelayed(Int(Times(Plus(pa_,Times(pb_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(a_,Times(b_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Times(pd_DEFAULT,$($s("§csc"),Plus(pe_DEFAULT,Times(f_DEFAULT,x_)))),pn_DEFAULT)),x_Symbol),
    Condition($(Defer($s("Int")),Times(Power(Plus(a,Times(b,Csc(Plus(pe,Times(f,x))))),m),Power(Times(pd,Csc(Plus(pe,Times(f,x)))),pn),Plus(pa,Times(pb,Csc(Plus(pe,Times(f,x)))))),x),And(And(FreeQ(List(a,b,pd,pe,f,pa,pb,m,pn),x),NonzeroQ(Plus(Times(pa,b),Times(CN1,a,pb)))),NonzeroQ(Plus(Sqr(a),Times(CN1,Sqr(b)))))))
  );
}