package jar.sob.workshop.pages;

import jar.sob.workshop.methods_support.ClickMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {

  @FindBy(xpath = "//div[@id='block_top_menu']/ul/li")
  protected List<WebElement> listTopMenu;

  public MainPage(WebDriver driver) {
    super(driver);
  }

  public void clickInMenuContainsText(String textInMenu) {
    ClickMethods.clickInElementFromListContainsText(textInMenu, listTopMenu);
  }

}