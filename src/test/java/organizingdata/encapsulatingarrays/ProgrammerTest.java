package organizingdata.encapsulatingarrays;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 * @author mxcorrea
 *
 */
public class ProgrammerTest {

  private static final String SKILLS[] = {"Object Oriented Programming", "Refactoring"};

  @Test
  public void shouldBeAbleToEstablishYourSkills() {
    Programmer programmer = new Programmer("Max", SKILLS);
    assertNotNull(programmer.getSkills());
    assertTrue(programmer.hasSkills());
    assertArrayEquals(SKILLS, programmer.getSkills());
  }

  @Test
  public void shouldBeAbleToModifyASkill() {
    Programmer programmer = new Programmer("Max", SKILLS);
    programmer.setSkill(0, "Functional Programming");
    String expectedSkills[] = {"Functional Programming", "Refactoring"};
    assertArrayEquals(expectedSkills, programmer.getSkills());
  }

  @Test
  public void shouldBeAbleToRemoveASkill() {
    Programmer programmer = new Programmer("Max", SKILLS);
    programmer.removeSkill(0);
    String expectedSkills[] = {"Refactoring"};
    assertArrayEquals(expectedSkills, programmer.getSkills());
    programmer.setSkills(SKILLS);
    expectedSkills = new String[] {"Object Oriented Programming"};
    programmer.removeSkill(1);
    assertArrayEquals(expectedSkills, programmer.getSkills());
    programmer.setSkills(new String[] {"Java Programming", "Unit Testing", "React Development"});
    expectedSkills = new String[] {"Java Programming", "React Development"};
    programmer.removeSkill(1);
    assertArrayEquals(expectedSkills, programmer.getSkills());
  }

}
