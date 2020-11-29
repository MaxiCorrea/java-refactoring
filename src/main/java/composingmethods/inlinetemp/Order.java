package composingmethods.inlinetemp;

public final class Order {

  private double basePrice;
  
  public Order(
      final double basePrice) {
    this.basePrice = basePrice;
  }
  
  public final double getBasePrice() {
    return basePrice;
  }
  
}
