package organizingdata.unidirectionalassociationtobidirectional;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Customer {

  private final Set<Order> orderSet;
  
  public Customer() {
    orderSet = new HashSet<>();
  }
  
  public final void addOrder(
      final Order newOrder) {
    newOrder.setCustomer(this);
  }
  
  Set<Order> friendOrders() {
    return orderSet;
  }
  
  @Override
  public boolean equals(Object obj) {
    return reflectionEquals(this, obj);
  }
  
  @Override
  public int hashCode() {
    return reflectionHashCode(this);
  }
  
}
