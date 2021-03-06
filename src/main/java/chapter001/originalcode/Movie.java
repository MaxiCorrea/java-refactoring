package chapter001.originalcode;

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
  
}
