package movingfeaturesbetweenobjects.introduceforeignmethod;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class ClientClassTest {

  @Test
  public void testForeignMethod() {
   UnmodificableClass arg = new UnmodificableClass("A", "B");
   ClientClass client = new ClientClass(arg); 
   String expectedToString = "A-B";
   String actualToString = client.mothod();
   assertEquals(expectedToString, actualToString);
  }

}
