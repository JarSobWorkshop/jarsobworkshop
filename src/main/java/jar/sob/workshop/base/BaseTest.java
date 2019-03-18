package jar.sob.workshop.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest {
  protected WebDriver driver;
  private static final Logger log = LogManager.getLogger();

  @BeforeMethod()
  @Parameters({"browser", "url"})
  public void setUp(String browser, String url) {
    BrowserBase browserBase = new BrowserBase(browser, url);
    driver = browserBase.getDriver();
    log.info("OBIEKTY: " + browserBase.getBrowser());
  }

  @AfterMethod()
  public void tearDown() {
    if (driver != null) driver.quit();
  }
}

