package jar.sob.workshop.methodsSupport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ClickMethods extends BaseMethods {
  private static final Logger log = LogManager.getLogger();
  protected static WebDriverWait wait;

  public void clickOnElement(WebElement element) {
    log.info("Click in element \"" + element + "\"");
    wait = new WebDriverWait(getDriver(), 10);
    wait.until(ExpectedConditions.elementToBeClickable(element));
    element.click();
  }

  public static void clickInElementFromListContainsText(String textInElement, List<WebElement> listElements) {
    for (WebElement element : listElements) {
      if (element.getText().equals(textInElement)) {
        log.info("Click in menu \"" + element.getText() + "\"");
        element.click();
        break;
      }
    }
  }
}
