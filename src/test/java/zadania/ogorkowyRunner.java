package zadania;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="scr/Cucumber/Features/cucumber.feature", plugin= {"pretty", "html:out"}, glue = "ogorkowyStepDefinition")
public class ogorkowyRunner {
}
