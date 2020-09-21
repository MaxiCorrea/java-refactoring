package chapter001.starting05;

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
    return movie.getCharge(getDaysRented());
  }
  
  public int getFrequentRenterPoints() {
    return movie.getFrequentRenterPoints(getDaysRented());
  }
  
}