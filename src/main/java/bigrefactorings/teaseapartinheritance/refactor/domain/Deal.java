package bigrefactorings.teaseapartinheritance.refactor.domain;

import bigrefactorings.teaseapartinheritance.refactor.presentation.PresentationStyle;
import bigrefactorings.teaseapartinheritance.refactor.presentation.SinglePresentationStyle;

/**
 * 
 * @author mxcorrea
 *
 */
public class Deal {

  private PresentationStyle presentationStyle;
  
  public Deal() {
    this.presentationStyle = new SinglePresentationStyle();
  }
  
  public PresentationStyle getPresentationStyle() {
    return presentationStyle;
  }
  
}
