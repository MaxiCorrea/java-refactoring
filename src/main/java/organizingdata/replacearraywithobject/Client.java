package organizingdata.replacearraywithobject;

import static java.lang.Integer.parseInt;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Client {

  private final String[] data;
  
  public Client(
      final String[] data) {
    this.data = data;
  }
  
  public final String getName() {
    return data[0];
  }
  
  public final Integer getWins() {
    return parseInt(data[1]);
  }
  
}
