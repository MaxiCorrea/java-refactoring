package composingmethods.inlinemethod;

public final class Movie {

  private int numberOfLateDeliveries;
  
  public Movie(
      final int numberOfLateDeliveries) {
    this.numberOfLateDeliveries = numberOfLateDeliveries;
  }
  
  public int getRating() {
    return moreThanFiveLateDeliveries() ? 1 : 2;
  }
  
  private boolean moreThanFiveLateDeliveries() {
    return numberOfLateDeliveries < 5;
  } 
  
}
