package dealingwithgeneralization.replaceinheritancewithdelegation;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class MyStackTest {

  @Test
  public void testFIFO() {
    MyStack<String> myStack = new MyStack<>();
    assertTrue(myStack.isEmpty());
    myStack.push("1");
    myStack.push("2");
    myStack.push("3");
    assertEquals(3, myStack.size());
    assertEquals("3",myStack.pop());
    assertEquals("2",myStack.pop());
    assertEquals("1",myStack.pop());
    assertTrue(myStack.isEmpty());
  }

}
