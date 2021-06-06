package dealingwithgeneralization.extractsubclass;
/**
 * 
 * @author mxcorrea
 *
 */
public final class LaborItem extends JobItem {

  public LaborItem(
      final int unitPrice, 
      final int quantity, 
      final boolean isLabor, 
      final Employee employee) {
    super(unitPrice, quantity, isLabor, employee);
  }

}
