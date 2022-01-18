import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="scr/Cucumber/Features", plugin= {"pretty", "html:out"})

public class ogorkowyRunner {
}
