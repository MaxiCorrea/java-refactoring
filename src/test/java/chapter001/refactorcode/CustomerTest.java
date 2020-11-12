package chapter001.refactorcode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
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
  public void htmlStatementWithoutMovieRentals() {
    String expected = "<H1>Rentals for <EM>"+DEFAULT_NAME+"</EM></H1><P>\n" +
        "<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>";
    String actual = customer.htmlStatement();
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
  public void statementNewReleaseThreeDayRenterMovieRentals() {
    String expected = "Rental Record for "+DEFAULT_NAME+"\n"+
        "\tNew Release\t9.0"+
        "\nAmount owed is 9.0"+
        "\nYou earned 2 frequent renter points";
    customer.addRental(new Rental(new Movie("New Release", Movie.NEW_RELEASE) , 3));
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
  public void statementChildrensTwoDayRenterMovieRentals() {
    String expected = "Rental Record for "+DEFAULT_NAME+"\n"+
        "\tChildrens\t1.5"+
        "\nAmount owed is 1.5"+
        "\nYou earned 1 frequent renter points";
    customer.addRental(new Rental(new Movie("Childrens", Movie.CHILDRENS) , 2));
    String actual = customer.statement();
    assertEquals(expected , actual);
  }
  
  @Test
  public void statementChildrensFourDayRenterMovieRentals() {
    String expected = "Rental Record for "+DEFAULT_NAME+"\n"+
        "\tChildrens\t3.0"+
        "\nAmount owed is 3.0"+
        "\nYou earned 1 frequent renter points";
    customer.addRental(new Rental(new Movie("Childrens", Movie.CHILDRENS) , 4));
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
  
  @Test
  public void statementRegularTwoDayRenterMovieRentals() {
    String expected = "Rental Record for "+DEFAULT_NAME+"\n"+
        "\tRegular\t2.0"+
        "\nAmount owed is 2.0"+
        "\nYou earned 1 frequent renter points";
    customer.addRental(new Rental(new Movie("Regular", Movie.REGULAR) , 2));
    String actual = customer.statement();
    assertEquals(expected , actual);
  }
  
  @Test
  public void statementRegularThreeDayRenterMovieRentals() {
    String expected = "Rental Record for "+DEFAULT_NAME+"\n"+
        "\tRegular\t3.5"+
        "\nAmount owed is 3.5"+
        "\nYou earned 1 frequent renter points";
    customer.addRental(new Rental(new Movie("Regular", Movie.REGULAR) , 3));
    String actual = customer.statement();
    assertEquals(expected , actual);
  }
  
  @Test
  public void statementRegularTwoDayAndChildrensFourDayRenterMovieRentals() {
    String expected = "Rental Record for "+DEFAULT_NAME+"\n"+
        "\tRegular\t2.0\n"+
        "\tChildrens\t3.0"+
        "\nAmount owed is 5.0"+
        "\nYou earned 2 frequent renter points";
    customer.addRental(new Rental(new Movie("Regular", Movie.REGULAR), 2));
    customer.addRental(new Rental(new Movie("Childrens", Movie.CHILDRENS), 4));
    String actual = customer.statement();
    assertEquals(expected , actual);
  }
  
  @Test
  public void statementNewReleaseThreeDayAndChildrensFourDayRenterMovieRentals() {
    String expected = "Rental Record for "+DEFAULT_NAME+"\n"+
        "\tNew Release\t9.0\n"+
        "\tChildrens\t3.0"+
        "\nAmount owed is 12.0"+
        "\nYou earned 3 frequent renter points";
    customer.addRental(new Rental(new Movie("New Release", Movie.NEW_RELEASE), 3));
    customer.addRental(new Rental(new Movie("Childrens", Movie.CHILDRENS), 4));
    String actual = customer.statement();
    assertEquals(expected , actual);
  }
  
}
