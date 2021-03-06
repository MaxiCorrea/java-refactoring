package organizingdata.replacesubclasswithfields;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class PersonTest {

  @Test
  public void testCreationOfObjectMale() {
    Person male = Person.createMale();
    assertEquals('M' , male.getCode());
    assertTrue(male.isMale());
  }

  @Test
  public void testCreationOfObjectFemale() {
    Person female = Person.createFemale();
    assertEquals('F' , female.getCode());
    assertFalse(female.isMale());
  }
  
}
