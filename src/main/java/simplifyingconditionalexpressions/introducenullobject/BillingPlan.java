package simplifyingconditionalexpressions.introducenullobject;
/**
 * 
 * @author mxcorrea
 *
 */
public final class BillingPlan {

  public static BillingPlan basic() {
    return new BillingPlan(0);
  }
  
  private int weeksDelinquentInLastYear;
  
  public BillingPlan(
      final int weeksDelinquentInLastYear) {
    this.weeksDelinquentInLastYear = weeksDelinquentInLastYear;
  }
  
  public int getWeeksDelinquentInLastYear() {
    return weeksDelinquentInLastYear;
  }

}
