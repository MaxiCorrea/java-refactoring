package makingmethodcallssimpler.replaceparameterwithexplicitmethods;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class EmployeeTest {

  @Ignore
  @Test(expected = IllegalArgumentException.class)
  public void testCreateInvalidEmployeeType() {
    //Employee.create(INVALID_CODE_TYPE);
    fail("should throw invalid argument exception for invalid code type");
  }

  @Test
  public void testCreateEngineerObjectInstance() {
    Employee engineer = Employee.createIngineer();
    assertNotNull(engineer);
    assertTrue(engineer instanceof Engineer);
  }
  
  @Test
  public void testCreateSysAdminObjectInstance() {
    Employee sysadmin = Employee.createSysAdmin();
    assertNotNull(sysadmin);
    assertTrue(sysadmin instanceof SysAdmin);
  }
  
  @Test
  public void testCreateSalesmanObjectInstance() {
    Employee salesman = Employee.createSalesman();
    assertNotNull(salesman);
    assertTrue(salesman instanceof Salesman);
  }
  
}
