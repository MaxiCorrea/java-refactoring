package organizingdata.changevaluetoreference;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Order {
 
  private final Customer customer;
  
  public Order(
      final String customerName) {
    customer = Customer.create(customerName);
  }
  
  public final String getCustomerName() {
    return customer.getName();
  }
   
}
