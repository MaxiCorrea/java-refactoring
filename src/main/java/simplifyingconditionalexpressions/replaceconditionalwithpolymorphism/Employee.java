package simplifyingconditionalexpressions.replaceconditionalwithpolymorphism;

/**
 * 
 * @author mxcorrea
 *
 */
public class Employee {

  private PaymentType paymentType;
  private int monthlySalary;
  private int commission;
  private int bonus;

  Employee(
      final int paymentCode,
      final int monthlySalary,
      final int commission ,
      final int bonus) {
    this.setPaymentState(paymentCode);
    this.monthlySalary = monthlySalary;
    this.commission = commission;
    this.bonus = bonus;
  }

  public void setPaymentState(
      final int paymentCode) {
    paymentType = PaymentType.newType(paymentCode);
  }
  
  public int getPaymentCode() {
    return paymentType.getTypeCode();
  }

  public int getMonthlySalary() {
    return monthlySalary;
  }
  
  public int getCommission() {
    return commission;
  }
  
  public int getBonus() {
    return bonus;
  }
  
  public int payAmount() {
    return paymentType.payAmount(this);
  }

}
