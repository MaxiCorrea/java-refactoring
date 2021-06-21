package dealingwithgeneralization.replacedelegationwithinheritance;

import static org.junit.Assert.*;
import org.junit.Test;

public class EmployeeTest {

  @Test
  public void testEmployeeNameAndLastName() {
    Employee employee = new Employee();
    employee.setName("Maximiliano Correa");
    String expectedFullName = "Maximiliano Correa";
    assertEquals(expectedFullName , employee.getName());
    String expectedLastName = "Correa";
    assertEquals(expectedLastName , employee.getLastName());
  }

}
