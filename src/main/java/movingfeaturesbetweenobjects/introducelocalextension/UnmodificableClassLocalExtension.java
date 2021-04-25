package movingfeaturesbetweenobjects.introducelocalextension;
/**
 * 
 * @author mxcorrea
 *
 */
public final class UnmodificableClassLocalExtension {

  private final UnmodificableClass unmodificableClass;
  
  public UnmodificableClassLocalExtension(
      final UnmodificableClass unmodificableClass) {
    this.unmodificableClass = unmodificableClass;
  }
  
  @Override
  public String toString() {
    return String.format("%s-%s", 
        unmodificableClass.getAttribute1() , 
        unmodificableClass.getAttribute2());
  }
  
  public String reverseToString() {
    return String.format("%s-%s", 
        unmodificableClass.getAttribute2() , 
        unmodificableClass.getAttribute1());
  }
 
  public final String getAttribute1() {
    return unmodificableClass.getAttribute1();
  }
  
  public final String getAttribute2() {
    return unmodificableClass.getAttribute2();
  }
  
}
