package composingmethods.explainingvariable;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class PlatformTest {

  @Test
  public void testMacSystemWithInternetExplorerIsSupported() {
    Platform platform = new Platform("MAC", "IE");
    assertTrue(platform.isSupported());
  }

}
