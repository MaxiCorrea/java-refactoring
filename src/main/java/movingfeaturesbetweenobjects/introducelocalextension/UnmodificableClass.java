package movingfeaturesbetweenobjects.introducelocalextension;
/**
 * 
 * @author mxcorrea
 *
 */
public final class UnmodificableClass {

  private final String attribute1;
  private final String attribute2;
  
  public UnmodificableClass(
      final String arg1 ,
      final String arg2) {
    this.attribute1 = arg1;
    this.attribute2 = arg2;
  }
  
  public final String getAttribute1() {
    return attribute1;
  }
  
  public final String getAttribute2() {
    return attribute2;
  }
  
}
