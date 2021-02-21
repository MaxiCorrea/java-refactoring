package movingfeaturesbetweenobjects.extractclass;
/**
 * 
 * @author mxcorrea
 *
 */
public final class TelephoneNumber {

  private static final String TEMPLATE = "(%s) %s";
  
  private String officeAreaCode;
  private String officeNumber;
  
  public TelephoneNumber(
      final String officeAreaCode,
      final String officeNumber) {
    this.officeAreaCode = officeAreaCode;
    this.officeNumber = officeNumber;
  }
  
  public String format() {
    return String.format(TEMPLATE, officeAreaCode , officeNumber);
  }
  
  public String getOfficeAreaCode() {
    return officeAreaCode;
  }
  
  public String getOfficeNumber() {
    return officeNumber;
  }
  
}
