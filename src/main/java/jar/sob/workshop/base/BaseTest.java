package jar.sob.workshop.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {
  public WebDriver driver;

  @BeforeClass
  public void setUpClass() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeTest
  public void setUpTest() {
    if (driver == null) {
      driver = new ChromeDriver();
    }
  }

  @AfterTest
  public void tearDown() {
    if (driver != null) driver.quit();
  }


}
