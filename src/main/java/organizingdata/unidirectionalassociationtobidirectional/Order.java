package organizingdata.unidirectionalassociationtobidirectional;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Order {

  private Customer customer;
  
  public Order(
      final Customer customer) {
    this.customer = customer;
  }
  
  public final void setCustomer(
      final Customer customer) {
    this.customer = customer;
  }
  
  public final Customer getCustomer() {
    return customer;
  }
  
}
