package makingmethodcallssimpler.replaceexceptionwithtest;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * 
 * @author mxcorrea
 *
 */
public final class ResourcePool {

  private final Stack<Resource> available;
  private final Stack<Resource> allocated;
  
  public ResourcePool() {
    available = new Stack<>();
    allocated = new Stack<>();
  }
  
  public final Resource getResource() {
    try {
      Resource result = available.pop();
      allocated.push(result);
      return result;
    } catch(EmptyStackException ex) {
      Resource result = new Resource();
      allocated.push(result);
      return result;
    }
  }
  
  public final Resource getResourceNotException() {
    Resource result = available.isEmpty() ? 
        new Resource() : available.pop();
    allocated.push(result);
    return result;
    
  }
  
}
