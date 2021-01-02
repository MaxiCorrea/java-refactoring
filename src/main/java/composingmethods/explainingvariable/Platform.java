package composingmethods.explainingvariable;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Platform {

  private final String systemName;
  private final String browser;

  public Platform(
      final String systemName, 
      final String browser) {
    this.systemName = systemName;
    this.browser = browser;
  }

  public final String getSystemName() {
    return systemName;
  }

  public final String getBrowser() {
    return browser;
  }

  public final boolean isSupported() {
    final boolean isMac = systemName.toUpperCase().indexOf("MAC") > -1; 
    final boolean isIE = browser.toUpperCase().indexOf("IE") > -1;
    return isMac && isIE;
  }

}
