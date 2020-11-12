package chapter001.refactorcode;

/**
 * 
 * @author mxcorrea
 *
 */
public class Movie {

  public static final int REGULAR = 0;
  public static final int NEW_RELEASE = 1;
  public static final int CHILDRENS = 2;

  private String title;
  private int priceCode;

  public Movie(
      final String title, 
      final int priceCode) {
    this.title = title;
    this.priceCode = priceCode;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(
      final String title) {
    this.title = title;
  }

  public int getPriceCode() {
    return priceCode;
  }

  public void setPriceCode(
      final int priceCode) {
    this.priceCode = priceCode;
  }

  public double getCharge(
      final int daysRented) {
    double result = 0;
    if (getPriceCode() == Movie.NEW_RELEASE) {
      result += daysRented * 3;
    } else if (priceCode == Movie.CHILDRENS) {
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

  public int getFrequentRenterPoints(
      final int daysRented) {
    return getPriceCode() == Movie.NEW_RELEASE && daysRented > 1 ? 2 : 1;
  }
  
}
