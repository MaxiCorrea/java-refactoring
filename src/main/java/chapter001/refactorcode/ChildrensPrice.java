package chapter001.refactorcode;

public class ChildrensPrice extends Price {

  @Override
  public int getPriceCode() {
    return Movie.CHILDRENS;
  }

  @Override
  public double getCharge(
      final int daysRented) {
    double result = 1.5;
    if (daysRented > 3) {
      result += (daysRented - 3) * 1.5;
    }
    return result;
  }


}
