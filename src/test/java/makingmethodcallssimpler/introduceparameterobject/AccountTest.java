package makingmethodcallssimpler.introduceparameterobject;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class AccountTest {

  private final Collection<Entry> ENTRIES = Arrays.asList(
      new Entry(new BigDecimal("1"), LocalDate.of(2020, 1, 1)),
      new Entry(new BigDecimal("2"), LocalDate.of(2020, 1, 2)),
      new Entry(new BigDecimal("3"), LocalDate.of(2020, 1, 3)),
      new Entry(new BigDecimal("4"), LocalDate.of(2020, 1, 4)),
      new Entry(new BigDecimal("5"), LocalDate.of(2020, 1, 5)));
  
  @Test
  public void testFlowBetweenDates() {
    Account account = new Account(ENTRIES);
    BigDecimal expected = new BigDecimal("15");
    BigDecimal actual = account.getFlowBetween(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 1, 5));
    assertEquals(expected, actual); 
    
    expected = new BigDecimal("9");
    actual = account.getFlowBetween(LocalDate.of(2020, 1, 2), LocalDate.of(2020, 1, 4));
    assertEquals(expected, actual);
  }

}
