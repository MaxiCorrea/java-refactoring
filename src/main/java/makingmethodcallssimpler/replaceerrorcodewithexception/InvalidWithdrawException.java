package makingmethodcallssimpler.replaceerrorcodewithexception;
/**
 * 
 * @author mxcorrea
 *
 */
public final class InvalidWithdrawException extends Exception {
  private static final long serialVersionUID = 1L;

  public InvalidWithdrawException(
      final String message) {
    super(message);
  }
  
}
