package dealingwithgeneralization.extractsubclass;
/**
 * 
 * @author mxcorrea
 *
 */
public final class LaborItem extends JobItem {

  private final Employee employee;
  
  public LaborItem(
      final int quantity, 
      final Employee employee) {
    super(0, quantity);
    this.employee = employee;
  }
  
  @Override
  public int getUnitPrice(){
    return employee.getRate();
  }

  public Employee getEmployee() {
    return employee;
  }

}
