package organizingdata.changereferencetovalue;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class CurrencyTest {

  @Test
  public void testEqualsCurrency() {
    assertTrue(Currency.get("PES").equals(Currency.get("PES")));
  }
  
  @Test
  public void testNotEqualsCurrency() {
    assertFalse(Currency.get("PES").equals(Currency.get("DOL")));
  }

}
