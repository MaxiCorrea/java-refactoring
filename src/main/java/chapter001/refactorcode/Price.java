package chapter001.refactorcode;

public abstract class Price {

  public abstract int getPriceCode();

  public double getCharge(
      final int daysRented) {
    double result = 0;
    if (getPriceCode() == Movie.NEW_RELEASE) {
      result += daysRented * 3;
    } else if (getPriceCode() == Movie.CHILDRENS) {
      result += 1.5;
      if (daysRented > 3) {
        result += (daysRented - 3) * 1.5;
      }
    } else if (getPriceCode() == Movie.REGULAR) {
      result += 2;
      if (daysRented > 2) {
        result += (daysRented - 2) * 1.5;
      } 
    }
    return result;
  }
  
}
