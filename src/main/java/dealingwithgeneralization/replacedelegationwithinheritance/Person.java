package dealingwithgeneralization.replacedelegationwithinheritance;
/**
 * 
 * @author mxcorrea
 *
 */
public class Person {

  private String name;
  
  public Person() {
    this("");
  }
  
  public Person(
      final String name) {
    this.name = name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public String getLastName() {
    String fullName = getName();
    return fullName.substring(fullName.lastIndexOf(' ') + 1);
  }
  
}
