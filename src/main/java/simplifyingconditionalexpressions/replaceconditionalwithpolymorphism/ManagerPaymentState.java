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

  @Override
  public int payAmount(
      final Employee employee) {
    return employee.getMonthlySalary() + employee.getBonus();
  }

}
