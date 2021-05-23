package organizingdata.encapsulatecollection;

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
  }
  
  public String getName() {
    return name;
  }
  
  public void setCourses(
      final Set<Course> courses) {
    this.courses = courses;
  }
   
  public Set<Course> getCourses() {
    return this.courses;
  }
  
}
