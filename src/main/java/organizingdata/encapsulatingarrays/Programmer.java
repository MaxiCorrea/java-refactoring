package organizingdata.encapsulatingarrays;

import static java.lang.System.arraycopy;
import static java.util.Objects.requireNonNull;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Programmer {

  private String name;
  private String[] skills;
  
  public Programmer(
      final String name,
      final String[] skills) {
    this.name = requireNonNull(name);
    this.skills = requireNonNull(skills);
  }

  public final boolean hasSkills() {
    return skills.length != 0;
  }
  
  public final void setSkills(
      final String[] newSkills) {
    this.skills = new String[newSkills.length];
    int index = 0;
    for(String skill : newSkills)
      setSkill(index++, skill);
  }
  
  public final void setSkill(
      final int index ,
      final String newSkill) {
    if(index < skills.length) {
      skills[index] = newSkill;
    }
  }
  
  public final void removeSkill(
      final int index) {
    String[] copy = new String[skills.length - 1];
    arraycopy(skills, 0, copy, 0, index);
    arraycopy(skills, index + 1 , copy, index, copy.length - index);
    skills = copy;
  }
  
  public final String[] getSkills() {
    String[] copy = new String[skills.length];
    arraycopy(skills, 0, copy, 0, skills.length);
    return copy;
  }
  
  public final String getName() {
    return name;
  }

}
