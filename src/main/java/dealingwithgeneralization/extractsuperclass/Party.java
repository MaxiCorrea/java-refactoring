package dealingwithgeneralization.extractsuperclass;
/**
 * 
 * @author mxcorrea
 *
 */
public abstract class Party {

  private final String name;
  
  public Party(
      final String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
}
