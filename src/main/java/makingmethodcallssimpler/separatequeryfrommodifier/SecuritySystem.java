package makingmethodcallssimpler.separatequeryfrommodifier;

/**
 * 
 * @author mxcorrea
 *
 */
public final class SecuritySystem {

  public void checkSecurity(
      final String[] people) {
    String found = foundMiscreant(people);
    someLaterCode(found);
  }

  public String foundMiscreant(
      final String[] people) {
    for (int i = 0; i < people.length; i++) {
      if (people[i].equals("Don")) {
        sendAlert();
        return "Don";
      }
      if (people[i].equals("John")) {
        sendAlert();
        return "John";
      }
    }
    return "";
  }

  private void sendAlert() {

  }

  private void someLaterCode(
      final String found) {

  }
}
