package makingmethodcallssimpler.introduceparameterobject;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 
 * @author mxcorrea
 *
 */

public final class Entry {

  private final BigDecimal value;
  private final LocalDate chargeDate;

  public Entry(
      final BigDecimal value ,
      final LocalDate chargeDate) {
    this.value = value;
    this.chargeDate = chargeDate;
  }

  public BigDecimal getValue() {
    return value;
  }
  
  public LocalDate getChargeDate() {
    return chargeDate;
  }
  
}
