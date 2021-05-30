package simplifyingconditionalexpressions.introducenullobject;
/**
 * 
 * @author mxcorrea
 *
 */
public class Customer implements Nullable {

  public static Customer newNull() {
    return new NullCustomer();
  }
  
  private String name;
  private BillingPlan plan;
  private PaymentHistory history;
  
  Customer() {}
  
  public Customer(
      final String name ,
      final BillingPlan plan ,
      final PaymentHistory history) {
    this.name = name;
    this.plan = plan;
    this.history = history;
  }
  
  @Override
  public boolean isNull() {
    return false;
  }
  
  public String getName() {
    return name;
  }
  
  public BillingPlan getPlan() {
    return plan;
  }
  
  public PaymentHistory getHistory() {
    return history;
  }
  
}
