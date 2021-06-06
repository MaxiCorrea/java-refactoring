package dealingwithgeneralization.pullupfield;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Engineer extends Employee {
  
  private final String name;
  
  public Engineer(
      final String name) {
    this.name = name;
  }
  
  @Override
  public String getName() {
    return name;
  }
  
}
