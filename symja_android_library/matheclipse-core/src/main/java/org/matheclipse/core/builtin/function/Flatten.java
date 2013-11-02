package org.matheclipse.core.builtin.function;

import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractCoreFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.list.algorithms.EvaluationSupport;

/**
 * TODO implement &quot;Flatten&quot; function (especially Flatten(list, 1) )
 * 
 */
public class Flatten extends AbstractCoreFunctionEvaluator {

	public Flatten() {
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkRange(ast, 2);

		IExpr arg1 = F.eval(ast.get(1));
		IAST resultList = F.List();
		if (ast.size() == 2) {
			if (arg1.isList()) {
				if (EvaluationSupport.flatten(F.List, (IAST) arg1, resultList)) {
					return resultList;
				}
			}
			return arg1;
		} else if (ast.size() == 3) {
			IExpr arg2 = F.eval(ast.get(2));
			if (arg1.isList()) {
				int level = Validate.checkIntType(arg2);
				if (level > 0) {
					if (EvaluationSupport.flatten(F.List, (IAST) arg1, resultList, 0, level)) {
						return resultList;
					}
				}
			}
			return arg1;
		}
		return null;
	}

	@Override
	public void setUp(ISymbol symbol) {
		symbol.setAttributes(ISymbol.HOLDALL);
	}
}