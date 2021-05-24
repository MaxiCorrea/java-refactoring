package organizingdata.replacetypecodewithclass;
/**
 * 
 * @author mxcorrea
 *
 */
public final class BloodGroup {

  public static final BloodGroup O =  new BloodGroup(0);
  public static final BloodGroup A = new BloodGroup(1);
  public static final BloodGroup B = new BloodGroup(2);
  public static final BloodGroup AB = new BloodGroup(3);

  private static final BloodGroup[] values = {O, A, B, AB};
  
  public static final BloodGroup code(
      final int code) {
    return values[code];
  }
  
  private final int code;
  
  public BloodGroup(
      final int code) {
    this.code = code;
  }
  
  public final int getCode() {
    return code;
  }
}
