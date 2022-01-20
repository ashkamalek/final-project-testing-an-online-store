package zadania;

import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="scr/Cucumber/Features/cucumber.feature", plugin= {"pretty", "html:out"}, glue = "ogorkowyStepDefinition")
public class ogorkowyRunner {
}
