package jar.sob.workshop.automationPracticesuite;

import jar.sob.workshop.base.BaseTest;
import jar.sob.workshop.pages.MainPage;
import org.testng.annotations.Test;

public class VerifyTopMenu extends BaseTest {
  private MainPage mainPage;

  @Test(description = "test 1")
  public void checkMenu() {
    mainPage = new MainPage(driver);
    mainPage.clickInMenuContainsText("WOMEN");
  }

  @Test(description = "test 2")
  public void checkMenu2() {
    mainPage = new MainPage(driver);
    mainPage.clickInMenuContainsText("DRESSES");
  }

  @Test(description = "test 3")
  public void checkMenu3() {
    mainPage = new MainPage(driver);
    mainPage.clickInMenuContainsText("T-SHIRTS");
  }
}
