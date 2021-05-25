package organizingdata.replacetypecodewithstateorstrategy;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class EmployeeTest {

  @Test
  public void testSalesmanPaymentPayAmount() {
    Employee employee = new Employee(PaymentType.SALESMAN, 100, 5 ,4);
    assertEquals(PaymentType.SALESMAN,employee.getPaymentCode());
    int expectedPayAmount = 105;
    assertEquals(expectedPayAmount , employee.payAmount());
  }
    
  @Test
  public void testEngineerPaymentPayAmount() {
    Employee employee = new Employee(PaymentType.ENGINEER, 100, 5 ,4);
    assertEquals(PaymentType.ENGINEER,employee.getPaymentCode());
    int expectedPayAmount = 100;
    assertEquals(expectedPayAmount , employee.payAmount());
  }
  
  @Test
  public void testManagerPaymentPayAmount() {
    Employee employee = new Employee(PaymentType.MANAGER, 100, 5 ,4);
    assertEquals(PaymentType.MANAGER,employee.getPaymentCode());
    int expectedPayAmount = 104;
    assertEquals(expectedPayAmount , employee.payAmount());
  }

  @Test
  public void testChangePaymentState() {
    Employee employee = new Employee(PaymentType.MANAGER, 100, 5 ,4);
    assertEquals(PaymentType.MANAGER,employee.getPaymentCode());
    int expectedPayAmount = 104;
    assertEquals(expectedPayAmount , employee.payAmount());
    employee.setPaymentState(PaymentType.ENGINEER);
    assertEquals(PaymentType.ENGINEER,employee.getPaymentCode());
    expectedPayAmount = 100;
    assertEquals(expectedPayAmount , employee.payAmount());
    employee.setPaymentState(PaymentType.SALESMAN);
    assertEquals(PaymentType.SALESMAN,employee.getPaymentCode());
    expectedPayAmount = 105;
    assertEquals(expectedPayAmount , employee.payAmount());
  }
  
}
