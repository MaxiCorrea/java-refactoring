package composingmethods.substitutealgorithm;

import static java.util.Arrays.asList;
import java.util.List;

/**
 * 
 * @author mxcorrea
 *
 */
public final class PeopleFinder {
  
  private List<String> targetNames;
  
  public PeopleFinder(
      final String target1 ,
      final String target2 ,
      final String target3) {
   targetNames = asList(target1, target2, target3);
  }
  
  public final String foundPerson(
      final People... peoples) {
    for(People current : peoples) {
      if(targetNames.contains(current.getName())) {
        return current.getName();
      }
    }
    return "";
  }
  
}
