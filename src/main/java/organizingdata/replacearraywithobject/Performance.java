package organizingdata.replacearraywithobject;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Performance {

  private final String name;
  private final Integer wins;
  
  public Performance(
      final String name,
      final Integer wins) {
    this.name = name;
    this.wins = wins;
  }
  
  public final String getName() {
    return name;
  }
  
  public final Integer getWins() {
    return wins;
  }
  
}
