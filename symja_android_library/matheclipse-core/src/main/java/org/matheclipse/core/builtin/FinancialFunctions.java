package org.matheclipse.core.builtin;

import org.matheclipse.core.basic.ToggleFeature;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.parser.client.FEConfig;

public class FinancialFunctions {

	/**
	 * 
	 * See <a href="https://pangin.pro/posts/computation-in-static-initializer">Beware of computation in static
	 * initializer</a>
	 */
	private static class Initializer {

		private static void init() {
			if (ToggleFeature.FINANCE) {
				F.EffectiveInterest.setEvaluator(new EffectiveInterest());
				F.TimeValue.setEvaluator(new TimeValue());
				F.Annuity.setEvaluator(new Annuity());
				F.AnnuityDue.setEvaluator(new AnnuityDue());
			}
		}
	}

	private static class Annuity extends AbstractEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_2_3;
		}
	}

	private static class AnnuityDue extends AbstractEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_2_3;
		}
	}

	private static class EffectiveInterest extends AbstractEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			final IExpr a = ast.arg1();
			if (ast.size() == 2) {
				int dim = a.isVector();
				if (dim >= 0) {
					IAST l = ((IAST) a).map(x -> x.inc(), 1);
					return
					// [$ -1 + GeometricMean(l) $]
					F.Plus(F.CN1, F.GeometricMean(l)); // $$;
				}
				return F.NIL;
			}
			if (ast.size() == 3) {
				final IExpr b = ast.arg2();
				int dim = a.isVector();
				if (dim >= 0) {
					return ((IAST) a).map(x -> effectiveInterestFormula(x, b), 1);
				}
				return effectiveInterestFormula(a, b);
			}
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_1_2;
		}

		private IExpr effectiveInterestFormula(IExpr a, IExpr b) {
			if (b.isZero()) {
				return
				// [$ -1 + E^a $]
				F.Plus(F.CN1, F.Exp(a)); // $$;
			}
			return //
			// [$ -1 + (1 + a*b)^(1/b) $]
			F.Plus(F.CN1, F.Power(F.Plus(F.C1, F.Times(a, b)), F.Power(b, F.CN1))); // $$;
		}
	}

	private static class TimeValue extends AbstractEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			IExpr a = ast.arg1();
			IExpr b = ast.arg2();
			IExpr c = ast.arg3();
			if (a.isAST(F.Annuity, 3, 4)) {
				// https://en.wikipedia.org/wiki/Annuity
				IAST annuity = (IAST) a;
				try {
					IExpr q = F.C1;
					if (annuity.size() == 4) {
						q = annuity.arg3();
					}
					IExpr p = annuity.arg1();
					IExpr t = annuity.arg2();

					if (c.isZero()) {
						return //
								// [$ -((p - p/((1 + b)^q)^(t/q))/(1 - (1 + b)^q)) $]
						F.Times(F.CN1, F.Power(F.Subtract(F.C1, F.Power(F.Plus(F.C1, b), q)), F.CN1), F.Plus(p, F.Times(
								F.CN1,
								F.Power(F.Power(F.Power(F.Plus(F.C1, b), q), F.Times(F.Power(q, F.CN1), t)), F.CN1),
								p))); // $$;
					} else {
						return //
								// [$ (p*((1 + b)^q)^(-(t/q) + c/q)*(-1 + ((1 + b)^q)^(t/q)))/(-1 + (1 +
								// b)^q) $]
						F.Times(F.Power(F.Plus(F.CN1, F.Power(F.Plus(F.C1, b), q)), F.CN1),
								F.Power(F.Power(F.Plus(F.C1, b), q),
										F.Plus(F.Times(F.CN1, F.Power(q, F.CN1), t), F.Times(c, F.Power(q, F.CN1)))),
								F.Plus(F.CN1, F.Power(F.Power(F.Plus(F.C1, b), q), F.Times(F.Power(q, F.CN1), t))), p); // $$;
					}

				} catch (RuntimeException rex) {
					if (FEConfig.SHOW_STACKTRACE) {
						rex.printStackTrace();
					}
				}
				return F.NIL;
			}
			if (a.isAST(F.AnnuityDue, 3, 4)) {
				// https://en.wikipedia.org/wiki/Annuity
				IAST annuity = (IAST) a;
				try {
					IExpr q = F.C1;
					if (annuity.size() == 4) {
						q = annuity.arg3();
					}
					IExpr p = annuity.arg1();
					IExpr t = annuity.arg2();

					if (c.isZero()) {
						return //
								// [$ (p*((1 + b)^q)^(1 - t/q)*(-1 + ((1 + b)^q)^(t/q)))/(-1 + (1 + b)^q) $]
						F.Times(F.Power(F.Plus(F.CN1, F.Power(F.Plus(F.C1, b), q)), F.CN1),
								F.Plus(F.CN1, F.Power(F.Power(F.Plus(F.C1, b), q), F.Times(F.Power(q, F.CN1), t))),
								F.Power(F.Power(F.Plus(F.C1, b), q),
										F.Plus(F.C1, F.Times(F.CN1, F.Power(q, F.CN1), t))),
								p); // $$;
					} else {
						return //
								// [$ (p*((1 + b)^q)^(1 - t/q + c/q)*(-1 + ((1 + b)^q)^(t/q)))/(-1 + (1 +
								// b)^q) $]
						F.Times(F.Power(F.Plus(F.CN1, F.Power(F.Plus(F.C1, b), q)), F.CN1),
								F.Power(F.Power(F.Plus(F.C1, b), q),
										F.Plus(F.C1, F.Times(F.CN1, F.Power(q, F.CN1), t),
												F.Times(c, F.Power(q, F.CN1)))),
								F.Plus(F.CN1, F.Power(F.Power(F.Plus(F.C1, b), q), F.Times(F.Power(q, F.CN1), t))), p); // $$;
					}

				} catch (RuntimeException rex) {
					if (FEConfig.SHOW_STACKTRACE) {
						rex.printStackTrace();
					}
				}
				return F.NIL;
			}
			if (!a.isAST() && !b.isAST() && !c.isAST()) {
				return //
				// [$ a*(1 + b)^c $]
				F.Times(a, F.Power(F.Plus(F.C1, b), c)); // $$;
			}
			return F.NIL;
		}

		public int[] expectedArgSize() {
			return IOFunctions.ARGS_3_3;
		}
	}

	public static void initialize() {
		Initializer.init();
	}

	private FinancialFunctions() {

	}

}
