package organizingdata.replacedatavaluewithobject;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Order {

  private final Customer customer;
  
  public Order(
      final String customerName) {
    customer = new Customer(customerName);
  }
  
  public final String getCustomerName() {
    return customer.getName();
  }
   
}
