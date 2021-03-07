package movingfeaturesbetweenobjects.hidedelegate;
/**
 * 
 * @author mxcorrea
 *
 */
public class Department {

  private String chargeCode;
  private Person manager;
  
  public Department(
      final String chargeCode,
      final Person manager) {
    this.chargeCode = chargeCode;
    this.manager = manager;
  }
  
  public String getChargeCode() {
    return chargeCode;
  }
  
  public Person getManager() {
    return manager;
  }
  
}
