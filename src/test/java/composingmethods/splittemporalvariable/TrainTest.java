package composingmethods.splittemporalvariable;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TrainTest {

  @Test
  public void testingPrimaryForce() {
    Train train = new Train(3.4 , 0.0 , 10, 5);
    double expected = 425.0;
    double actual = train.getDistanceTravelled(50);
    assertEquals(expected, actual , 0.0);
  }

  @Test
  public void testingSecondaryForce() {
    Train train = new Train(3.4 , 5 , 10, 5);
    double expected = 931.2500000000001;
    double actual = train.getDistanceTravelled(50);
    assertEquals(expected, actual , 0.0);
  }
  
}
