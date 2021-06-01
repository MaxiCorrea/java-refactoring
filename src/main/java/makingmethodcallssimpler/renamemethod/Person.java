package makingmethodcallssimpler.renamemethod;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Person {

  private final String name;
  private final String officeAreaCode;
  private final String officeNumber;

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
  
  public final String getOfficeTelephoneNumber() {
    return String.format("(%s) %s", officeAreaCode, officeNumber);
  }

}
