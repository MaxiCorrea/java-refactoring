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
      frequentRenterPoints += each.frequentRenterPoints();
      result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
      totalAmount += each.getCharge();
    }
    result += "Amount owed is " + totalAmount + "\n";
    result += "You earned " + frequentRenterPoints + " frequent renter points";
    return result;
  }

}
