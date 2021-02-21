package movingfeaturesbetweenobjects.extractclass;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Person {

  private String name;
  private TelephoneNumber telephone;

  public Person(
      final String name, 
      final String officeAreaCode, 
      final String officeNumber) {
    this.name = name;
    this.telephone = new TelephoneNumber(officeAreaCode, officeNumber);
  }

  public String getName() {
    return name;
  }

  public String getTelephoneNumber() {
    return telephone.format();
  }

  public String getOfficeAreaCode() {
    return telephone.getOfficeAreaCode();
  }


  public String getOfficeNumber() {
    return telephone.getOfficeNumber();
  }

}
