package chapter001.starting05;

/**
 * 
 * @author mxcorrea
 *
 */
public class NewReleasePrice extends Price {

  @Override
  public int getPriceCode() {
    return Movie.CHILDRENS;
  }

  @Override
  public double getCharge(int daysRented) {
    return daysRented * 3;
  }
  
  @Override
  public int getFrequentRenterPoints(int daysRented) {
    return (daysRented > 1) ? 2: 1;
  }
  
}
