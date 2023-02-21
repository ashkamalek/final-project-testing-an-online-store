package steps;


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/", glue="steps",
        plugin= {"pretty", "html:out"})
public class Runner1 extends AbstractTestNGCucumberTests {
}
