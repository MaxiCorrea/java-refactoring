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

  public Customer(final String name) {
    this.name = name;
    this.rentals = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void addRental(final Rental rental) {
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

  public String htmlStatement() {
    String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
    for (Rental each : rentals) {
      result += each.getMovie().getTitle() + " : " + each.getCharge() + "<BR>\n";
    }
    result += "<P>You owe <EM>" + getTotalAmount() + "</EM><P>\n";
    result += "On this rental you earned <EM>" + getTotalFrequentRenterPoints()
        + "</EM> frequent renter points<P>";
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
