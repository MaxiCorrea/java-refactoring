package composingmethods.inlinemethod;

public final class Movie {

  private int numberOfLateDeliveries;
  
  public Movie(
      final int numberOfLateDeliveries) {
    this.numberOfLateDeliveries = numberOfLateDeliveries;
  }
  
  public int getRating() {
    return numberOfLateDeliveries < 5 ? 1 : 2;
  }
   
}
