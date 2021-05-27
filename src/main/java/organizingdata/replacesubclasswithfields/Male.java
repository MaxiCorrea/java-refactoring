package organizingdata.replacesubclasswithfields;
/**
 * 
 * @author mxcorrea
 *
 */
final class Male extends Person {

  Male() {
    super(true, 'M');
  }

  @Override
  public char getCode() {
    return 'M';
  }

  @Override
  public boolean isMale() {
    return true;
  }

}
