package dealingwithgeneralization.replaceinheritancewithdelegation;

import java.util.Vector;

/**
 * 
 * @author mxcorrea
 *
 */
public final class MyStack<E> {

  private final Vector<E> vector;

  public MyStack() {
    vector = new Vector<>();
  }

  public void push(E element) {
    vector.insertElementAt(element, 0);
  }

  public E pop() {
    E element = vector.elementAt(0);
    vector.remove(0);
    return element;
  }

  public boolean isEmpty() {
    return vector.isEmpty();
  }

  public int size() {
    return vector.size();
  }
}
