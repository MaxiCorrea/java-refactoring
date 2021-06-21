package dealingwithgeneralization.replacedelegationwithinheritance;

/**
 * 
 * @author mxcorrea
 *
 */
public class Employee {

  Person person = new Person();

  public String getName() {
    return person.getName();
  }

  public void setName(
      final String name) {
    person.setName(name);
  }

  public Object getLastName() {
    return person.getLastName();
  }

}
