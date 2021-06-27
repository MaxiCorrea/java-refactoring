package bigrefactorings.teaseapartinheritance.refactor.domain;

import bigrefactorings.teaseapartinheritance.refactor.presentation.PresentationStyle;
import bigrefactorings.teaseapartinheritance.refactor.presentation.SinglePassivePresentationStyle;

/**
 * 
 * @author mxcorrea
 *
 */
public class PassiveDeal extends Deal {

  public PassiveDeal() {
    super(new SinglePassivePresentationStyle());
  }
  
  public PassiveDeal(PresentationStyle presentationStyle) {
    super(presentationStyle);
  }
  
}
