package organizingdata.replacetypecodewithclass;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {

  private Person person;

  @Test
  public void testBloodGroups() {
    person = new Person(Person.A);
    assertEquals(Person.A, person.getBloodGroup());
    person.setBloodGroup(Person.B);
    assertEquals(Person.B, person.getBloodGroup());
    person.setBloodGroup(Person.O);
    assertEquals(Person.O, person.getBloodGroup());
    person.setBloodGroup(Person.AB);
    assertEquals(Person.AB, person.getBloodGroup());
  }

}
