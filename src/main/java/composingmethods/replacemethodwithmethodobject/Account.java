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
    int importantValue1 = (inputVal * quantity) + delta();
    int importantValue2 = (inputVal * yearToDate) + 100;
    if ((yearToDate - importantValue1) > 100)
      importantValue2 -= 20;
    int importantValue3 = importantValue2 * 7;
    return importantValue3 - 2 * importantValue1;
  }

  private int delta() {
    return 0;
  }

}
