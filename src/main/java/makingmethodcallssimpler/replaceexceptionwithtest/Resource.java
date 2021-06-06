package makingmethodcallssimpler.replaceexceptionwithtest;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Resource {

  private final String name;
  private final Integer value;
  
  public Resource() {
    this("",0);
  }
  
  public Resource(
      final String name ,
      final Integer value) {
    this.name = name;
    this.value = value;
  }
  
  public String getName() {
    return name;
  }
  
  public Integer getValue() {
    return value;
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
