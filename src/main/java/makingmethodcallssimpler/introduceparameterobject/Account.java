package makingmethodcallssimpler.introduceparameterobject;

import java.math.BigDecimal;
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
      final DateRange range) {
    BigDecimal result = BigDecimal.ZERO;
    for(Entry each : entries) {
      if (includes(range, each)) {
        result = result.add(each.getValue());
      }
    }
    return result;
  }

  private boolean includes(
      final DateRange range, 
      final Entry each) {
    return each.getChargeDate().equals(range.getStart()) ||
        each.getChargeDate().equals(range.getEnd()) ||
       (each.getChargeDate().isAfter(range.getStart()) &&
        each.getChargeDate().isBefore(range.getEnd()));
  }
  
}
