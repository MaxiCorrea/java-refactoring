package makingmethodcallssimpler.preservewholeobject;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class TempRangeTest {

  @Test(expected = IllegalArgumentException.class)
  public void testCreateObjectWithLowGreaterHigh() {
    new TempRange(30, 20);
    fail("Should throw IllegalArgumentException for low > high");
  }
  
  @Test
  public void testCreateObjectInstance() {
    TempRange range = new TempRange(0, 10);
    assertNotNull(range);
    int expectedLow = 0;
    int expectedHigh = 10;
    assertEquals(expectedLow, range.getLow());
    assertEquals(expectedHigh, range.getHigh());
  }

}
