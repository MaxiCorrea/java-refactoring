package chapter001.starting05;

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
  private Price price;
  
  public Movie(
      final String title, 
      final int priceCode) {
    this.title = title;
    this.setPrice(priceCode);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(
      final String title) {
    this.title = title;
  }

  private void setPrice(
      final int priceCode) {
    if (priceCode == Movie.NEW_RELEASE) {
      this.price = new NewReleasePrice();
    } else if (priceCode == Movie.CHILDRENS) {
      this.price = new ChildrensPrice();
    } else if (priceCode == Movie.REGULAR) {
      this.price = new RegularPrice();
    } else {
      throw new IllegalArgumentException("Invalid Price Code");
    }
  }

  public int getPriceCode() {
    return price.getPriceCode();
  }
  
  public double getCharge(int daysRented ) {
    return price.getCharge(daysRented);
  }
  
  public int getFrequentRenterPoints(int daysRented) {
    return price.getFrequentRenterPoints(daysRented);
  }
  
}
