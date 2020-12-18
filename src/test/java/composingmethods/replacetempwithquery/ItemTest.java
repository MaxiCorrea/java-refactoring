package composingmethods.replacetempwithquery;

import static org.junit.Assert.*;
import org.junit.Test;

public class ItemTest {

  @Test
  public void testPrice4ItemForPrice50() {
    Item item = new Item(4, 50);
    double expected = 196.0;
    double actual = item.getPrice();
    assertEquals(expected, actual, 0);
  }

  @Test
  public void testPrice4ItemForPrice5000() {
    Item item = new Item(4, 5000);
    double expected = 19000.0;
    double actual = item.getPrice();
    assertEquals(expected, actual, 0);
  }

}
