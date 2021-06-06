package makingmethodcallssimpler.encapsulatedowncast;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class ContainerTest {

  @Test
  public void testContainerWithOneItem() {
    Container container = new Container("First Item");
    assertNotNull(container.getItemValue());
    assertTrue(container.getItemValue() instanceof String);
    String expectedValue = "First Item";
    assertEquals(expectedValue , container.getItemValue());
  }

}
