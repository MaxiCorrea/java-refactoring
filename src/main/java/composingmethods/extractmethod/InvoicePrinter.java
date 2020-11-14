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
    String output = "";
    output += "**************************\n";
    output += "*****    Invoice    ******\n";
    output += "**************************\n";
    
    for(Item item : items) {
      outstanding += item.getAmount();
    }
    
    output += "name : " + name + "\n";
    output += "amount : " + outstanding + "\n";
    return output;
  }
  
}
