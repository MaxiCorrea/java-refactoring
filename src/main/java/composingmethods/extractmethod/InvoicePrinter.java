package composingmethods.extractmethod;

import java.util.List;

public class InvoicePrinter {

  private String name;
  private List<Item> items;
  
  public InvoicePrinter(
      final String name,
      final List<Item> items) {
    this.name = name;
    this.items = items;
  }
  
  public String getName() { 
    return name;
  }
  
  public String print() {
    String output = printBanner();
    double outstanding = calculateOutstanding();
    output += printDetails(outstanding);
    return output;
  }
   
  private String printBanner() {
    String result = "";
    result += "**************************\n";
    result += "*****    Invoice    ******\n";
    result += "**************************\n";
    return result;
  }
  
  private double calculateOutstanding() {
    double result = 0.0;
    for(Item item : items) {
      result += item.getAmount();
    }
    return result;
  }
  
  private String printDetails(
      final double outstanding) {
    String result = "";
    result += "name : " + name + "\n";
    result += "amount : " + outstanding + "\n";
    return result;
  }
  
}
