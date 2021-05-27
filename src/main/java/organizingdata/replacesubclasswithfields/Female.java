package organizingdata.replacesubclasswithfields;
/**
 * 
 * @author mxcorrea
 *
 */
final class Female extends Person {

  @Override
  public char getCode() {
    return 'F';
  }

  @Override
  public boolean isMale() {
    return false;
  }
  
}
