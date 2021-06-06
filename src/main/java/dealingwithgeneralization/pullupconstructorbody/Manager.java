package dealingwithgeneralization.pullupconstructorbody;
/**
 * 
 * @author mxcorrea
 *
 */
public class Manager extends Employee {

  private int grade;
  
  public Manager(
      final String name ,
      final int id,
      final int grade) {
    this.name = name;
    this.id = id;
    this.grade = grade;
  }
  
  public int getGrade() {
    return grade;
  }
  
}
