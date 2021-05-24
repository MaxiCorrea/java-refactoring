package organizingdata.replacetypecodewithclass;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Person {

  public static final int O = 0;
  public static final int A = 1;
  public static final int B = 2;
  public static final int AB = 3;

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
