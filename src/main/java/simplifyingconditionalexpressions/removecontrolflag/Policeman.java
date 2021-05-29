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
    for (People people : peopleCollection) {
      if (allowedPeopleList.contains(people)) {
        return true;
      }
    }
    return false;
  }

}
