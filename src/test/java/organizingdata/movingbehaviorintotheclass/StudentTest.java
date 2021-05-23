package organizingdata.movingbehaviorintotheclass;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
/**
 * t;
 * @author mxcorrea
 *
 */
public class StudentTest {

  @Test
  public void testingAddAndRemoveCourses() {
    Student kent = new Student("Kent");
    Set<Course> s = new HashSet<>();
    s.add(new Course ("Smalltalk Programming", false));
    s.add(new Course ("Appreciating Single Malts", true));
    kent.initializeCourses(s);
    assertEquals(2, kent.numberOfCourses());
    Course refact = new Course ("Refactoring", true);
    kent.addCourse(refact);
    kent.addCourse(new Course ("Brutal Sarcasm",false));
    assertEquals (4, kent.numberOfCourses());
    kent.removeCourse(refact);
    assertEquals (3, kent.numberOfCourses());
  }

  @Test
  public void testingFoundAdvancedCources() {
    Student kent = new Student("Kent");
    Set<Course> s = new HashSet<>();
    s.add(new Course ("Smalltalk Programming", false));
    s.add(new Course ("Appreciating Single Malts", true));
    s.add(new Course ("Functional Programming", true));
    kent.initializeCourses(s);
    int expectedAdvancedCourses = 2;
    int actualAdvancedCourses = kent.numberOfAdvancedCourses();
    assertEquals(expectedAdvancedCourses , actualAdvancedCourses);
  }
  

}
