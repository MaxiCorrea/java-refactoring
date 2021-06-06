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
    super(name , id);
    this.grade = grade;
  }
  
  public int getGrade() {
    return grade;
  }
  
}
