package movingfeaturesbetweenobjects.hidedelegate;
/**
 * 
 * @author mxcorrea
 *
 */
public class Person {

  private final String name;
  private final Department department;
  
  public Person(
      final String name,
      final Department department) {
    this.name = name;
    this.department = department;
  }
  
  public String getName() {
    return name;
  }
  
  public Person getManager() {
    return department.getManager();
  }
  
}
