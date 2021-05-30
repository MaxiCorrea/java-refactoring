package simplifyingconditionalexpressions.introducenullobject;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Site {

  private Customer customer;
  
  public Site(
      final Customer customer) {
    this.customer = customer;
  }
  
  public Customer getCustomer() {
    return customer == null ? Customer.newNull() : customer;
  }
  
}
