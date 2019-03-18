package jar.sob.workshop.methods_support;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ClickMethods {
  private static final Logger log = LogManager.getLogger();

  public static void clickOnElement(WebElement element) {
    log.info("Click in element \"" + element + "\"");
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
