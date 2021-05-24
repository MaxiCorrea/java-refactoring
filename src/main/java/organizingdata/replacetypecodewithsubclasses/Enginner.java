package organizingdata.replacetypecodewithsubclasses;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Enginner extends Employee {
  
  public Enginner() {
    super(Employee.ENGINNER);
  }
  
  @Override
  public int getPaymentCode() {
    return Employee.ENGINNER;
  }

}
