package makingmethodcallssimpler.renamemethod;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class PersonTest {

  @Test
  public void testOfficeTelephoneNumber() {
    Person person = new Person("Maximiliano","+54", "1154678900");
    String expectedTelephoneNumber = "(+54) 1154678900";
    String actualTelephoneNumber = person.getOfficeTelephoneNumber();
    assertEquals(expectedTelephoneNumber, actualTelephoneNumber);
  }

}
