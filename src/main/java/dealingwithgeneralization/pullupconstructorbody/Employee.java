package dealingwithgeneralization.pullupconstructorbody;
/**
 * 
 * @author mxcorrea
 *
 */
public class Employee {

  private String name;
  private int id;
  
  public Employee(
      final String name,
      final int id) {
    this.name = name;
    this.id = id;
  }
  
  public int getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }
  
}
