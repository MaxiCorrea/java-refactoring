package dealingwithgeneralization.extractsubclass;
/**
 * 
 * @author mxcorrea
 *
 */
public class JobItem {

  private final int unitPrice;
  private final int quantity;
  private final boolean isLabor;
  private final Employee employee;
  
  public JobItem(
      final int unitPrice, 
      final int quantity, 
      final boolean isLabor,
      final Employee employee) {
    this.unitPrice = unitPrice;
    this.quantity = quantity;
    this.isLabor = isLabor;
    this.employee = employee;
  }

  public int getTotalPrice() {
    return getUnitPrice() * getQuantity();
  }
  
  public int getUnitPrice(){
   return (isLabor()) ? employee.getRate(): unitPrice;
  }
  
  public int getQuantity() {
    return quantity;
  }
  
  public boolean isLabor() {
    return isLabor;
  }
  
  public Employee getEmployee() {
    return employee;
  }
  
}
