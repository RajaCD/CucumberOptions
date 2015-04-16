package uk.co.ordnancesurvey.ofip.orderfultilment;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,glue = {"uk.co.ordnancesurvey.ofip"},tags= "@QueueProcessor",format = { "pretty","html:target/cucumber", "json:target_json/cucumber.json"}, features = { "src/test/resources/com/packageA" })
public class RunCukesTest {
}
