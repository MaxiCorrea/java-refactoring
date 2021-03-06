package chapter001.refactorcode;

public abstract class Price {

  public abstract int getPriceCode();

  public abstract double getCharge(int daysRented);
  
  public int getFrequentRenterPoints(
      final int daysRented) {
    return 1;
  }
  
}
