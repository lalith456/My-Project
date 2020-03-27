package Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Feature\\practice.feature",
		plugin = {"pretty", "html:reports/cucumber-html-reports","json:reports/cucumber-json-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		tags = {"@TS01,@TS02,@TS03"},
		glue = {"StepDefinition"},
		monochrome = true
		)

public class runner_file {
	
	@AfterClass
	  public static void extendReport() 
	{
	      Reporter.loadXMLConfig("src\\test\\resources\\extent-config.xml");
	      Reporter.setSystemInfo("user", System.getProperty("user.name"));
	      Reporter.setSystemInfo("os", "Windows");
	      Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}


