package organizingdata.replacetypecodewithclass;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Person {

  private BloodGroup bloodGroup;
  
  public Person(
      final BloodGroup bloodGroup) {
    this.bloodGroup = bloodGroup;
  }

  public void setBloodGroup(
      final BloodGroup newBloodGroup) {
    this.bloodGroup = newBloodGroup;
  }

  public BloodGroup getBloodGroup() {
    return bloodGroup;
  }
  
}
