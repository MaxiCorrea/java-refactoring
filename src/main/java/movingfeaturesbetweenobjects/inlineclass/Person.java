package movingfeaturesbetweenobjects.inlineclass;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Person {
  private static final String TEMPLATE = "(%s) %s";
  
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
    return String.format(TEMPLATE, officeAreaCode , officeNumber);
  }

  public String getOfficeAreaCode() {
    return officeAreaCode;
  }


  public String getOfficeNumber() {
    return officeNumber;
  }

}
