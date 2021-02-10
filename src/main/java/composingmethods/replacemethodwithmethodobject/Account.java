package composingmethods.replacemethodwithmethodobject;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Account {

  public int gamma(
      final int inputVal, 
      final int quantity, 
      final int yearToDate) {
    return new GammaMethod(this, inputVal, quantity, yearToDate).compute();
  }

  int delta() {
    return 0;
  }

}
