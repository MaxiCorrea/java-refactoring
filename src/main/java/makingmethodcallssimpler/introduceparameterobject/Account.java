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
  
  @Deprecated
  public final BigDecimal getFlowBetween (
      final LocalDate start, 
      final LocalDate end) {
    return getFlowBetween(new DateRange(start, end));
  }
  
  public final BigDecimal getFlowBetween (
      final DateRange range) {
    BigDecimal result = BigDecimal.ZERO;
    for(Entry each : entries) {
      if (each.getChargeDate().equals(range.getStart()) ||
          each.getChargeDate().equals(range.getEnd()) ||
         (each.getChargeDate().isAfter(range.getStart()) &&
          each.getChargeDate().isBefore(range.getEnd()))) {
        result = result.add(each.getValue());
      }
    }
    return result;
  }
  
}
