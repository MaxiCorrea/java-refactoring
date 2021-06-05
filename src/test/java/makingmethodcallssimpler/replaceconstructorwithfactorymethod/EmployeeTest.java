package makingmethodcallssimpler.replaceconstructorwithfactorymethod;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class EmployeeTest {

  @Test
  public void testCreateSalesmanInstance() {
    Employee employee = Employee.create(Employee.SALESMAN);
    assertNotNull(employee);
    assertTrue(employee instanceof Salesman);
  }
  
  @Test
  public void testCreateSysAdminInstance() {
    Employee employee = Employee.create(Employee.SYSADMIN);
    assertNotNull(employee);
    assertTrue(employee instanceof SysAdmin);
  }

}
