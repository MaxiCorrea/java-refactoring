package organizingdata.replacetypecodewithstateorstrategy;

/**
 * 
 * @author mxcorrea
 *
 */
public class Employee {

  public static final int ENGINEER = 0;
  public static final int SALESMAN = 1;
  public static final int MANAGER = 2;

  private int paymentCode;
  private int monthlySalary;
  private int commission;
  private int bonus;

  Employee(
      final int paymentCode,
      final int monthlySalary,
      final int commission ,
      final int bonus) {
    this.paymentCode = paymentCode;
    this.monthlySalary = monthlySalary;
    this.commission = commission;
    this.bonus = bonus;
  }

  public int getPaymentCode() {
    return paymentCode;
  }

  public int payAmount() {
    switch (getPaymentCode()) {
      case Employee.ENGINEER:
        return monthlySalary;
      case Employee.SALESMAN:
        return monthlySalary + commission;
      case Employee.MANAGER:
        return monthlySalary + bonus;
      default:
        throw new RuntimeException("Incorrect Employee");
    }
  }

}
