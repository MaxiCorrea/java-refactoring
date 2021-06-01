package makingmethodcallssimpler.separatequeryfrommodifier;

/**
 * 
 * @author mxcorrea
 *
 */
public final class SecuritySystem {

  public void checkSecurity(
      final String[] people) {
    sendAlert(people);
    String found = foundPerson(people);
    someLaterCode(found);
  }

  public void sendAlert(
      final String[] people) {
    for (int i = 0; i < people.length; i++) {
      if (people[i].equals("Don") || 
          people[i].equals("John")) {
        sendAlert();
        return;
      }
    }
  }

  String foundPerson(
      final String[] people){
    for (int i = 0; i < people.length; i++) {
      if (people[i].equals("Don") || 
          people[i].equals("John")) {
        return people[i];
      }
    }
    return "";
  }
  
  private void sendAlert() {}

  private void someLaterCode(
      final String found) {}
}
