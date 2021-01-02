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
    return (systemName.toUpperCase().indexOf("MAC") > -1)
        && (browser.toUpperCase().indexOf("IE") > -1);
  }

}
