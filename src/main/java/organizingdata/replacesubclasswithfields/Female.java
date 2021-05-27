package organizingdata.replacesubclasswithfields;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Female extends Person {

  @Override
  public char getCode() {
    return 'F';
  }

  @Override
  public boolean isMale() {
    return false;
  }
  
}
