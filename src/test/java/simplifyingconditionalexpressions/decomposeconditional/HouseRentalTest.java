package simplifyingconditionalexpressions.decomposeconditional;

import static org.junit.Assert.*;
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class HouseRentalTest {

  @Before
  public void setup() {
    HouseRental.SUMMER_START = LocalDate.of(2021, 12, 21);
    HouseRental.SUMMER_END = LocalDate.of(2022, 3, 21);
  }
  
  @Test
  public void testSummerCharge4Days() {
    HouseRental houseRental = new HouseRental(LocalDate.of(2021,1,5), 10, 20, 30);
    double expectedCharge = 4 * 10 + 30;
    double actualCharge = houseRental.calculateCharge(4);
    assertEquals(expectedCharge, actualCharge, 0.0);
  }
  
  @Test
  public void testWinterCharge4Days() {
    HouseRental houseRental = new HouseRental(LocalDate.of(2022, 1, 21), 10, 20, 30);
    double expectedCharge = 4 * 20;
    double actualCharge = houseRental.calculateCharge(4);
    assertEquals(expectedCharge, actualCharge, 0.0);
  }

}
