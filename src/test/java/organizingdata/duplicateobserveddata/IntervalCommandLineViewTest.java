package organizingdata.duplicateobserveddata;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class IntervalCommandLineViewTest {

  private static final String INPUT_DATA = "4\n12\n";
  private ByteArrayOutputStream output;
  private ByteArrayInputStream input;
  
  @Before
  public void setupTest() {
    output = new ByteArrayOutputStream();
    input = new ByteArrayInputStream(INPUT_DATA.getBytes());
  }
  
  @Test
  public void test() throws IOException {
    IntervalCommandLineView view = new IntervalCommandLineView(output, input);
    view.readNewStartValue();
    view.readNewEndValue();
    view.displayLength();
    String expectedLength = "8";
    assertEquals(expectedLength , output.toString());
    view.close();
  }

  
}
