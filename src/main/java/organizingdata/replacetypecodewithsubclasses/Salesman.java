package organizingdata.replacetypecodewithsubclasses;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Salesman extends Employee {

  Salesman() {
    super(Employee.SALESMAN);
  }
  
  @Override
  public int getPaymentCode() {
    return Employee.SALESMAN;
  }

}
