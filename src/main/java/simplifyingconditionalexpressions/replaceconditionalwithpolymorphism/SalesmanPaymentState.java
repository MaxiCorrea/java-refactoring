package simplifyingconditionalexpressions.replaceconditionalwithpolymorphism;
/**
 * 
 * @author mxcorrea
 *
 */
public final class SalesmanPaymentState implements PaymentType {

  @Override
  public int getTypeCode() {
    return PaymentType.SALESMAN;
  }

  @Override
  public int payAmount(Employee employee) {
    return employee.getMonthlySalary() + employee.getCommission();
  }

}
