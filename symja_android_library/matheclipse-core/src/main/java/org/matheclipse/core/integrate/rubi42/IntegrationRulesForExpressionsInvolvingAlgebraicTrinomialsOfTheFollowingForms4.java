package org.matheclipse.core.integrate.rubi42;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi42.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi42.UtilityFunctions.*;

import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
/** 
 * IntegrationRules rules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntegrationRulesForExpressionsInvolvingAlgebraicTrinomialsOfTheFollowingForms4 { 
  public static IAST RULES = List( 
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true))),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(Times(Power(x,Times(n,p)),Power(Plus(d,Times(e,Power(x,n))),m),Power(Plus(b,Times(c,Power(x,n))),p)),x),And(And(FreeQ(List(b,c,d,e,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),IntegerQ(p)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true))),$p(p))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(Times(b,e),Times(CN1,d,c)),Power(Plus(Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(b,c,n,Plus(p,C1),Power(x,Times(C2,n,Plus(p,C1)))),CN1)),Times(e,Power(c,CN1),Int(Times(Power(x,Times(CN1,n)),Power(Plus(Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1))),x))),And(And(And(FreeQ(List(b,c,d,e,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),Not(IntegerQ(p))),ZeroQ(Plus(Times(n,Plus(Times(C2,p),C1)),C1))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true))),$p(p))),$p(x,SymbolHead)),
    Condition(Times(e,Power(x,Plus(Times(CN1,n),C1)),Power(Plus(Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(c,Plus(Times(n,Plus(Times(C2,p),C1)),C1)),CN1)),And(And(And(And(FreeQ(List(b,c,d,e,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),Not(IntegerQ(p))),NonzeroQ(Plus(Times(n,Plus(Times(C2,p),C1)),C1))),ZeroQ(Plus(Times(b,e,Plus(Times(n,p),C1)),Times(CN1,c,d,Plus(Times(n,Plus(Times(C2,p),C1)),C1))))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true))),$p(p))),$p(x,SymbolHead)),
    Condition(Plus(Times(e,Power(x,Plus(Times(CN1,n),C1)),Power(Plus(Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(c,Plus(Times(n,Plus(Times(C2,p),C1)),C1)),CN1)),Times(CN1,Plus(Times(b,e,Plus(Times(n,p),C1)),Times(CN1,c,d,Plus(Times(n,Plus(Times(C2,p),C1)),C1))),Power(Times(c,Plus(Times(n,Plus(Times(C2,p),C1)),C1)),CN1),Int(Power(Plus(Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),x))),And(And(And(And(FreeQ(List(b,c,d,e,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),Not(IntegerQ(p))),NonzeroQ(Plus(Times(n,Plus(Times(C2,p),C1)),C1))),NonzeroQ(Plus(Times(b,e,Plus(Times(n,p),C1)),Times(CN1,c,d,Plus(Times(n,Plus(Times(C2,p),C1)),C1))))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true))),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(Power(x,Times(n,p)),Power(Plus(b,Times(c,Power(x,n))),p)),CN1),Int(Times(Power(x,Times(n,p)),Power(Plus(d,Times(e,Power(x,n))),m),Power(Plus(b,Times(c,Power(x,n))),p)),x)),And(And(FreeQ(List(b,c,d,e,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),Not(IntegerQ(p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Power(c,p),CN1),Int(Times(Power(Plus(d,Times(e,Power(x,n))),m),Power(Plus(Times(C1D2,b),Times(c,Power(x,n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Sqrt(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n))))),Power(Times(Power(Times(C4,c),Plus(p,Times(CN1,C1D2))),Plus(b,Times(C2,c,Power(x,n)))),CN1),Int(Times(Power(Plus(d,Times(e,Power(x,n))),m),Power(Plus(b,Times(C2,c,Power(x,n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),PositiveIntegerQ(Plus(p,C1D2))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Plus(b,Times(C2,c,Power(x,n))),Power(Times(Power(Times(C4,c),Plus(p,C1D2)),Sqrt(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))))),CN1),Int(Times(Power(Plus(d,Times(e,Power(x,n))),m),Power(Plus(b,Times(C2,c,Power(x,n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),NegativeIntegerQ(Plus(p,Times(CN1,C1D2)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(x,n))),Times(C2,p)),CN1),Int(Times(Power(Plus(d,Times(e,Power(x,n))),m),Power(Plus(b,Times(C2,c,Power(x,n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(Times(C2,p)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j)),$p(c,true)),$p(a)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(Times(Power(Plus(d,Times(e,Power(x,n))),Plus(m,p)),Power(Plus(Times(a,Power(d,CN1)),Times(c,Power(e,CN1),Power(x,n))),p)),x),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),ZeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,b,d,e),Times(a,Power(e,C2))))),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(j)),$p(c,true)),$p(a)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(Times(Power(Plus(d,Times(e,Power(x,n))),Plus(m,p)),Power(Plus(Times(a,Power(d,CN1)),Times(c,Power(e,CN1),Power(x,n))),p)),x),And(And(And(FreeQ(List(a,c,d,e,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Times(c,Power(d,C2)),Times(a,Power(e,C2))))),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j)),$p(c,true)),$p(a)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(Power(Plus(d,Times(e,Power(x,n))),p),Power(Plus(Times(a,Power(d,CN1)),Times(c,Power(x,n),Power(e,CN1))),p)),CN1),Int(Times(Power(Plus(d,Times(e,Power(x,n))),Plus(m,p)),Power(Plus(Times(a,Power(d,CN1)),Times(c,Power(e,CN1),Power(x,n))),p)),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),ZeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,b,d,e),Times(a,Power(e,C2))))),Not(IntegerQ(p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(j)),$p(c,true)),$p(a)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p),Power(Times(Power(Plus(d,Times(e,Power(x,n))),p),Power(Plus(Times(a,Power(d,CN1)),Times(c,Power(x,n),Power(e,CN1))),p)),CN1),Int(Times(Power(Plus(d,Times(e,Power(x,n))),Plus(m,p)),Power(Plus(Times(a,Power(d,CN1)),Times(c,Power(e,CN1),Power(x,n))),p)),x)),And(And(And(FreeQ(List(a,c,d,e,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Times(c,Power(d,C2)),Times(a,Power(e,C2))))),Not(IntegerQ(p))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j)),$p(c,true)),$p(a,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Plus(Times(c,Power(d,C2)),Times(CN1,b,d,e),Times(a,Power(e,C2))),x,Power(Plus(d,Times(e,Power(x,n))),Plus(m,C1)),Power(Times(d,Power(e,C2),n,Plus(m,C1)),CN1)),Times(Power(Times(n,Plus(m,C1),d,Power(e,C2)),CN1),Int(Times(Power(Plus(d,Times(e,Power(x,n))),Plus(m,C1)),Simp(Plus(Times(c,Power(d,C2)),Times(CN1,b,d,e),Times(a,Power(e,C2),Plus(Times(n,Plus(m,C1)),C1)),Times(c,d,e,n,Plus(m,C1),Power(x,n))),x)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,b,d,e),Times(a,Power(e,C2))))),RationalQ(m)),Unequal(m,CN1)),Not(PositiveIntegerQ(m))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(j)),$p(c,true)),$p(a)),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Plus(Times(c,Power(d,C2)),Times(a,Power(e,C2))),x,Power(Plus(d,Times(e,Power(x,n))),Plus(m,C1)),Power(Times(d,Power(e,C2),n,Plus(m,C1)),CN1)),Times(Power(Times(n,Plus(m,C1),d,Power(e,C2)),CN1),Int(Times(Power(Plus(d,Times(e,Power(x,n))),Plus(m,C1)),Simp(Plus(Times(c,Power(d,C2)),Times(a,Power(e,C2),Plus(Times(n,Plus(m,C1)),C1)),Times(c,d,e,n,Plus(m,C1),Power(x,n))),x)),x))),And(And(And(And(And(FreeQ(List(a,c,d,e,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(a,Power(e,C2))))),RationalQ(m)),Unequal(m,CN1)),Not(PositiveIntegerQ(m))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p(e,true)),$p(d)),Power(Plus(Times(Power($p(x),C2),$p(b,true)),Times(Power($p(x),C4),$p(c,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(r,Rt(Times(CN1,e,Power(c,CN1),Plus(Times(C2,c,d),Times(b,e))),C2))),Plus(Times(Power(e,C2),Power(Times(C2,c,r),CN1),Int(Times(Plus(r,Times(C2,e,x)),Power(Plus(d,Times(CN1,r,x),Times(CN1,e,Power(x,C2))),CN1)),x)),Times(Power(e,C2),Power(Times(C2,c,r),CN1),Int(Times(Plus(r,Times(CN1,C2,e,x)),Power(Plus(d,Times(r,x),Times(CN1,e,Power(x,C2))),CN1)),x)))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,b,d,e),Times(a,Power(e,C2))))),ZeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,a,Power(e,C2))))),NegQ(Times(e,Power(c,CN1),Plus(Times(C2,c,d),Times(b,e))))),Not(PosQ(Times(e,Power(c,CN1),Plus(Times(C2,c,d),Times(CN1,b,e)))))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p(e,true)),$p(d)),Power(Plus(Times(Power($p(x),C4),$p(c,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(r,Rt(Times(CN2,d,e),C2))),Plus(Times(Power(e,C2),Power(Times(C2,c,r),CN1),Int(Times(Plus(r,Times(C2,e,x)),Power(Plus(d,Times(CN1,r,x),Times(CN1,e,Power(x,C2))),CN1)),x)),Times(Power(e,C2),Power(Times(C2,c,r),CN1),Int(Times(Plus(r,Times(CN1,C2,e,x)),Power(Plus(d,Times(r,x),Times(CN1,e,Power(x,C2))),CN1)),x)))),And(And(FreeQ(List(a,c,d,e),x),ZeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,a,Power(e,C2))))),NegQ(Times(d,e))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p(e,true)),$p(d)),Power(Plus(Times(Power($p(x),C2),$p(b,true)),Times(Power($p(x),C4),$p(c,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(r,Rt(Times(e,Power(c,CN1),Plus(Times(C2,c,d),Times(CN1,b,e))),C2))),Plus(Times(Power(e,C2),Power(Times(C2,c),CN1),Int(Power(Plus(d,Times(CN1,r,x),Times(e,Power(x,C2))),CN1),x)),Times(Power(e,C2),Power(Times(C2,c),CN1),Int(Power(Plus(d,Times(r,x),Times(e,Power(x,C2))),CN1),x)))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,b,d,e),Times(a,Power(e,C2))))),ZeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,a,Power(e,C2))))),Not(NegativeQ(Times(e,Power(c,CN1),Plus(Times(C2,c,d),Times(CN1,b,e)))))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p(e,true)),$p(d)),Power(Plus(Times(Power($p(x),C4),$p(c,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(e,C2),Power(Times(C2,c),CN1),Int(Power(Plus(d,Times(CN1,Rt(Times(C2,d,e),C2),x),Times(e,Power(x,C2))),CN1),x)),Times(Power(e,C2),Power(Times(C2,c),CN1),Int(Power(Plus(d,Times(Rt(Times(C2,d,e),C2),x),Times(e,Power(x,C2))),CN1),x))),And(And(FreeQ(List(a,c,d,e),x),ZeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,a,Power(e,C2))))),Not(NegativeQ(Times(d,e)))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p(e,true)),$p(d)),Power(Plus(Times(Power($p(x),C2),$p(b,true)),Times(Power($p(x),C4),$p(c,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Times(a,c),C2))),Plus(Times(Plus(Times(q,d),Times(a,e)),Power(Times(C2,a,c),CN1),Int(Times(Plus(q,Times(c,Power(x,C2))),Power(Plus(a,Times(b,Power(x,C2)),Times(c,Power(x,C4))),CN1)),x)),Times(Plus(Times(q,d),Times(CN1,a,e)),Power(Times(C2,a,c),CN1),Int(Times(Plus(q,Times(CN1,c,Power(x,C2))),Power(Plus(a,Times(b,Power(x,C2)),Times(c,Power(x,C4))),CN1)),x)))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),NegativeQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,b,d,e),Times(a,Power(e,C2))))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,a,Power(e,C2))))),PosQ(Times(a,c,Power(Power(b,C2),CN1)))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p(e,true)),$p(d)),Power(Plus(Times(Power($p(x),C4),$p(c,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Times(a,c),C2))),Plus(Times(Plus(Times(q,d),Times(a,e)),Power(Times(C2,a,c),CN1),Int(Times(Plus(q,Times(c,Power(x,C2))),Power(Plus(a,Times(c,Power(x,C4))),CN1)),x)),Times(Plus(Times(q,d),Times(CN1,a,e)),Power(Times(C2,a,c),CN1),Int(Times(Plus(q,Times(CN1,c,Power(x,C2))),Power(Plus(a,Times(c,Power(x,C4))),CN1)),x)))),And(And(And(FreeQ(List(a,c,d,e),x),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(a,Power(e,C2))))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,a,Power(e,C2))))),PosQ(Times(a,c))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p(e,true)),$p(d)),Power(Plus(Times(Power($p(x),C2),$p(b,true)),Times(Power($p(x),C4),$p(c,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Times(CN1,a,c),C2))),Plus(Times(CN1,Plus(Times(q,d),Times(CN1,a,e)),Power(Times(C2,a,c),CN1),Int(Times(Plus(q,Times(c,Power(x,C2))),Power(Plus(a,Times(b,Power(x,C2)),Times(c,Power(x,C4))),CN1)),x)),Times(CN1,Plus(Times(q,d),Times(a,e)),Power(Times(C2,a,c),CN1),Int(Times(Plus(q,Times(CN1,c,Power(x,C2))),Power(Plus(a,Times(b,Power(x,C2)),Times(c,Power(x,C4))),CN1)),x)))),And(And(And(And(FreeQ(List(a,b,c,d,e),x),NegativeQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,b,d,e),Times(a,Power(e,C2))))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,a,Power(e,C2))))),NegQ(Times(a,c,Power(Power(b,C2),CN1)))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p(e,true)),$p(d)),Power(Plus(Times(Power($p(x),C4),$p(c,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Times(CN1,a,c),C2))),Plus(Times(CN1,Plus(Times(q,d),Times(CN1,a,e)),Power(Times(C2,a,c),CN1),Int(Times(Plus(q,Times(c,Power(x,C2))),Power(Plus(a,Times(c,Power(x,C4))),CN1)),x)),Times(CN1,Plus(Times(q,d),Times(a,e)),Power(Times(C2,a,c),CN1),Int(Times(Plus(q,Times(CN1,c,Power(x,C2))),Power(Plus(a,Times(c,Power(x,C4))),CN1)),x)))),And(And(And(FreeQ(List(a,c,d,e),x),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(a,Power(e,C2))))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,a,Power(e,C2))))),NegQ(Times(a,c))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j)),$p(c,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Times(a,c),C2))),Condition(Module(List(Set(r,Rt(Plus(Times(C2,c,q),Times(CN1,b,c)),C2))),Plus(Times(c,Power(Times(C2,q,r),CN1),Int(Times(Plus(Times(d,r),Times(CN1,Plus(Times(c,d),Times(CN1,e,q)),Power(x,Times(C1D2,n)))),Power(Plus(q,Times(CN1,r,Power(x,Times(C1D2,n))),Times(c,Power(x,n))),CN1)),x)),Times(c,Power(Times(C2,q,r),CN1),Int(Times(Plus(Times(d,r),Times(Plus(Times(c,d),Times(CN1,e,q)),Power(x,Times(C1D2,n)))),Power(Plus(q,Times(r,Power(x,Times(C1D2,n))),Times(c,Power(x,n))),CN1)),x)))),Not(NegativeQ(Plus(Times(C2,c,q),Times(CN1,b,c)))))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NegativeQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,b,d,e),Times(a,Power(e,C2))))),EvenQ(n)),Greater(n,C2)),PosQ(Times(a,c))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),Power(Plus(Times(Power($p(x),$p(j)),$p(c,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Times(a,c),C2))),Condition(Module(List(Set(r,Rt(Times(C2,c,q),C2))),Plus(Times(c,Power(Times(C2,q,r),CN1),Int(Times(Plus(Times(d,r),Times(CN1,Plus(Times(c,d),Times(CN1,e,q)),Power(x,Times(C1D2,n)))),Power(Plus(q,Times(CN1,r,Power(x,Times(C1D2,n))),Times(c,Power(x,n))),CN1)),x)),Times(c,Power(Times(C2,q,r),CN1),Int(Times(Plus(Times(d,r),Times(Plus(Times(c,d),Times(CN1,e,q)),Power(x,Times(C1D2,n)))),Power(Plus(q,Times(r,Power(x,Times(C1D2,n))),Times(c,Power(x,n))),CN1)),x)))),Not(NegativeQ(Times(C2,c,q))))),And(And(And(And(And(FreeQ(List(a,c,d,e),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(a,Power(e,C2))))),EvenQ(n)),Greater(n,C2)),PositiveQ(Times(a,c))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j)),$p(c,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,Power(x,n))),m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),CN1)),x),x),And(And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,b,d,e),Times(a,Power(e,C2))))),IntegerQ(m)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(j)),$p(c,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(d,Times(e,Power(x,n))),m),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),CN1)),x),x),And(And(And(FreeQ(List(a,c,d,e,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(a,Power(e,C2))))),IntegerQ(m)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a,true)),CN1),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),$p(m))),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Power(Plus(d,Times(e,Power(x,n))),m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),CN1),x),x),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,b,d,e),Times(a,Power(e,C2))))),Not(IntegerQ(m))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(j)),$p(c,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),$p(n)),$p(e,true)),$p(d)),$p(m))),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Power(Plus(d,Times(e,Power(x,n))),m),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),CN1),x),x),And(And(And(FreeQ(List(a,c,d,e,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(a,Power(e,C2))))),Not(IntegerQ(m))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),C2),$p(b,true)),Times(Power($p(x),C4),$p(c,true)),$p(a)),CN1D2)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Plus(Power(b,C2),Times(CN1,C4,a,c)),C2))),Times(Power(Sqrt(a),CN1),Int(Times(Plus($s("A"),Times($s("B"),Power(x,C2))),Power(Times(Sqrt(Plus(C1,Times(C2,c,Power(x,C2),Power(Plus(b,Times(CN1,q)),CN1)))),Sqrt(Plus(C1,Times(C2,c,Power(x,C2),Power(Plus(b,q),CN1))))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B")),x),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),PositiveQ(a)),NegativeQ(c)),Or(PositiveQ(b),NegativeQ(b))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),C4),$p(c,true)),$p(a)),CN1D2)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Times(CN1,a,c),C2))),Times(Power(Sqrt(a),CN1),Int(Times(Plus($s("A"),Times($s("B"),Power(x,C2))),Power(Times(Sqrt(Plus(C1,Times(CN1,c,Power(x,C2),Power(q,CN1)))),Sqrt(Plus(C1,Times(c,Power(x,C2),Power(q,CN1))))),CN1)),x))),And(And(FreeQ(List(a,c,$s("A"),$s("B")),x),PositiveQ(a)),NegativeQ(c)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),C2),$p(b,true)),Times(Power($p(x),C4),$p(c,true)),$p(a)),CN1D2)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Plus(Power(b,C2),Times(CN1,C4,a,c)),C2))),Times(Sqrt(Plus(C1,Times(C2,c,Power(x,C2),Power(Plus(b,Times(CN1,q)),CN1)))),Sqrt(Plus(C1,Times(C2,c,Power(x,C2),Power(Plus(b,q),CN1)))),Power(Sqrt(Plus(a,Times(b,Power(x,C2)),Times(c,Power(x,C4)))),CN1),Int(Times(Plus($s("A"),Times($s("B"),Power(x,C2))),Power(Times(Sqrt(Plus(C1,Times(C2,c,Power(x,C2),Power(Plus(b,Times(CN1,q)),CN1)))),Sqrt(Plus(C1,Times(C2,c,Power(x,C2),Power(Plus(b,q),CN1))))),CN1)),x))),And(FreeQ(List(a,b,c,$s("A"),$s("B")),x),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),C4),$p(c,true)),$p(a)),CN1D2)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Times(CN1,a,c),C2))),Times(Sqrt(Plus(C1,Times(CN1,c,Power(x,C2),Power(q,CN1)))),Sqrt(Plus(C1,Times(c,Power(x,C2),Power(q,CN1)))),Power(Sqrt(Plus(a,Times(c,Power(x,C4)))),CN1),Int(Times(Plus($s("A"),Times($s("B"),Power(x,C2))),Power(Times(Sqrt(Plus(C1,Times(CN1,c,Power(x,C2),Power(q,CN1)))),Sqrt(Plus(C1,Times(c,Power(x,C2),Power(q,CN1))))),CN1)),x))),FreeQ(List(a,c,$s("A"),$s("B")),x))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Times(Plus($s("A"),Times($s("B"),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),PositiveIntegerQ(p)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Times(Plus($s("A"),Times($s("B"),Power(x,n))),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x),x),And(And(FreeQ(List(a,c,$s("A"),$s("B"),n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),PositiveIntegerQ(p)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p))),$p(x,SymbolHead)),
    Condition(Module(List(Set(g,Times(Sign(n),Power(Denominator(n),CN1)))),Times(Power(g,CN1),Subst(Int(Times(Power(x,Plus(Power(g,CN1),Times(CN1,C1))),Plus($s("A"),Times($s("B"),Power(x,Times(n,Power(g,CN1))))),Power(Plus(a,Times(b,Power(x,Times(n,Power(g,CN1)))),Times(c,Power(x,Times(C2,n,Power(g,CN1))))),p)),x),x,Power(x,g)))),And(And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),NonzeroQ(Plus(p,C1))),RationalQ(n)),Not(PositiveIntegerQ(n))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p))),$p(x,SymbolHead)),
    Condition(Module(List(Set(g,Times(Sign(n),Power(Denominator(n),CN1)))),Times(Power(g,CN1),Subst(Int(Times(Power(x,Plus(Power(g,CN1),Times(CN1,C1))),Plus($s("A"),Times($s("B"),Power(x,Times(n,Power(g,CN1))))),Power(Plus(a,Times(c,Power(x,Times(C2,n,Power(g,CN1))))),p)),x),x,Power(x,g)))),And(And(And(And(FreeQ(List(a,c,$s("A"),$s("B"),p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(p,C1))),RationalQ(n)),Not(PositiveIntegerQ(n))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Plus(Times(b,$s("B"),n,p),Times(c,$s("A"),Plus(Times(C2,n,p),n,C1)),Times(c,$s("B"),Plus(Times(C2,n,p),C1),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(c,Plus(Times(C2,n,p),C1),Plus(Times(C2,n,p),n,C1)),CN1)),Times(n,p,Power(Times(c,Plus(Times(C2,n,p),C1),Plus(Times(C2,n,p),n,C1)),CN1),Int(Times(Simp(Plus(Times(C2,a,c,$s("A"),Plus(Times(C2,n,p),n,C1)),Times(CN1,a,b,$s("B")),Times(Plus(Times(C2,a,c,$s("B"),Plus(Times(C2,n,p),C1)),Times(b,$s("A"),c,Plus(Times(C2,n,p),n,C1)),Times(CN1,Power(b,C2),$s("B"),Plus(Times(n,p),C1))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),RationalQ(p)),Greater(p,C0)),Not(IntegerQ(p))),NonzeroQ(Plus(Times(C2,n,p),C1))),NonzeroQ(Plus(Times(C2,n,p),n,C1))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Plus(Times($s("A"),Plus(Times(C2,n,p),n,C1)),Times($s("B"),Plus(Times(C2,n,p),C1),Power(x,n))),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p),Power(Times(Plus(Times(C2,n,p),C1),Plus(Times(C2,n,p),n,C1)),CN1)),Times(C2,a,n,p,Power(Times(Plus(Times(C2,n,p),C1),Plus(Times(C2,n,p),n,C1)),CN1),Int(Times(Plus(Times($s("A"),Plus(Times(C2,n,p),n,C1)),Times($s("B"),Plus(Times(C2,n,p),C1),Power(x,n))),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(And(And(FreeQ(List(a,c,$s("A"),$s("B"),n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),RationalQ(p)),Greater(p,C0)),Not(IntegerQ(p))),NonzeroQ(Plus(Times(C2,n,p),C1))),NonzeroQ(Plus(Times(C2,n,p),n,C1))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,x,Plus(Times($s("A"),Power(b,C2)),Times(CN1,a,b,$s("B")),Times(CN1,C2,a,c,$s("A")),Times(Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B"))),c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(a,n,Plus(p,C1),Plus(Power(b,C2),Times(CN1,C4,a,c))),CN1)),Times(Power(Times(a,n,Plus(p,C1),Plus(Power(b,C2),Times(CN1,C4,a,c))),CN1),Int(Times(Simp(Plus(Times(Plus(Times(n,p),n,C1),$s("A"),Power(b,C2)),Times(CN1,a,b,$s("B")),Times(CN1,C2,a,c,$s("A"),Plus(Times(C2,n,p),Times(C2,n),C1)),Times(Plus(Times(C2,n,p),Times(C3,n),C1),Plus(Times($s("A"),b),Times(CN1,C2,a,$s("B"))),c,Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),RationalQ(p)),Less(p,CN1)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,x,Plus($s("A"),Times($s("B"),Power(x,n))),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(C2,a,n,Plus(p,C1)),CN1)),Times(Power(Times(C2,a,n,Plus(p,C1)),CN1),Int(Times(Plus(Times($s("A"),Plus(Times(C2,n,p),Times(C2,n),C1)),Times($s("B"),Plus(Times(C2,n,p),Times(C3,n),C1),Power(x,n))),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),Plus(p,C1))),x))),And(And(And(FreeQ(List(a,c,$s("A"),$s("B"),n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),RationalQ(p)),Less(p,CN1)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p,true))),$p(x,SymbolHead)),
    Condition(Plus(Times($s("A"),Int(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),x)),Times($s("B"),Int(Times(Power(x,n),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x))),And(FreeQ(List(a,b,c,$s("A"),$s("B"),n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p,true))),$p(x,SymbolHead)),
    Condition(Plus(Times($s("A"),Int(Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p),x)),Times($s("B"),Int(Times(Power(x,n),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x))),And(FreeQ(List(a,c,$s("A"),$s("B"),n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(b,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),C4),$p(d,true)),$p(c)),CN1D2)),$p(x,SymbolHead)),
    Condition(Simp(Times(Power(Times(a,Sqrt(c),Sqrt(Times(CN1,Rt(Times(CN1,d,Power(c,CN1)),C2)))),CN1),EllipticPi(Times(b,Power(Times(a,Rt(Times(CN1,d,Power(c,CN1)),C2)),CN1)),ArcSin(Times(Sqrt(Times(CN1,Rt(Times(CN1,d,Power(c,CN1)),C2))),x)),CN1)),x),And(FreeQ(List(a,b,c,d),x),PositiveQ(c)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(b,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),C4),$p(d,true)),$p(c)),CN1D2)),$p(x,SymbolHead)),
    Condition(Times(Sqrt(Times(Plus(c,Times(d,Power(x,C4))),Power(c,CN1))),Power(Sqrt(Plus(c,Times(d,Power(x,C4)))),CN1),Int(Power(Times(Plus(a,Times(b,Power(x,C2))),Sqrt(Plus(C1,Times(d,Power(x,C4),Power(c,CN1))))),CN1),x)),And(FreeQ(List(a,b,c,d),x),Not(PositiveQ(c))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(b,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),C4),$p(d,true)),$p(c)),C1D2)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,d,Power(Power(b,C2),CN1),Int(Times(Plus(a,Times(CN1,b,Power(x,C2))),Power(Sqrt(Plus(c,Times(d,Power(x,C4)))),CN1)),x)),Times(Plus(Times(Power(b,C2),c),Times(Power(a,C2),d)),Power(Power(b,C2),CN1),Int(Power(Times(Plus(a,Times(b,Power(x,C2))),Sqrt(Plus(c,Times(d,Power(x,C4))))),CN1),x))),FreeQ(List(a,b,c,d),x))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(b,true)),Times(Power($p(x),C4),$p(c,true)),$p(a)),$p(p)),Power(Plus(Times(Power($p(x),C2),$p(e,true)),$p(d)),$p(m))),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Plus(Power(b,C2),Times(CN1,C4,a,c)),C2))),Times(Power(a,Plus(p,Times(CN1,C1D2))),Sqrt(Plus(a,Times(b,Power(x,C2)),Times(c,Power(x,C4)))),Power(Times(Sqrt(Plus(C1,Times(C2,c,Power(x,C2),Power(Plus(b,Times(CN1,q)),CN1)))),Sqrt(Plus(C1,Times(C2,c,Power(x,C2),Power(Plus(b,q),CN1))))),CN1),Int(Times(Power(Plus(d,Times(e,Power(x,C2))),m),Power(Plus(C1,Times(C2,c,Power(x,C2),Power(Plus(b,Times(CN1,q)),CN1))),p),Power(Plus(C1,Times(C2,c,Power(x,C2),Power(Plus(b,q),CN1))),p)),x))),And(And(And(FreeQ(List(a,b,c,d,e,m),x),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(CN1,b,d,e),Times(a,Power(e,C2))))),IntegerQ(Plus(p,Times(CN1,C1D2)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C4),$p(c,true)),$p(a)),$p(p)),Power(Plus(Times(Power($p(x),C2),$p(e,true)),$p(d)),$p(m))),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Times(CN1,a,c),C2))),Times(Power(a,Plus(p,Times(CN1,C1D2))),Sqrt(Plus(a,Times(c,Power(x,C4)))),Power(Times(Sqrt(Plus(C1,Times(CN1,c,Power(x,C2),Power(q,CN1)))),Sqrt(Plus(C1,Times(c,Power(x,C2),Power(q,CN1))))),CN1),Int(Times(Power(Plus(d,Times(e,Power(x,C2))),m),Power(Plus(C1,Times(CN1,c,Power(x,C2),Power(q,CN1))),p),Power(Plus(C1,Times(c,Power(x,C2),Power(q,CN1))),p)),x))),And(And(FreeQ(List(a,c,d,e,m),x),NonzeroQ(Plus(Times(c,Power(d,C2)),Times(a,Power(e,C2))))),IntegerQ(Plus(p,Times(CN1,C1D2)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(v),$p(n)),$p(b,true)),Times(Power($p(w),$p(j,true)),$p(c,true)),$p(a)),$p(p,true)),Power(Plus(Times(Power($p(u),$p(n)),$p(e,true)),$p(d)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Coefficient(u,x,C1),CN1),Subst(Int(Times(Power(Plus(d,Times(e,Power(x,n))),m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x,u)),And(And(And(And(And(FreeQ(List(a,b,c,d,e,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(u,Times(CN1,v)))),ZeroQ(Plus(u,Times(CN1,w)))),LinearQ(u,x)),NonzeroQ(Plus(u,Times(CN1,x)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(w),$p(j,true)),$p(c,true)),$p(a)),$p(p,true)),Power(Plus(Times(Power($p(u),$p(n)),$p(e,true)),$p(d)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Coefficient(u,x,C1),CN1),Subst(Int(Times(Power(Plus(d,Times(e,Power(x,n))),m),Power(Plus(a,Times(c,Power(x,Times(C2,n)))),p)),x),x,u)),And(And(And(And(FreeQ(List(a,c,d,e,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(u,Times(CN1,w)))),LinearQ(u,x)),NonzeroQ(Plus(u,Times(CN1,x))))))
  );
}