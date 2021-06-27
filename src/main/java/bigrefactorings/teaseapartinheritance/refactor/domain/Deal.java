package bigrefactorings.teaseapartinheritance.refactor.domain;

import bigrefactorings.teaseapartinheritance.refactor.presentation.PresentationStyle;

/**
 * 
 * @author mxcorrea
 *
 */
public class Deal {

  private PresentationStyle presentationStyle;
  
  public Deal(PresentationStyle presentationStyle) {
    this.presentationStyle = presentationStyle;
  }
  
  public PresentationStyle getPresentationStyle() {
    return presentationStyle;
  }
  
}
