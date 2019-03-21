package jar.sob.workshop.automationPracticesuite;

import jar.sob.workshop.base.BaseTest;
import jar.sob.workshop.pages.MainPage;
import org.testng.annotations.Test;

public class VerifyTopMenu extends BaseTest {

  @Test(description = "Test1")
  public void checkMenu() {
    new MainPage()
        .openPage()
        .clickInMenu("WOMEN")
        .compareTitleInPage("Women - My Store");
  }

  @Test(description = "Test2")
  public void checkMenu2() {
    new MainPage()
        .openPage()
        .clickInMenu("DRESSES")
        .compareTitleInPage("Dresses - My Store");
  }

  @Test(description = "Test3")
  public void checkMenu3() {
    new MainPage()
        .openPage()
        .clickInMenu("T-SHIRTS")
        .compareTitleInPage("T-shirts - My Store");
  }
}
