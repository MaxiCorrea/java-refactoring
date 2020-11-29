package composingmethods.inlinetemp;

public final class Invoice {

  private Order order;
  
  public Invoice(
      final Order order) {
    this.order = order;
  }
  
  public final boolean check() {
    return (order.getBasePrice() > 1000);
  }
  
}
