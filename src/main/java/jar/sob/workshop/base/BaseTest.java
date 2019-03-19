package jar.sob.workshop.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public abstract class BaseTest {
  public WebDriver driver;
  private static final Logger log = LogManager.getLogger();

  @BeforeMethod()
  @Parameters({"browser", "url"})
  public void setUp(String browser, String url) {
    DriverBase driverBase = new DriverBase(browser, url);
    driverBase.getBrowser();
    driver = driverBase.getDriver();
    log.info("OBIEKTY: " + driverBase.getDriver());
  }

  @AfterMethod()
  public void tearDown() {
    driver.close();
    driver.quit();
  }
}

