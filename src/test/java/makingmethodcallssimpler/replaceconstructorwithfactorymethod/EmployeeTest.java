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
  public void testCreateSalesmanInstanceWithTypeCode() {
    Employee employee = Employee.create(Employee.SALESMAN);
    assertNotNull(employee);
    assertTrue(employee instanceof Salesman);
  }
  
  @Test
  public void testCreateSysAdminInstanceWithTypeCode() {
    Employee employee = Employee.create(Employee.SYSADMIN);
    assertNotNull(employee);
    assertTrue(employee instanceof SysAdmin);
  }

  @Test
  public void testCreateSalesmanInstanceWithClassName() {
    Employee employee = Employee.create(Salesman.class.getName());
    assertNotNull(employee);
    assertTrue(employee instanceof Salesman);
  }
  
  @Test
  public void testCreateSysAdminInstanceWithClassName() {
    Employee employee = Employee.create(SysAdmin.class.getName());
    assertNotNull(employee);
    assertTrue(employee instanceof SysAdmin);
  }

  
}
