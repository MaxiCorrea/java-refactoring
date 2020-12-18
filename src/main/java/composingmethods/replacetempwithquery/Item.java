package composingmethods.replacetempwithquery;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Item {

  private final int quantity;
  private final double price;

  public Item(
      final int quantity, 
      final double price) {
    this.quantity = quantity;
    this.price = price;
  }

  public double getPrice() {
    return basePrice() * discountFactor();
  }

  private double basePrice() {
    return quantity * price;
  }
  
  private double discountFactor() {
    return (basePrice() > 1000) ? 0.95 : 0.98;
  }
  
}
