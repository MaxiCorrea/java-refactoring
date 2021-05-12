package organizingdata.changereferencetovalue;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Currency {

  public static final Map<String, Currency> INSTANCES = new HashMap<>(); 
    
  public static final Currency get(
      final String code) {
    return INSTANCES.get(code);
  }
  
  static {
    new Currency("PES").store();
    new Currency("DOL").store();
  }
  
  private final String code;
  
  private Currency(
      final String code) {
    this.code = code;
  }
  
  public String getCode() {
    return code;
  }
  
  private void store() {
    INSTANCES.put(code, this);
  }
  
  @Override
  public boolean equals(Object obj) {
    return reflectionEquals(this, obj);
  }
  
  @Override
  public int hashCode() {
    return reflectionHashCode(this);
  }
  
}
