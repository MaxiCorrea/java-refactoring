package simplifyingconditionalexpressions.replaceconditionalwithpolymorphism;
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

  @Override
  public int payAmount(Employee employee) {
    return employee.getMonthlySalary();
  }

}
