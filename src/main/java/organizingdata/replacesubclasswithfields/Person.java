package organizingdata.replacesubclasswithfields;
/**
 * 
 * @author mxcorrea
 *
 */
public abstract class Person {

  public static Person createMale() {
    return new Male();
  }
  
  public static Person createFemale() {
    return new Female();
  }
  
  public abstract char getCode();
  
  public abstract boolean isMale();
  
}
