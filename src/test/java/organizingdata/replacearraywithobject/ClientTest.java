package organizingdata.replacearraywithobject;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class ClientTest {

  @Test
  public void testPerformanceData() {
    Client client = new Client( new Performance("Liverpool",15));
    String expectedName = "Liverpool";
    assertEquals(expectedName , client.getName());
    Integer expectedWins = 15;
    assertEquals(expectedWins , client.getWins());
  }

}
