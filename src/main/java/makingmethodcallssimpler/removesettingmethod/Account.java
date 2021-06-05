package makingmethodcallssimpler.removesettingmethod;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Account {

  private String id;
  
  public Account(
      final String id) {
    setId(id);
  }
  
  public void setId(
      final String id) {
    this.id = id;
  }
  
  public String getId() {
    return id;
  }
  
}
