package makingmethodcallssimpler.replaceparameterwithexplicitmethods;
/**
 * 
 * @author mxcorrea
 *
 */
public class Employee {
  
  public static final Employee createIngineer() {
    return new Engineer();
  }
  
  public static final Employee createSalesman() {
    return new Salesman();
  }
  
  public static final Employee createSysAdmin() {
    return new SysAdmin();
  }
  
}
