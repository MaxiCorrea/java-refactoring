package organizingdata.duplicateobserveddata;
/**
 * 
 * @author mxcorrea
 *
 */
public final class IntervalDomain {

  public static interface IntervalObserver {
    void updateFromDomain(IntervalDomain domain);
  }
  
  private Integer start;
  private Integer end;
  private Integer length;
  private IntervalObserver observer;
  
  public IntervalDomain(
      final IntervalObserver observer) {
    start = 0;
    end = 0;
    length = 0;
    this.observer = observer;
    notifyObserver();
  }
  
  public Integer getStart() {
    return start;
  }
  
  public Integer getEnd() {
    return end;
  }
  
  public Integer getLength() {
    return length;
  }
  
  public void changeStart(
      final String newValue) {
    this.start = validate(newValue);
    calculateLength();
    notifyObserver();
  }
  
  public void changeEnd(
      final String newValue) {
    this.end = validate(newValue);
    calculateLength();
    notifyObserver();
  }
  
  public void changeLength(
      final String newValue) {
    this.length = validate(newValue);
    calculateEnd();
    notifyObserver();
  }
  
  private void calculateLength() {
    length = end - start;
  }

  private void calculateEnd() {
    end = start + length;
  }

  private void notifyObserver() {
    if(observer != null) {
      observer.updateFromDomain(this);
    }
  }
  
  private Integer validate(
      final String newValue) {
    try {
      return Integer.parseInt(newValue);
    } catch(Exception ex) {
      return 0;
    }
  }
  
}
