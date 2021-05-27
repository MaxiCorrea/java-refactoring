package simplifyingconditionalexpressions.consolidateconditionalexpression;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Employee {

  private final int seniority;
  private final int monthsDisabled;
  private final boolean isPartTime;
  
  public Employee(
      final int seniority ,
      final int monthDisabled,
      final boolean isPartTime) {
    this.seniority = seniority;
    this.monthsDisabled = monthDisabled;
    this.isPartTime = isPartTime;
  }
  
  public double disabilityAmount() {
    if (seniority < 2) return 0.0;
    if (monthsDisabled > 12) return 0.0;
    if (isPartTime) return 0.0;
    return -1;
  }  
  
}
