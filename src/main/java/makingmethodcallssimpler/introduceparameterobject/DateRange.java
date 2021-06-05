package makingmethodcallssimpler.introduceparameterobject;

import java.time.LocalDate;

/**
 * 
 * @author mxcorrea
 *
 */
public final class DateRange {

  private final LocalDate start;
  private final LocalDate end;
  
  public DateRange(
      final LocalDate start,
      final LocalDate end) {
    this.start = start;
    this.end = end;
  }
 
  public boolean includes(
      final LocalDate date) {
    return date.equals(getStart()) || 
           date.equals(getEnd()) ||
          (date.isAfter(getStart()) && 
           date.isBefore(getEnd()));
  }
 
  public LocalDate getStart() {
    return start;
  }
  
  public LocalDate getEnd() {
    return end;
  }
  
}
