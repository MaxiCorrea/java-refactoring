package organizingdata.replacedatavaluewithobject;

import java.util.List;

/**
 * 
 * @author mxcorrea
 *
 */
public final class OrderClient {

  private final List<Order> orders;
  
  public OrderClient(
      final List<Order> orders) {
    this.orders = orders;
  }
  
  public final int numberOfOrdersFor(
      final String customer) {
    int counter = 0;
    for(Order each : orders) 
      if(each.getCustomerName().equals(customer)) 
        ++counter;
    return counter;
  }
  
}
