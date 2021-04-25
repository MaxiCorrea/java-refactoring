package movingfeaturesbetweenobjects.introducelocalextension;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class ClientClassTest {

  @Test
  public void testLocalExtensionToString() {
    UnmodificableClass arg = new UnmodificableClass("A", "B");
    ClientClass client = new ClientClass(arg);
    String expectedToString = "A-B";
    String actualToString = client.mothod1();
    assertEquals(expectedToString, actualToString);
  }

  @Test
  public void testLocalExtensionReverseToString() {
    UnmodificableClass arg = new UnmodificableClass("A", "B");
    ClientClass client = new ClientClass(arg);
    String expectedToString = "B-A";
    String actualToString = client.mothod2();
    assertEquals(expectedToString, actualToString);
  }
}
