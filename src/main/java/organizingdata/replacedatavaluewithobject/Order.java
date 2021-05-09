package organizingdata.replacedatavaluewithobject;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Order {

  private final String customer;
  
  public Order(
      final String customer) {
    this.customer = customer;
  }
  
  public final String getCustomer() {
    return customer;
  }
   
}
