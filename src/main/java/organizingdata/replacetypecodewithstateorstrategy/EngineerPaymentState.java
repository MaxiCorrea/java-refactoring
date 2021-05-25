package organizingdata.replacetypecodewithstateorstrategy;
/**
 * 
 * @author mxcorrea
 *
 */
public final class EngineerPaymentState implements PaymentType {

  @Override
  public int getTypeCode() {
    return PaymentType.ENGINEER;
  }

}
