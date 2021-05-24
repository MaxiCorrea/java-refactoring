package organizingdata.replacetypecodewithsubclasses;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Manager extends Employee {

  Manager() {
    super(Employee.MANAGER);
  }

  @Override
  public int getPaymentCode() {
    return Employee.MANAGER;
  }
}
