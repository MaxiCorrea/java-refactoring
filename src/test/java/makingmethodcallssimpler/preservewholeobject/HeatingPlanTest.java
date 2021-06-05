package makingmethodcallssimpler.preservewholeobject;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class HeatingPlanTest {

  @Test
  public void testWithinRange() {
    TempRange range = new TempRange(10,30);
    HeatingPlan heatingPlan = new HeatingPlan(range);
    assertTrue(heatingPlan.withinRange(new TempRange(15, 20)));
    assertFalse(heatingPlan.withinRange(new TempRange(9, 50)));
  }

}
