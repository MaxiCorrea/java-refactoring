package dealingwithgeneralization.formtemplatemethod;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class SiteTest {

  @Test
  public void testCalculateBillableAmountLifelineSite() {
    Site site = new LifelineSite(10, 20);
    double expectedBillableAmount = 2200.0;   
    double actualBillableAmount = site.calculateBillableAmount();
    assertEquals(expectedBillableAmount, actualBillableAmount , 0.0);
  }

  @Test
  public void testCalculateBillableAmountResidentialSite() {
    Site site = new ResidentialSite(10, 20);
    double expectedBillableAmount = 300;   
    double actualBillableAmount = site.calculateBillableAmount();
    assertEquals(expectedBillableAmount, actualBillableAmount , 0.0);
  }
  
}
