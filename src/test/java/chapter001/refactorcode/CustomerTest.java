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
  public void statementWithoutMovieRentals() {
    String expected = "Rental Record for "+DEFAULT_NAME+
        "\nAmount owed is 0.0\nYou earned 0 frequent renter points";
    String actual = customer.statement();
    assertEquals(expected , actual);
  }

  @Test
  public void statementNewReleaseOneDayRenterMovieRentals() {
    String expected = "Rental Record for "+DEFAULT_NAME+"\n"+
        "\tNew Release\t3.0"+
        "\nAmount owed is 3.0"+
        "\nYou earned 1 frequent renter points";
    customer.addRental(new Rental(new Movie("New Release", Movie.NEW_RELEASE) , 1));
    String actual = customer.statement();
    assertEquals(expected , actual);
  }
  
  @Test
  public void statementNewReleaseTwoDaysRenterMovieRentals() {
    String expected = "Rental Record for "+DEFAULT_NAME+"\n"+
        "\tNew Release\t6.0"+
        "\nAmount owed is 6.0"+
        "\nYou earned 2 frequent renter points";
    customer.addRental(new Rental(new Movie("New Release", Movie.NEW_RELEASE) , 2));
    String actual = customer.statement();
    assertEquals(expected , actual);
  }
  
  @Test
  public void statementChildrensOneDayRenterMovieRentals() {
    String expected = "Rental Record for "+DEFAULT_NAME+"\n"+
        "\tChildrens\t1.5"+
        "\nAmount owed is 1.5"+
        "\nYou earned 1 frequent renter points";
    customer.addRental(new Rental(new Movie("Childrens", Movie.CHILDRENS) , 1));
    String actual = customer.statement();
    assertEquals(expected , actual);
  }
  
  @Test
  public void statementRegularOneDayRenterMovieRentals() {
    String expected = "Rental Record for "+DEFAULT_NAME+"\n"+
        "\tRegular\t2.0"+
        "\nAmount owed is 2.0"+
        "\nYou earned 1 frequent renter points";
    customer.addRental(new Rental(new Movie("Regular", Movie.REGULAR) , 1));
    String actual = customer.statement();
    assertEquals(expected , actual);
  }
  
  
}
