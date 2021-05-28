package simplifyingconditionalexpressions.removecontrolflag;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

/**
 * 
 * @author mxcorrea
 *
 */
public final class People {

  private String name;

  public People(
      final String name) {
    this.name = name;
  }

  public String getName() {
    return name;
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
