package makingmethodcallssimpler.replaceerrorcodewithexception;

import java.math.BigDecimal;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Account {

  private BigDecimal balance;
  
  public Account(
      final BigDecimal inicialBalance) {
    this.balance = inicialBalance;
  }
  
  public final int withdraw(
      final BigDecimal amount) {
    if(balance.compareTo(amount) < 0) {
      return -1;
    } 
    balance = balance.subtract(amount);
    return 0;
  }
  
  public BigDecimal getBalance() {
    return balance;
  }
  
}
