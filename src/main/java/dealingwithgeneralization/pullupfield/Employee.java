package dealingwithgeneralization.pullupfield;
/**
 * 
 * @author mxcorrea
 *
 */
public class Employee {
 
  private final String name;
  
  public Employee(
      final String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
}
