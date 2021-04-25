package movingfeaturesbetweenobjects.introduceforeignmethod;
/**
 * 
 * @author mxcorrea
 *
 */
public final class ClientClass {

  private final UnmodificableClass attribute;
  
  public ClientClass(
      final UnmodificableClass attribute) {
    this.attribute = attribute;
  }
  
  public String mothod() {
    return applyForeignToString(attribute);
  }
  
  private String applyForeignToString(
      final UnmodificableClass unmodificableClass) {
    return String.format("%s-%s", 
        unmodificableClass.getAttribute1() , 
        unmodificableClass.getAttribute2());
  }
  
}
