package dealingwithgeneralization.extractinterface;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class ClientTest {

  private static final int RATE = 200;
  private static final int DAYS = 10;

  private Billable billableSpecialSkill = new Billable() {
    @Override public boolean hasSpecialSkill() { return true; }
    @Override public int getRate() { return RATE; }
  };
  
  private Billable billable = new Billable() {
    @Override public boolean hasSpecialSkill() { return false; }
    @Override public int getRate() { return RATE; }
  };
  
  @Test
  public void testChargeSpecialSkill() {
    Client client = new Client();
    double expectedCharge = 2100.0;
    double actualCharge = client.charge(billableSpecialSkill, DAYS);
    assertEquals(expectedCharge, actualCharge, 0.0);
  }

  @Test
  public void testCharge() {
    Client client = new Client();
    double expectedCharge = 2000.0;
    double actualCharge = client.charge(billable, DAYS);
    assertEquals(expectedCharge, actualCharge, 0.0);
  }

}
