package composingmethods.inlinetemp;

public final class Invoice {

  private Order order;
  
  public Invoice(
      final Order order) {
    this.order = order;
  }
  
  public final boolean check() {
    double basePrice = order.getBasePrice();
    return (basePrice > 1000);
  }
  
}
