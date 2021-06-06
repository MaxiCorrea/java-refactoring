package dealingwithgeneralization.extractsubclass;
/**
 * 
 * @author mxcorrea
 *
 */
public class JobItem {

  private final int unitPrice;
  private final int quantity;
  
  public JobItem(
      final int unitPrice,
      final int quantity) {
    this.unitPrice = unitPrice;
    this.quantity = quantity;
  }
  
  public int getTotalPrice() {
    return getUnitPrice() * getQuantity();
  }
  
  public int getUnitPrice(){
   return unitPrice;
  }
  
  public int getQuantity() {
    return quantity;
  }
      
}
