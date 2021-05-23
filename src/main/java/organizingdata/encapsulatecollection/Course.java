package organizingdata.encapsulatecollection;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Course {

  private final String name;
  private final boolean isAdvance;
  
  public Course(
      final String name,
      final boolean isAdvance) {
    this.name = name;
    this.isAdvance = isAdvance;
  }
  
  public String getName() {
    return name;
  }
  
  public boolean isAdvance() {
    return isAdvance;
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
