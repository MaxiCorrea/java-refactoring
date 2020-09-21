package chapter001.starting03;

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
    result += "Amount owed is " + getTotalCharge() + "\n";
    result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
    return result;
  }
  
  public String htmlStatement() {
    String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
    for(Rental each : rentals) {
      result += each.getMovie().getTitle()+ ": " + each.getCharge() + "<BR>\n";
    }
    result += "<P>You owe <EM>" + getTotalCharge() +"</EM><P>\n";
    result += "On this rental you earned <EM>" + getTotalFrequentRenterPoints() + "</EM> frequent renter points<P>";
    return result;
  }
  
  public double getTotalCharge() {
    double totalAmount = 0;
    for (Rental each : rentals) {
      totalAmount += each.getCharge();
    }
    return totalAmount;
  }
  
  public int getTotalFrequentRenterPoints() {
    int frequentRenterPoints = 0;
    for (Rental each : rentals) {
      frequentRenterPoints += each.getFrequentRenterPoints();
    }
    return frequentRenterPoints;
  }
  
}
