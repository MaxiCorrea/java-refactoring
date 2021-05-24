package organizingdata.replacetypecodewithclass;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {

  private Person person;

  @Test
  public void testBloodGroups() {
    person = new Person(BloodGroup.A);
    assertEquals(BloodGroup.A, person.getBloodGroup());
    person.setBloodGroup(BloodGroup.B);
    assertEquals(BloodGroup.B, person.getBloodGroup());
    person.setBloodGroup(BloodGroup.O);
    assertEquals(BloodGroup.O, person.getBloodGroup());
    person.setBloodGroup(BloodGroup.AB);
    assertEquals(BloodGroup.AB, person.getBloodGroup());
  }
  
}
