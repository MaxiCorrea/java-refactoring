package simplifyingconditionalexpressions.introducenullobject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author mxcorrea
 *
 */
public class PaymentHistory implements Nullable {

  public static PaymentHistory newNull() {
    return new NullPaymentHistory();
  }
  
  private final List<BillingPlan> plans;
  
  public PaymentHistory(
      final Collection<BillingPlan> plans) {
    this.plans = new ArrayList<>();
    this.plans.addAll(plans);
  }
  
  PaymentHistory() {
    plans = Collections.emptyList();
  }
  
  public int getWeeksDelinquentInLastYear() {
    int count = 0;
    for(BillingPlan each : plans) 
      count += each.getWeeksDelinquentInLastYear();
    return count;
  }

  @Override
  public boolean isNull() {
    return false;
  }

}
