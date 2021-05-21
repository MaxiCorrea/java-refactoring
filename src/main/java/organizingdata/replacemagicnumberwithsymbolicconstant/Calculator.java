package organizingdata.replacemagicnumberwithsymbolicconstant;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Calculator {

  private static final double GRAVITATIONAL_CONSTANT = 9.81;
  
  public final double potentialEnergy(
      final double mass, 
      final double height) {
    return mass * GRAVITATIONAL_CONSTANT * height;
  }

}
