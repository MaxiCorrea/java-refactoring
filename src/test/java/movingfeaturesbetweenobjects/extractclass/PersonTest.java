package movingfeaturesbetweenobjects.extractclass;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class PersonTest {

  @Test
  public void shouldFormatThePhoneNumber() {
    Person person = new Person("Maxi","15","45678890");
    String expected = "(15) 45678890";
    String actual = person.getTelephoneNumber();
    assertEquals(expected , actual);
  }

}
