package organizingdata.replacetypecodewithclass;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Person {

  public static final int O = BloodGroup.O.getCode();
  public static final int A = BloodGroup.A.getCode();
  public static final int B = BloodGroup.B.getCode();
  public static final int AB = BloodGroup.AB.getCode();

  private int bloodGroup;

  public Person(
      final int bloodGroup) {
    this.bloodGroup = bloodGroup;
  }

  public void setBloodGroup(
      final int newBloodGroup) {
    this.bloodGroup = newBloodGroup;
  }

  public int getBloodGroup() {
    return this.bloodGroup;
  }

}
