package organizingdata.bidirectionalassociationtounidirectional;

import static java.util.Objects.requireNonNull;
import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Order {

  private Customer customer;
  
  public Order(
      final Customer customer) {
    this.customer = requireNonNull(customer);
    this.customer.friendOrders().remove(this);
    this.customer.friendOrders().add(this);
  }
  
  public final void setCustomer(
      final Customer newCustomer) {
    this.customer.friendOrders().remove(this);
    this.customer = requireNonNull(newCustomer);
    this.customer.friendOrders().add(this);
  }
  
  public final Customer getCustomer() {
    return customer;
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
