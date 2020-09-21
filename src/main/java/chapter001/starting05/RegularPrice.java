package chapter001.starting05;

/**
 * 
 * @author mxcorrea
 *
 */
public class RegularPrice extends Price {

  @Override
  public int getPriceCode() {
    return Movie.REGULAR;
  }

  @Override
  public double getCharge(int daysRented) {
    double result = 2;
    if (daysRented > 2)
      result += (daysRented - 2) * 1.5;
    return result;
  }

}
