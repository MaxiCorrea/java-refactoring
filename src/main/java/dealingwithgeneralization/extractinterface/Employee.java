package dealingwithgeneralization.extractinterface;

/**
 * 
 * @author mxcorrea
 *
 */
public class Employee {

  private int rate;
  private String name;
  private boolean hasSpecialSkill;
  
  public Employee(
      final int rate,
      final String name,
      final boolean hasSpecialSkill) {
    this.rate = rate;
    this.name = name;
    this.hasSpecialSkill = hasSpecialSkill;
  }
  
  public int getRate() {
    return rate;
  }
  
  public String getName() {
    return name;
  }

  public boolean hasSpecialSkill() {
    return hasSpecialSkill;
  }
  
}
