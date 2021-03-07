package movingfeaturesbetweenobjects.hidedelegate;
/**
 * 
 * @author mxcorrea
 *
 */
public class Client {

  public final String queryManagerOf(
      final Person person) {
    Person manager = person.getManager();
    return manager.getName();
  }
  
}
