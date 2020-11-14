package composingmethods.extractmethod;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

public class InvoicePrinterTest {

  private static final String CUSTOMER_NAME = "Maximiliano";
  private static final List<Item> NO_ITEMS = Collections.emptyList();
  private static final List<Item> ONE_ITEMS = Arrays.asList(new Item(12));
  private static final List<Item> TWO_ITEMS = Arrays.asList(new Item(34.5), new Item(14.2));
  
  private InvoicePrinter printer;
    
  @Test
  public void testPrintWithZeroItems() {
    printer = new InvoicePrinter(CUSTOMER_NAME, NO_ITEMS);
    String expected = "";
    expected += "**************************\n";
    expected += "*****    Invoice    ******\n";
    expected += "**************************\n";
    expected += "name : " + CUSTOMER_NAME + "\n";
    expected += "amount : " + 0.0 + "\n";
    String actual = printer.print();
    assertEquals(expected , actual);
  }

  @Test
  public void testPrintWithOneItems() {
    printer = new InvoicePrinter(CUSTOMER_NAME, ONE_ITEMS);
    String expected = "";
    expected += "**************************\n";
    expected += "*****    Invoice    ******\n";
    expected += "**************************\n";
    expected += "name : " + CUSTOMER_NAME + "\n";
    expected += "amount : " + 12.0 + "\n";
    String actual = printer.print();
    assertEquals(expected , actual);
  }
  
  @Test
  public void testPrintWithTwoItems() {
    printer = new InvoicePrinter(CUSTOMER_NAME, TWO_ITEMS);
    String expected = "";
    expected += "**************************\n";
    expected += "*****    Invoice    ******\n";
    expected += "**************************\n";
    expected += "name : " + CUSTOMER_NAME + "\n";
    expected += "amount : " + 48.7 + "\n";
    String actual = printer.print();
    assertEquals(expected , actual);
  }
  
}
