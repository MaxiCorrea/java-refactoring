package dealingwithgeneralization.pullupfield;
/***
 * 
 * @author mxcorrea
 *
 */
public final class Salesman extends Employee {

  private final String name;
  
  public Salesman(
      final String name) {
    this.name = name;
  }
  
  @Override
  public String getName() {
    return name;
  }
  
}
