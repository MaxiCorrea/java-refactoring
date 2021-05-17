package organizingdata.replacearraywithobject;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Client {

  private final Performance performance;
  
  public Client(
      final Performance performance) {
    this.performance = performance;
  }
  
  public final String getName() {
    return performance.getName();
  }
  
  public final Integer getWins() {
    return performance.getWins();
  }
  
}
