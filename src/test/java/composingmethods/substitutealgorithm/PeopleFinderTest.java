package composingmethods.substitutealgorithm;

import static org.junit.Assert.*;
import org.junit.Test;

public class PeopleFinderTest {

  @Test
  public void testFoundPeopleNotFound() {
    PeopleFinder finder = new PeopleFinder("a", "b", "c");
    assertTrue(finder.foundPerson(
        new People.Builder().name("Maxi").surname("Correa").age(29).build(), 
        new People.Builder().name("Juan").surname("Montero").age(34).build())
        .isEmpty()
    );
  }

  @Test
  public void testFoundPeopleFound() {
    PeopleFinder finder = new PeopleFinder("a", "b", "c");
    assertEquals(finder.foundPerson(
        new People.Builder().name("a").surname("Correa").age(29).build(), 
        new People.Builder().name("Juan").surname("Montero").age(34).build())
        , "a"
    );
  }

}
