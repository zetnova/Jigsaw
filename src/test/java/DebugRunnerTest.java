import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = {"./src/test/resources/features/"},
        format = {"pretty","json:target/cucumber.json","html:target/site/cucumber-pretty" },
        tags = {"@Test"},
        glue = {"com.automation.steps"}
)
public class DebugRunnerTest {
}
