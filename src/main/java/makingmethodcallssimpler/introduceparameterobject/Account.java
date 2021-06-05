package makingmethodcallssimpler.introduceparameterobject;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Account {

  private final Collection<Entry> entries;
  
  public Account(
      final Collection<Entry> entries) {
    this.entries = new ArrayList<>();
    this.entries.addAll(entries);
  }
  
  public final BigDecimal getFlowBetween (
      final LocalDate start, 
      final LocalDate end) {
    BigDecimal result = BigDecimal.ZERO;
    for(Entry each : entries) {
      if (each.getChargeDate().equals(start) ||
          each.getChargeDate().equals(end) ||
         (each.getChargeDate().isAfter(start) &&
          each.getChargeDate().isBefore(end))) {
        result = result.add(each.getValue());
      }
    }
    return result;
  }
  
}
