package simplifyingconditionalexpressions.removecontrolflag;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Collection;
import org.junit.Test;

/**
 * 
 * @author mxcorrea
 *
 */
public class PolicemanTest {

  private final Collection<People> allowed = asList(new People("P1"), new People("P2"));
  private final Collection<People> withAllowed = asList(new People("P1"), new People("P3"));
  private final Collection<People> notAllowed = asList(new People("P4"), new People("P5"));

  @Test
  public void testCheckPeopleSecurity() {
    Policeman policeman = new Policeman(allowed);
    assertTrue(policeman.checkSecurity(withAllowed));
    assertFalse(policeman.checkSecurity(notAllowed));
  }

}
