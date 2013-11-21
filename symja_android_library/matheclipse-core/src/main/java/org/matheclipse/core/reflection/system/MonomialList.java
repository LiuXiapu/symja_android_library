package org.matheclipse.core.reflection.system;

import java.util.List;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.convert.ExprVariables;
import org.matheclipse.core.convert.JASIExpr;
import org.matheclipse.core.convert.JASModInteger;
import org.matheclipse.core.eval.exception.JASConversionException;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.eval.util.Options;
import org.matheclipse.core.expression.ExprRingFactory;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISignedNumber;
import org.matheclipse.core.interfaces.IStringX;
import org.matheclipse.core.interfaces.ISymbol;

import edu.jas.arith.ModLong;
import edu.jas.arith.ModLongRing;
import edu.jas.poly.ExpVector;
import edu.jas.poly.GenPolynomial;
import edu.jas.poly.Monomial;
import edu.jas.poly.TermOrder;

/**
 * Get the list of monmials of a polynomial expression.
 * 
 * See <a href="http://en.wikipedia.org/wiki/Monomial">Wikipedia - Monomial<a/>
 */
public class MonomialList extends AbstractFunctionEvaluator {

	public MonomialList() {
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkRange(ast, 2, 5);

		IExpr expr = F.evalExpandAll(ast.arg1());
		ExprVariables eVar;
		if (ast.size() == 2) {
			eVar = new ExprVariables(ast.arg1());
		} else {
			IAST symbolList = Validate.checkSymbolOrSymbolList(ast, 2);
			eVar = new ExprVariables(symbolList);
		}
		int termOrder = TermOrder.INVLEX;
		try {
			if (ast.size() > 3) {
				if (ast.arg3() instanceof IStringX) {
					String orderStr = ast.arg3().toString();
					if (orderStr.equals("DegreeLexicographic")) {
						termOrder = TermOrder.LEX;
					}
				}
				final Options options = new Options(ast.topHead(), ast, 2);
				IExpr option = options.getOption("Modulus");
				if (option != null && option.isSignedNumber()) {
					return monomialListModulus(expr, eVar.getArrayList(), termOrder, option);
				}
			}
			return monomialList(expr, eVar.getArrayList(), termOrder);
		} catch (JASConversionException jce) {
			// toInt() conversion failed
			if (Config.DEBUG) {
				jce.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * Get the monomial list of a univariate polynomial.
	 * 
	 * @param polynomial
	 * @param variable
	 * @param termOrder
	 *            the JAS term ordering
	 * @return the list of monomials of the univariate polynomial.
	 */
	public static IAST monomialList(IExpr polynomial, final List<IExpr> variablesList, final int termOrder)
			throws JASConversionException {
		JASIExpr jas = new JASIExpr(variablesList, new ExprRingFactory(), new TermOrder(termOrder));
		GenPolynomial<IExpr> polyExpr = jas.expr2IExprJAS(polynomial);
		IAST list = F.List();
		for (Monomial<IExpr> monomial : polyExpr) {
			IExpr coeff = monomial.coefficient();
			ExpVector exp = monomial.exponent();
			IAST monomTimes = F.Times(coeff);
			long lExp;
			ISymbol variable;
			for (int i = 0; i < exp.length(); i++) {
				lExp = exp.getVal(i);
				if (lExp != 0) {
					variable = (ISymbol) variablesList.get(i);
					monomTimes.add(F.Power(variable, F.integer(lExp)));
				}
			}
			list.add(monomTimes);
		}
		return list;
	}

	/**
	 * Get the monomial list of a univariate polynomial with coefficients reduced by a modulo value.
	 * 
	 * @param polynomial
	 * @param variable
	 * @param termOrder
	 *            the JAS term ordering
	 * @param option
	 *            the &quot;Modulus&quot; option
	 * @return the list of monomials of the univariate polynomial.
	 */
	private static IAST monomialListModulus(IExpr polynomial, List<IExpr> variablesList, final int termOrder, IExpr option)
			throws JASConversionException {
		try {
			// found "Modulus" option => use ModIntegerRing
			ModLongRing modIntegerRing = JASModInteger.option2ModLongRing((ISignedNumber) option);
			JASModInteger jas = new JASModInteger(variablesList, modIntegerRing);
			GenPolynomial<ModLong> polyExpr = jas.expr2JAS(polynomial);
			IAST list = F.List();
			for (Monomial<ModLong> monomial : polyExpr) {
				ModLong coeff = monomial.coefficient();
				ExpVector exp = monomial.exponent();
				IAST monomTimes = F.Times(F.integer(coeff.getVal()));
				long lExp;
				ISymbol variable;
				for (int i = 0; i < exp.length(); i++) {
					lExp = exp.getVal(i);
					if (lExp != 0) {
						variable = (ISymbol) variablesList.get(i);
						monomTimes.add(F.Power(variable, F.integer(lExp)));
					}
				}
				list.add(monomTimes);
			}
			return list;
		} catch (ArithmeticException ae) {
			// toInt() conversion failed
			if (Config.DEBUG) {
				ae.printStackTrace();
			}
		}
		return null;
	}

}