package jar.sob.workshop.automationPracticesuite;

import jar.sob.workshop.base.BaseTest;
import jar.sob.workshop.pages.MainPage;
import org.testng.annotations.Test;

public class VerifyTopMenu extends BaseTest {

  @Test()
  public void checkMenu() {
    new MainPage(driver)
        .clickInMenuContainsText("WOMEN");
  }

  @Test()
  public void checkMenu2() {
    new MainPage(driver)
        .clickInMenuContainsText("DRESSES");
  }

  @Test()
  public void checkMenu3() {
    new MainPage(driver)
        .clickInMenuContainsText("T-SHIRTS");
  }
}
