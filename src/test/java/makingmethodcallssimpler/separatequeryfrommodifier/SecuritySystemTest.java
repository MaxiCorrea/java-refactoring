package makingmethodcallssimpler.separatequeryfrommodifier;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class SecuritySystemTest {

  private static final String PERSONS[] = new String[] {"P0","Don","P2","John"};
  
  @Test
  public void testCheckSecurity() {
    SecuritySystem securitySystem = new SecuritySystem();
    assertFalse(securitySystem.foundMiscreant(PERSONS).isEmpty());
    securitySystem.checkSecurity(PERSONS);
  }

}
