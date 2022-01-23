package zadania;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:/intellij for selenium/SeleniumCourse2/src/Cucumber/Features/cucumber.feature",
        plugin= {"pretty", "html:out"}, glue = "stepDefinitions")
public class ogorkowyRunner {
}
