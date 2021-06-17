package dealingwithgeneralization.replaceinheritancewithdelegation;

import java.util.Vector;

/**
 * 
 * @author mxcorrea
 *
 */
public class MyStack<E> extends Vector<E>{
  private static final long serialVersionUID = 1L;

  public void push(E element) {
    super.insertElementAt(element, 0);
  }
  
  public E pop() {
    E element = super.elementAt(0);
    super.remove(0);
    return element;
  }
  
}
