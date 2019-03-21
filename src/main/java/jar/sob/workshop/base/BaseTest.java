package jar.sob.workshop.base;

import jar.sob.workshop.services.ConfigService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest {
  protected DriverBase driverBase;
  private static final Logger log = LogManager.getLogger();

  @BeforeMethod()
  @Parameters({"browser"})
  public void setUp(String browser) {
    driverBase = new DriverBase(browser);
    driverBase.getDriver().get(ConfigService.getConfigService().getStringProperty("AutomationPractice.url"));
  }

  @AfterMethod()
  public void tearDown() {
    driverBase.getDriver().quit();
  }
}

