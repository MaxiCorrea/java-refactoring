package makingmethodcallssimpler.encapsulatedowncast;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Container {

  private Item item;
  
  public Container(
      final String itemValue) {
    item = new Item(itemValue);
  }
  
  public Object getItemValue() {
    return item.getObj();
  }
  
}
