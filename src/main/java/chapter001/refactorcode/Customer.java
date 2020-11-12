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
    String result = "Rental Record for " + getName() + "\n";
    for (Rental each : rentals) {
      result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
    }
    result += "Amount owed is " + getTotalAmount() + "\n";
    result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
    return result;
  }

  private double getTotalAmount() {
    double total = 0.0;
    for (Rental each : rentals) {
      total += each.getCharge();
    }
    return total;
  }
  
  private int getTotalFrequentRenterPoints() {
    int total = 0;
    for (Rental each : rentals) {
      total += each.getFrequentRenterPoints();
    }
    return total;
  }
  
}
