package chapter001.starting03;

import chapter001.starting01.Movie;

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
    double result = 0.0;
    if (getMovie().getPriceCode() == Movie.NEW_RELEASE) {
      result += getDaysRented() * 3;
    } else if (getMovie().getPriceCode() == Movie.CHILDRENS) {
      result += 1.5;
      if (getDaysRented() > 3) {
        result += (getDaysRented() - 3) * 1.5;
      }
    } else if (getMovie().getPriceCode() == Movie.REGULAR) {
      result += 2;
      if (getDaysRented() > 2) {
        result += (getDaysRented() - 2) * 1.5;
      }
    }
    return result;
  }
  
  public int getFrequentRenterPoints() {
    if (getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1) {
      return 2;
    }
    return 1;
  }
  
}