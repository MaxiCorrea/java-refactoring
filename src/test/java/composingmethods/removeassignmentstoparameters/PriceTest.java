package composingmethods.removeassignmentstoparameters;

import static org.junit.Assert.*;
import org.junit.Test;

public class PriceTest {

  @Test
  public void testInputVal40Quantity100YearToDate100() {
    Price price = new Price();
    int expected = 40;
    int actual = price.discount(40, 100, 100);
    assertEquals(expected, actual);
  }

  @Test
  public void testInputVal60Quantity100YearToDate100() {
    Price price = new Price();
    int expected = 58;
    int actual = price.discount(60, 100, 100);
    assertEquals(expected, actual);
  }

  @Test
  public void testInputVal60Quantity200YearToDate100() {
    Price price = new Price();
    int expected = 57;
    int actual = price.discount(60, 200, 100);
    assertEquals(expected, actual);
  }
  
  @Test
  public void testInputVal60Quantity200YearToDate20000() {
    Price price = new Price();
    int expected = 53;
    int actual = price.discount(60, 200, 20000);
    assertEquals(expected, actual);
  }
  
}
