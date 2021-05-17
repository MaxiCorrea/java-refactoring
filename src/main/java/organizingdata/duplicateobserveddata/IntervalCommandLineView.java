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
public class IntervalCommandLineView {

  private final IntegerCommandLineView startValue;
  private final IntegerCommandLineView endValue;
  private final IntegerCommandLineView lengthValue;
  private final Scanner keyboard;

  public IntervalCommandLineView(
      final OutputStream outputStream, 
      final InputStream inputStream) {
    keyboard = new Scanner(inputStream);
    startValue = new IntegerCommandLineView("0", outputStream);
    endValue = new IntegerCommandLineView("0", outputStream);
    lengthValue = new IntegerCommandLineView("0", outputStream);
    calculateLength();
  }

  public void readNewStartValue() {
    String newValue = keyboard.nextLine();
    startValue.setValue(newValue);
    calculateLength();
  }

  public void readNewEndValue() {
    String newValue = keyboard.nextLine();
    endValue.setValue(newValue);
    calculateLength();
  }
  
  public void readNewLenghtValue() {
    String newValue = keyboard.nextLine();
    lengthValue.setValue(newValue);
    calculateEnd();
  }

  private void calculateLength() {
    int start = Integer.parseInt(startValue.getValue());
    int end = Integer.parseInt(endValue.getValue());
    int length = end - start;
    lengthValue.setValue(String.valueOf(length));
  }

  private void calculateEnd() {
    int start = Integer.parseInt(startValue.getValue());
    int length = Integer.parseInt(lengthValue.getValue());
    int end = start + length;
    endValue.setValue(String.valueOf(end));
  }

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

}
