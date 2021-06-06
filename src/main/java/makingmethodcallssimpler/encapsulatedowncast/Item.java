package makingmethodcallssimpler.encapsulatedowncast;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Item {

  private final Object obj;
  
  public Item(
      final Object obj) {
    this.obj = obj;
  }
  
  public Object getObj() {
    return obj;
  }
  
}
