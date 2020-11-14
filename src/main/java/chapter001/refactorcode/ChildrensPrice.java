package chapter001.refactorcode;

public class ChildrensPrice extends Price {

  @Override
  public int getPriceCode() {
    return Movie.CHILDRENS;
  }

}
