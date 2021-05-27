package simplifyingconditionalexpressions.consolidateduplicateconditionalfragments;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Product {

  public static interface Sender {
    void send();
  }

  private final double price;
  private final Sender sender;
  private final boolean isSpecialDeal;

  public Product(
      final double price, 
      final Sender sender,
      final boolean isSpecialDeal) {
    this.price = price;
    this.sender = sender;
    this.isSpecialDeal = isSpecialDeal;
  }

  public double calculateTotalAndSend() {
    double total;
    if (isSpecialDeal()) {
      total = price * 0.95;
      sender.send();
    } else {
      total = price * 0.98;
      sender.send();
    }
    return total;
  }

  private boolean isSpecialDeal() {
    return isSpecialDeal;
  }

}
