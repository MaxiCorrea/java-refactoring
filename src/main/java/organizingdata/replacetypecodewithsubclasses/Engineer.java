package organizingdata.replacetypecodewithsubclasses;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Engineer extends Employee {
  
  public Engineer() {
    super(Employee.ENGINEER);
  }
  
  @Override
  public int getPaymentCode() {
    return Employee.ENGINEER;
  }

}
