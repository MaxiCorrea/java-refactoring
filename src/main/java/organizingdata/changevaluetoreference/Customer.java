package organizingdata.changevaluetoreference;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Customer {

  private static final Map<String, Customer> INSTANCES = new HashMap<>();

  static void loadCustomers() {
    new Customer("Customer 1").store();
    new Customer("Customer 2").store();
    new Customer("Customer 3").store();
  }

  public static final Customer getNamed(
      final String name) {
    if(INSTANCES.get(name) == null) {
      new Customer(name).store();
    }
    return INSTANCES.get(name);
  }

  private final String name;

  private Customer(
      final String name) {
    this.name = name;
  }

  private void store() {
    INSTANCES.put(name, this);
  }

  public final String getName() {
    return name;
  }

}
