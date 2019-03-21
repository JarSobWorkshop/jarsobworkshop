package jar.sob.workshop.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class DriverBase {

  public static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();
  private String browser = null;

  public DriverBase(String browser) {
    switch (browser) {
      case ("chrome"):
        WebDriverManager.chromedriver().setup();
        drivers.set(new ChromeDriver());
        break;
      case ("firefox"):
        WebDriverManager.firefoxdriver().setup();
        drivers.set(new FirefoxDriver());
        break;
      case ("iedriver"):
        WebDriverManager.iedriver().setup();
        drivers.set(new InternetExplorerDriver());
        break;
      case ("edge"):
        WebDriverManager.edgedriver().setup();
        drivers.set(new EdgeDriver());
        break;
      }
      drivers.get().manage().window().maximize();
      drivers.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public String getBrowser () {
      return this.browser;
    }

    public WebDriver getDriver () {
      return this.drivers.get();
    }


  }

