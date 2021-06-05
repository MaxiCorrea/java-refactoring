package makingmethodcallssimpler.replaceparameterwithexplicitmethods;
/**
 * 
 * @author mxcorrea
 *
 */
public class Employee {

  public static final int ENGINEER = 0;
  public static final int SALESMAN = 1;
  public static final int SYSADMIN = 2;
  
  public final static Employee create(
      final int type) {
    if(type == ENGINEER) {
      return new Engineer();
    }
    if(type == SALESMAN) {
      return new Salesman();
    }
    if(type == SYSADMIN) {
      return new SysAdmin();
    }
    throw new IllegalArgumentException("Invalid employee type argument.");
  }
    
}
