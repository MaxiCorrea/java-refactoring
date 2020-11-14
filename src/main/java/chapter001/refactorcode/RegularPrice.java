package chapter001.refactorcode;

public class RegularPrice extends Price {

  @Override
  public int getPriceCode() {
    return Movie.REGULAR;
  }

}
