package simplifyingconditionalexpressions.introducenullobject;
/**
 * 
 * @author mxcorrea
 *
 */
public final class NullPaymentHistory extends PaymentHistory {

  @Override
  public boolean isNull() {
    return true;
  }
  
  @Override
  public int getWeeksDelinquentInLastYear() {
    return 0;
  }
  
}
