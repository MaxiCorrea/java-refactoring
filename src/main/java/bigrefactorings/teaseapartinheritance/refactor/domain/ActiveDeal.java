package bigrefactorings.teaseapartinheritance.refactor.domain;

import bigrefactorings.teaseapartinheritance.refactor.presentation.PresentationStyle;
import bigrefactorings.teaseapartinheritance.refactor.presentation.SingleActivePresentationStyle;

/**
 * 
 * @author mxcorrea
 *
 */
public class ActiveDeal extends Deal {

  public ActiveDeal() {
    super( new SingleActivePresentationStyle());
  }
  
  public ActiveDeal(PresentationStyle presentationStyle) {
    super(presentationStyle);
  }
  
}
