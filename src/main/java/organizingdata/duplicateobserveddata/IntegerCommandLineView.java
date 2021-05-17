package organizingdata.duplicateobserveddata;

import java.io.IOException;
import java.io.OutputStream;

/**
 * 
 * @author mxcorrea
 *
 */
public final class IntegerCommandLineView {

  private String value;
  private OutputStream stream;
  
  public IntegerCommandLineView(
      final String value,
      final OutputStream stream){
    this.value = value;
    this.stream = stream;
  }
  
  public void setValue(
      final String value) {
    this.value = value;
  }
  
  public String getValue() {
    return value;
  }
  
  public final void print() throws IOException {
    stream.write(value.getBytes());
    stream.flush();
  }
  
}
