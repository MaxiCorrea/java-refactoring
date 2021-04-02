package movingfeaturesbetweenobjects.removemidleman;
/**
 * 
 * @author mxcorrea
 *
 */
public class Client {

  public final String queryManagerOf(
      final Person person) {
    Department department = person.getDepartment();
    Person manager = department.getManager();
    return manager.getName();
  }
  
}
