package makingmethodcallssimpler.preservewholeobject;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class RoomTest {

  @Test
  public void testWithinPlan() {
    Room room = new Room(new HeatingPlan(new TempRange(0, 10)));
    assertTrue(room.withinPlan(new HeatingPlan(new TempRange(-2, 40))));
    assertFalse(room.withinPlan(new HeatingPlan(new TempRange(1, 9))));
  }

}
