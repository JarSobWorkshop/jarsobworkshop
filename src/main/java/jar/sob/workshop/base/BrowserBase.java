package jar.sob.workshop.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserBase {
  public ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();
  private WebDriver driver = null;
  private String browser = null;
  private String url = null;

  public  BrowserBase(String browser, String url) {
    this.browser = browser;
    if (browser.equalsIgnoreCase("chrome")) {
      WebDriverManager.chromedriver().setup();
      this.driver = new ChromeDriver();
      drivers.set(driver);
    } else if (browser.equalsIgnoreCase("firefox")) {
      WebDriverManager.firefoxdriver().setup();
      this.driver = new FirefoxDriver();
      drivers.set(driver);
    } else if (browser.equalsIgnoreCase("iedriver")) {
      WebDriverManager.iedriver().setup();
      this.driver = new InternetExplorerDriver();
      drivers.set(driver);
    } else {
      WebDriverManager.edgedriver().setup();
      this.driver = new EdgeDriver();
      drivers.set(driver);
    }
    this.driver.manage().window().maximize();
    this.driver.manage().timeouts().implicitlyWait(60, TimeUnit.MILLISECONDS);
    this.driver.get(url);
  }

  public String getBrowser() {
    return this.browser;
  }

  public WebDriver getDriver() {
    return drivers.get();
  }

  public String getUrl() {
    return url;
  }

}

