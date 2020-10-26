package chapter001.refactorcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author mxcorrea
 *
 */
public class Customer {

  private String name;
  private List<Rental> rentals;

  public Customer(
      final String name) {
    this.name = name;
    this.rentals = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void addRental(
      final Rental rental) {
    rentals.add(rental);
  }

  public String statement() {
    double totalAmount = 0;
    int frequentRenterPoints = 0;
    String result = "Rental Record for " + getName() + "\n";
    for (Rental each : rentals) {
      int priceCode = each.getMovie().getPriceCode();
      int daysRented = each.getDaysRented();
      double thisAmount = amountOf(each);
      frequentRenterPoints++;
      if (priceCode == Movie.NEW_RELEASE && daysRented > 1) {
        frequentRenterPoints++;
      }
      result += "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";
      totalAmount += thisAmount;
    }

    result += "Amount owed is " + totalAmount + "\n";
    result += "You earned " + frequentRenterPoints + " frequent renter points";
    return result;
  }

  private double amountOf(
      final Rental rental) {
    int priceCode = rental.getMovie().getPriceCode();
    int daysRented = rental.getDaysRented();
    double thisAmount = 0;
    if (priceCode == Movie.NEW_RELEASE) {
      thisAmount += daysRented * 3;
    } else if (priceCode == Movie.CHILDRENS) {
      thisAmount += 1.5;
      if (rental.getDaysRented() > 3) {
        thisAmount += (daysRented - 3) * 1.5;
      }
    } else if (priceCode == Movie.REGULAR) {
      thisAmount += 2;
      if (rental.getDaysRented() > 2) {
        thisAmount += (daysRented - 2) * 1.5;
      } 
    }
    return thisAmount;
  }
  
}
