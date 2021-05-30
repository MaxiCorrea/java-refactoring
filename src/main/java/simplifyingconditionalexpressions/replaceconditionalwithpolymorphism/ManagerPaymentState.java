package simplifyingconditionalexpressions.replaceconditionalwithpolymorphism;
/**
 * 
 * @author mxcorrea
 *
 */
public final class ManagerPaymentState implements PaymentType {

  @Override
  public int getTypeCode() {
    return PaymentType.MANAGER;
  }

}
