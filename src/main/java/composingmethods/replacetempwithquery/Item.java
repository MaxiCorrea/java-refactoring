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
    double basePrice = quantity * price;
    double discountFactor;
    if (basePrice > 1000)
      discountFactor = 0.95;
    else
      discountFactor = 0.98;
    return basePrice * discountFactor;
  }

}
