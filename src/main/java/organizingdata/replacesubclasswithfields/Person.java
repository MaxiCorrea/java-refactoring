package organizingdata.replacesubclasswithfields;
/**
 * 
 * @author mxcorrea
 *
 */
public class Person {

  public static Person createMale() {
    return new Male();
  }
  
  public static Person createFemale() {
    return new Female();
  }
  
  private final boolean isMale;
  private final char code;
  
  Person(
      final boolean isMale,
      final char code) {
    this.isMale = isMale;
    this.code = code;
  }
  
  public char getCode() {
    return code;
  }
  
  public boolean isMale() {
    return isMale;
  }
  
}
