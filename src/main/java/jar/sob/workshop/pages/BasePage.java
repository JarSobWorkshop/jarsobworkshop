package jar.sob.workshop.pages;

import jar.sob.workshop.base.DriverBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

  protected static final Logger log = LogManager.getLogger();

  BasePage() {
    PageFactory.initElements(getDriver(), this);
  }

  protected WebDriver getDriver() { return DriverBase.drivers.get(); }

}
