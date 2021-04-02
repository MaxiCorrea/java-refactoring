package movingfeaturesbetweenobjects.removemiddleman;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ClientTest {
  
  @Test
  public void shouldSeeTheNameOfTheManager() {
    Client client = new Client();
    Department department = new Department("code", new Person("Alfred", null));
    Person person = new Person("Maxi", department);
    String expected = "Alfred";
    String actual = client.queryManagerOf(person);
    assertEquals(expected, actual);
  }

}
