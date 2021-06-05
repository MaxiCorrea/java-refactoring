package makingmethodcallssimpler.replaceconstructorwithfactorymethod;
/**
 * 
 * @author mxcorrea
 *
 */
public class Employee {
  
  public static final int SALESMAN = 0;
  public static final int SYSADMIN = 1;
  
  public static final Employee create(
      final int typeCode) {
    if(typeCode == SALESMAN) {
      return new Salesman();
    }
    if(typeCode == SYSADMIN) {
      return new SysAdmin();
    }
    throw new IllegalArgumentException("Invalida Type Code");
  }
  
  public static final Employee create(
      final String className) {
    try {
      return (Employee) Class.forName(className).getDeclaredConstructor().newInstance();
    } catch(Exception ex) {
      throw new IllegalArgumentException("Invalida Class Name");
    }
  }
  
  public static final Employee createSalesman() {
    return new Salesman();
  }
  
  public static final Employee createSysAdmin() {
    return new SysAdmin();
  }
  
  private final int typeCode;
  
  Employee(
      final int typeCode) {
    this.typeCode = typeCode;
  }
  
  public int getTypeCode() {
    return typeCode;
  }
  
}
