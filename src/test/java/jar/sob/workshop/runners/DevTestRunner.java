package jar.sob.workshop.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue= {"jar.sob.workshop.steps"},tags = {"not @out_of_scope", "@dev"})

public class DevTestRunner {

}