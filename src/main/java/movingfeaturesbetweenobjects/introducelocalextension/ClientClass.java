package movingfeaturesbetweenobjects.introducelocalextension;
/**
 * 
 * @author mxcorrea
 *
 */
public final class ClientClass {

  private final UnmodificableClassLocalExtension attribute;
  
  public ClientClass(
      final UnmodificableClass attribute) {
    this.attribute = new UnmodificableClassLocalExtension(attribute);
  }
  
  public String mothod1() {
    return attribute.toString();
  }
  
  public String mothod2() {
    return attribute.reverseToString();
  }
  
}
