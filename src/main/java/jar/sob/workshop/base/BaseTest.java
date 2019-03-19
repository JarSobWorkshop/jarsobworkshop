package jar.sob.workshop.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public abstract class BaseTest {
  public WebDriver driver;
  private static final Logger log = LogManager.getLogger();

  @BeforeClass(alwaysRun = true)
  @Parameters({"browser", "url"})
  public void setUp(String browser, String url) {
    DriverBase driverBase = new DriverBase(browser, url);
    driverBase.getBrowser();
    driver = driverBase.getDriver();
    log.info("OBIEKTY: " + driverBase.getDriver());
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() {
    driver.quit();
  }
}

