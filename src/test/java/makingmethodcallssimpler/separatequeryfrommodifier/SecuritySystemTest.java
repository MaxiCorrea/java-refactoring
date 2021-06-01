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
  public void testFoundPerson() {
    SecuritySystem securitySystem = new SecuritySystem();
    assertFalse(securitySystem.foundPerson(PERSONS).isEmpty());
    assertTrue(securitySystem.foundPerson(new String[] {}).isEmpty());
  }

}
