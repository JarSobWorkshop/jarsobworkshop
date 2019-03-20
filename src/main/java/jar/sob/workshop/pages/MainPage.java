package jar.sob.workshop.pages;

import jar.sob.workshop.methodsSupport.ClickMethods;
import jar.sob.workshop.methodsSupport.CompareMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {

  @FindBy(xpath = "//div[@id='block_top_menu']/ul/li")
  protected List<WebElement> listTopMenu;

  public MainPage() {
    super();
  }

  public MainPage clickInMenu(String textInMenu) {
    log.info(getDriver().getTitle());
    ClickMethods.clickInElementFromListContainsText(textInMenu, listTopMenu);
    return this;
  }
  public MainPage compareTitleInPage(String title){
    new CompareMethods().isTitleCompare(title);
    return this;
  }

}