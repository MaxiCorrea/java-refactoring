package chapter001.starting05;

/**
 * 
 * @author mxcorrea
 *
 */
public class ChildrensPrice extends Price {

  @Override
  public int getPriceCode() {
    return Movie.CHILDRENS;
  }

  @Override
  public double getCharge(int daysRented) {
    double result = 1.5;
    if (daysRented > 3) {
      result += (daysRented - 3) * 1.5;
    }
    return result;
  }
  
}
