package chapter001.originalcode;

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
      double thisAmount = 0;
      int priceCode = each.getMovie().getPriceCode();
      int daysRented = each.getDaysRented();
      if (priceCode == Movie.NEW_RELEASE) {
        thisAmount += daysRented * 3;
      } else if (priceCode == Movie.CHILDRENS) {
        thisAmount += 1.5;
        if (each.getDaysRented() > 3) {
          thisAmount += (daysRented - 3) * 1.5;
        }
      } else if (priceCode == Movie.REGULAR) {
        thisAmount += 2;
        if (each.getDaysRented() > 2) {
          thisAmount += (daysRented - 2) * 1.5;
        }
      }
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

}
