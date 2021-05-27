package simplifyingconditionalexpressions.decomposeconditional;

import java.time.LocalDate;
/**
 * 
 * @author mxcorrea
 *
 */
public final class HouseRental {

  public static LocalDate SUMMER_START;
  public static LocalDate SUMMER_END;
  
  private final LocalDate date;
  private final double winterRate;
  private final double summerRate;
  private final double winterServiceCharge;
  
  public HouseRental(
      final LocalDate date,
      final double winterRate ,
      final double summerRate,
      final double winterServiceCharge) {
    this.date = date;
    this.winterRate = winterRate;
    this.summerRate = summerRate;
    this.winterServiceCharge = winterServiceCharge;
  }
  
  public final double calculateCharge(
      final int rentalDays) {
    double charge;
    if (date.isBefore(SUMMER_START) || date.isAfter(SUMMER_END))
      charge = rentalDays * winterRate + winterServiceCharge;
     else charge = rentalDays * summerRate;
    return charge;
  }
  
}
