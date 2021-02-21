package movingfeaturesbetweenobjects.extractclass;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Person {

  private String name;
  private String officeAreaCode;
  private String officeNumber;

  public Person(
      final String name, 
      final String officeAreaCode, 
      final String officeNumber) {
    this.name = name;
    this.officeAreaCode = officeAreaCode;
    this.officeNumber = officeNumber;
  }

  public String getName() {
    return name;
  }

  public String getTelephoneNumber() {
    return ("(" + officeAreaCode + ") " + officeNumber);
  }

  public String getOfficeAreaCode() {
    return officeAreaCode;
  }

  public void setOfficeAreaCode(
      final String arg) {
    officeAreaCode = arg;
  }

  public String getOfficeNumber() {
    return officeNumber;
  }

  public void setOfficeNumber(
      final String arg) {
    officeNumber = arg;
  }

}
