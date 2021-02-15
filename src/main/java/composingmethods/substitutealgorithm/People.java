package composingmethods.substitutealgorithm;
/**
 * 
 * @author mxcorrea
 *
 */
public final class People {

  public static final class Builder {
    
    private String name;
    private String surname;
    private Integer age;
    
    public Builder name(
        final String name) {
      this.name = name;
      return this;
    }
    
    public Builder surname(
        final String surname) {
      this.surname = surname;
      return this;
    }
    
    public Builder age(
        final Integer age) {
      return this;
    }
    
    public People build() {
      return new People(this);
    }
  }
  
  private final String name;
  private final String surname;
  private final Integer age;
  
  private People(Builder builder) {
    name = builder.name;
    surname = builder.surname;
    age = builder.age;
  }    
  
  public String getName() {
    return name;
  }
  
  public String getSurname() {
    return surname;
  }
  
  public Integer getAge() {
    return age;
  }
  
}
