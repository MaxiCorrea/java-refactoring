package simplifyingconditionalexpressions.removecontrolflag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Policeman {

  private final List<People> allowedPeopleList;

  public Policeman(
      final Collection<People> allowedPeopleList) {
    this.allowedPeopleList = new ArrayList<>();
    this.allowedPeopleList.addAll(allowedPeopleList);
  }

  public final boolean checkSecurity(
      final Collection<People> peopleCollection) {
    boolean found = false;
    for (People people : peopleCollection) {
      if (!found) {
        found = allowedPeopleList.contains(people);
      }
    }
    return found;
  }

}
