package composingmethods.extractmethod;

import java.util.List;

public class InvoicePrinter {

  private String name;
  private List<Item> items;
  private double outstanding;
  
  public InvoicePrinter(
      final String name,
      final List<Item> items) {
    this.name = name;
    this.items = items;
    this.outstanding = 0.0;
  }
  
  public String getName() { 
    return name;
  }
  
  public double getOutstanding() {
    return outstanding;
  }
  
  public String print() {
    String output = printBanner();
    
    for(Item item : items) {
      outstanding += item.getAmount();
    }
    
    output += "name : " + name + "\n";
    output += "amount : " + outstanding + "\n";
    return output;
  }
  
  private String printBanner() {
    String result = "";
    result += "**************************\n";
    result += "*****    Invoice    ******\n";
    result += "**************************\n";
    return result;
  }
  
}
