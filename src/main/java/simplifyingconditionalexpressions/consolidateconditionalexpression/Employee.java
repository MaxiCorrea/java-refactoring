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
    return isNotEligibleForDisability() ? 0.0 : -1.0;
  }

  private boolean isNotEligibleForDisability() {
    return seniority < 2 || monthsDisabled > 12 || isPartTime;
  }  
  
}
