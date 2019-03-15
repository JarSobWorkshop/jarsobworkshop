package jar.sob.workshop.steps;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import jar.sob.workshop.base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GivenSteps extends BaseTest {
  private WebDriver driver;
  private final Logger log = LogManager.getLogger();

  @Given(": Wejdź na stronę {string}")
  public void goToPage(String string) {
    log.debug("Wchodzę na stronę i debug");
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get(string);
  }
}
