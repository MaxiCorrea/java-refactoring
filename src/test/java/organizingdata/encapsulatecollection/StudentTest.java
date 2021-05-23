package organizingdata.encapsulatecollection;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class StudentTest {

  @Test
  public void testingAddAndRemoveCourses() {
    Student kent = new Student("Kent");
    Set<Course> s = new HashSet<>();
    s.add(new Course ("Smalltalk Programming", false));
    s.add(new Course ("Appreciating Single Malts", true));
    kent.setCourses(s);
    assertEquals(2, kent.getCourses().size());
    Course refact = new Course ("Refactoring", true);
    kent.getCourses().add(refact);
    kent.getCourses().add(new Course ("Brutal Sarcasm",false));
    assertEquals (4, kent.getCourses().size());
    kent.getCourses().remove(refact);
    assertEquals (3, kent.getCourses().size());
  }

}
