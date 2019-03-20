package jar.sob.workshop.methodsSupport;

public class BrowserMethods extends  BaseMethods {

  public String getTitle(){
    return getDriver().getTitle();
  }
}

