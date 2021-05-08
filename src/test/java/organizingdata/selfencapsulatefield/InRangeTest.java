package organizingdata.selfencapsulatefield;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class InRangeTest {

  @Test
  public void testIncludesTrue() {
    InRange inRange = InRange.newInstance(5, 10);
    assertTrue(inRange.includes(6));
  }

  @Test
  public void testIncludesFalse() {
    InRange inRange = InRange.newInstance(5, 10);
    assertFalse(inRange.includes(1));
  }
  
}
