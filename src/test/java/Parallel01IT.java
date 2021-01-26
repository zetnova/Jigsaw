import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features = {"classpath:features/Jigsaw.feature"},
    format = {"json:target/1.json", "pretty"},
    monochrome = true,
    tags = {"@Test"},
    glue = { "com.automation.steps" })
public class Parallel01IT {
}