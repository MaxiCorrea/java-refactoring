package dealingwithgeneralization.pullupconstructorbody;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class ManagerTest {

  @Test
  public void testManagerInstance() {
    Manager manager = new Manager("Max", 1, 4);
    assertEquals("Max", manager.getName());
    assertEquals(1 , manager.getId());
    assertEquals(4 , manager.getGrade());
  }

}
