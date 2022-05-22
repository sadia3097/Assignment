package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features="src/test/java/features",
    glue={"stepDefinition","hooks"},
    dryRun = false,
	plugin = {"pretty","html:reports/htmlreport"})

	public class TestRunner {	

}
