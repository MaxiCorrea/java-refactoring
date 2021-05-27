package organizingdata.replacesubclasswithfields;
/**
 * 
 * @author mxcorrea
 *
 */
final class Female extends Person {

  Female() {
    super(false, 'F');
  }

  @Override
  public char getCode() {
    return 'F';
  }

  @Override
  public boolean isMale() {
    return false;
  }
  
}
