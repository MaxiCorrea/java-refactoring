package organizingdata.changevaluetoreference;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Customer {

  public static final Customer create(
      final String name) {
    return new Customer(name);
  }
  
  private final String name;
  
  private Customer(
      final String name) {
    this.name = name;
  }
  
  public final String getName() { 
    return name;
  }
  
}
