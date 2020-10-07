package chapter001.refactorcode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

  private static final String DEFAULT_NAME = "Maximiliano";
  private Customer customer;
  
  @Before
  public void setup() {
    customer = new Customer(DEFAULT_NAME);
  }
  
  @Test
  public void statementRestWithoutMovieRentals() {
    String expected = "Rental Record for "+DEFAULT_NAME+"\nAmount owed is 0.0\nYou earned 0 frequent renter points";
    String actual = customer.statement();
    assertEquals(expected , actual);
  }

}
