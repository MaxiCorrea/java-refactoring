package composingmethods.substitutealgorithm;

/**
 * 
 * @author mxcorrea
 *
 */
public final class PeopleFinder {
  
  private final String target1;
  private final String target3;
  private final String target2;
  
  public PeopleFinder(
      final String target1 ,
      final String target2 ,
      final String target3) {
    this.target1 = target1;
    this.target2 = target2;
    this.target3 = target3;
  }
  
  public final String foundPerson(
      final People... peoples) {
    for(People current : peoples) {
      if(target1.equals(current.getName()))
        return target1;
      if(target2.equals(current.getName()))
        return target2;
      if(target3.equals(current.getName()))
        return target3;
    }
    return "";
  }
  
}
