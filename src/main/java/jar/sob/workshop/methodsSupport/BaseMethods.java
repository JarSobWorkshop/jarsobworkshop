package jar.sob.workshop.methodsSupport;

import jar.sob.workshop.base.DriverBase;
import org.openqa.selenium.WebDriver;

public abstract class BaseMethods {

  protected WebDriver getDriver(){
    return DriverBase.drivers.get();
  }


}
