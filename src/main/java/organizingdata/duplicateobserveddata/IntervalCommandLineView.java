package organizingdata.duplicateobserveddata;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * 
 * @author mxcorrea
 *
 */
public class IntervalCommandLineView implements IntervalDomain.IntervalObserver {

  private final IntegerCommandLineView startValue;
  private final IntegerCommandLineView endValue;
  private final IntegerCommandLineView lengthValue;
  private final IntervalDomain domain;
  private final Scanner keyboard;

  public IntervalCommandLineView(
      final OutputStream outputStream, 
      final InputStream inputStream) {
    keyboard = new Scanner(inputStream);
    startValue = new IntegerCommandLineView(outputStream);
    endValue = new IntegerCommandLineView(outputStream);
    lengthValue = new IntegerCommandLineView(outputStream);
    domain = new IntervalDomain(this);
  }

  public void readNewStartValue() { domain.changeStart(keyboard.nextLine()); }
  public void readNewEndValue() { domain.changeEnd(keyboard.nextLine()); }
  public void readNewLenghtValue() { domain.changeLength(keyboard.nextLine()); }
 
  public void displayStart() throws IOException {
    startValue.print();
  }
  
  public void displayEnd() throws IOException {
    endValue.print();
  }
  
  public void displayLength() throws IOException {
    lengthValue.print();
  }
  
  public void close() {
    keyboard.close();
  }

  @Override
  public void updateFromDomain(
      final IntervalDomain domain) {
    startValue.setValue(String.valueOf(domain.getStart()));
    endValue.setValue(String.valueOf(domain.getEnd()));
    lengthValue.setValue(String.valueOf(domain.getLength()));
  }

}
