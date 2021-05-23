package organizingdata.movingbehaviorintotheclass;

import static java.util.Collections.unmodifiableSet;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Student {

  private String name;
  private Set<Course> courses;
  
  public Student(
      final String name) {
    this.name = name;
    this.courses = new HashSet<>();
  }
  
  public void initializeCourses(
      final Set<Course> courses) {
    assert this.courses.isEmpty();
    this.courses.addAll(courses);
  }
  
  public int numberOfAdvancedCourses() {
    int advancedCourses = 0;
    for(Course c : courses) 
      if(c.isAdvance()) 
        ++advancedCourses;
    return advancedCourses;
  }
  
  public String getName() {
    return name;
  }
  
  public int numberOfCourses() {
    return courses.size();
  }
  
  public void addCourse(
      final Course course) {
    this.courses.add(course);
  }
  
  public void removeCourse(
      final Course course) {
    this.courses.remove(course);
  }
  
  public Set<Course> getCourses() {
    return unmodifiableSet(this.courses);
  }
   
}
