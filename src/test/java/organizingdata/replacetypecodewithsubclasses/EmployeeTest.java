package organizingdata.replacetypecodewithsubclasses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class EmployeeTest {

  @Test
  public void testSalesmanPaymentCreation() {
    Employee employee = Employee.create(Employee.SALESMAN);
    assertEquals(Employee.SALESMAN , employee.getPaymentCode());
    assertTrue(employee instanceof Salesman);
  }

  @Test
  public void testEngineerPaymentCreation() {
    Employee employee = Employee.create(Employee.ENGINEER);
    assertEquals(Employee.ENGINEER , employee.getPaymentCode());
    assertTrue(employee instanceof Engineer);
  }
  
  @Test
  public void testManagerPaymentCreation() {
    Employee employee = Employee.create(Employee.MANAGER);
    assertEquals(Employee.MANAGER , employee.getPaymentCode());
    assertTrue(employee instanceof Manager);
  }
  
}
