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
  
  public LocalDate getStart() {
    return start;
  }
  
  public LocalDate getEnd() {
    return end;
  }
  
}
