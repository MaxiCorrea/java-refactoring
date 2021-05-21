package organizingdata.replacemagicnumberwithsymbolicconstant;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class CalculatorTest {

  @Test
  public void testingPotentialEnergy() {
    Calculator calculator = new Calculator();
    double expected = 13390.65;
    double actual = calculator.potentialEnergy(30, 45.5);
    assertEquals(expected, actual , 0);
  }

}
