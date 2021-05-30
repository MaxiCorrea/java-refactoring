package simplifyingconditionalexpressions.introducenullobject;

import java.util.Objects;

/**
 * 
 * @author mxcorrea
 *
 */
public class Client {

  private Site site;
  
  public Client(
      final Site site) {
    this.site = Objects.requireNonNull(site);
  }
  
  public void compute() {
    Customer customer = site.getCustomer();
    customer.getPlan();
    customer.getName();
    customer.getHistory().getWeeksDelinquentInLastYear();
  }
  
}
