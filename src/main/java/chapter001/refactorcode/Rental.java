package chapter001.refactorcode;

/**
 * 
 * @author mxcorrea
 *
 */
public class Rental {

  private Movie movie;
  private int daysRented;

  public Rental(
      final Movie movie, 
      final int daysRented) {
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(
      final Movie movie) {
    this.movie = movie;
  }

  public int getDaysRented() {
    return daysRented;
  }

  public void setDaysRented(
      final int daysRented) {
    this.daysRented = daysRented;
  }

  public double getCharge() {
    int priceCode = getMovie().getPriceCode();
    int daysRented = getDaysRented();
    double result = 0;
    if (priceCode == Movie.NEW_RELEASE) {
      result += daysRented * 3;
    } else if (priceCode == Movie.CHILDRENS) {
      result += 1.5;
      if (getDaysRented() > 3) {
        result += (daysRented - 3) * 1.5;
      }
    } else if (priceCode == Movie.REGULAR) {
      result += 2;
      if (getDaysRented() > 2) {
        result += (daysRented - 2) * 1.5;
      } 
    }
    return result;
  }

}
