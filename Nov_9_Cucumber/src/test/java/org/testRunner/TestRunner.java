package org.testRunner;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/org/features/Login.feature",
	glue={"src/test/java/org/stepDefinitions","org/applicationHooks"},
	monochrome=true,	//to clear console
	dryRun=false,    //to check linking between step definitions & feature Files
//	tags="smoke",
	//how report generate
	plugin= {"pretty",
			"html:target/html_report/html_report.html",
			"json:target/json_report/json_report.json",
			"junit:target/junit_report/junit_report.xml",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	}
)
public class TestRunner extends AbstractTestNGCucumberTests  {
	
	

}
//Login.feature