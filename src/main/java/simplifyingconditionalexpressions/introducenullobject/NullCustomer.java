package simplifyingconditionalexpressions.introducenullobject;
/**
 * 
 * @author mxcorrea
 *
 */
public final class NullCustomer extends Customer {

  @Override
  public boolean isNull() {
    return true;
  }
 
  @Override
  public String getName() {
    return "occupant";
  }
  
  @Override
  public BillingPlan getPlan() {
    return BillingPlan.basic();
  }
  
  @Override
  public PaymentHistory getHistory() {
    return PaymentHistory.newNull();
  }
}
