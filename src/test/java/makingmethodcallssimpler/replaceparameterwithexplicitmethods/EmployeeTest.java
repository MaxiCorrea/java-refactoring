package makingmethodcallssimpler.replaceparameterwithexplicitmethods;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class EmployeeTest {

  private static final int INVALID_CODE_TYPE = -1;

  @Test(expected = IllegalArgumentException.class)
  public void testCreateInvalidEmployeeType() {
    Employee.create(INVALID_CODE_TYPE);
    fail("should throw invalid argument exception for invalid code type");
  }

  @Test
  public void testCreateEngineerObjectInstance() {
    Employee engineer = Employee.create(Employee.ENGINEER);
    assertNotNull(engineer);
    assertTrue(engineer instanceof Engineer);
  }
  
  @Test
  public void testCreateSysAdminObjectInstance() {
    Employee sysadmin = Employee.create(Employee.SYSADMIN);
    assertNotNull(sysadmin);
    assertTrue(sysadmin instanceof SysAdmin);
  }
  
  @Test
  public void testCreateSalesmanObjectInstance() {
    Employee salesman = Employee.create(Employee.SALESMAN);
    assertNotNull(salesman);
    assertTrue(salesman instanceof Salesman);
  }
  
}
