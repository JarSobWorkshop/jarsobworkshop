package jar.sob.workshop.methodsSupport;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CompareMethods extends BaseMethods {

  public void isTitleCompare(String title){
    assertThat(getDriver().getTitle())
        .overridingErrorMessage("Title is not compare")
        .isEqualToIgnoringCase(title);
  }


}
