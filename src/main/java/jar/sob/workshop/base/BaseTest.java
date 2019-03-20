package jar.sob.workshop.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest {
  protected DriverBase driverBase;
  private static final Logger log = LogManager.getLogger();

  @BeforeMethod()
  @Parameters({"browser", "url"})
  public void setUp(String browser, String url) {
    driverBase = new DriverBase(browser, url);
  }

  @AfterMethod()
  public void tearDown() {
    driverBase.getDriver().quit();
  }
}

