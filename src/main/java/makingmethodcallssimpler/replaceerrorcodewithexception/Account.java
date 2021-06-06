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
    if(balance.compareTo(amount) < 0) 
      return -1;
    balance = balance.subtract(amount);
    return 0;
  }
  
  public final void withdrawUncheckedException(
      final BigDecimal amount) {
    checkAmountForWithdrawUncheckedException(amount);
    balance = balance.subtract(amount);
  }
  
  public final void withdrawCheckedException(
      final BigDecimal amount) throws InvalidWithdrawException {
    checkAmountForWithdrawCheckedException(amount);
    balance = balance.subtract(amount);
  }
  
  private void checkAmountForWithdrawUncheckedException(
      final BigDecimal amount) {
    if(balance.compareTo(amount) < 0) 
      throw new IllegalArgumentException("balance < amount");
  }
  
  private void checkAmountForWithdrawCheckedException(
      final BigDecimal amount) throws InvalidWithdrawException {
    if(balance.compareTo(amount) < 0) 
      throw new InvalidWithdrawException("balance < amount");
  }
  
  public BigDecimal getBalance() {
    return balance;
  }
  
}
