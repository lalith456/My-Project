package StepDefination;

import Testcases.Demosite;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demosite_step {
	
	Demosite a=new Demosite();
	@Given("^user launches the chrome Application$")
	public void user_launches_the_chrome_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    a.start();
	}

	@When("^user opens the AutomationPractice Homepage$")
	public void user_opens_the_AutomationPractice_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    a.launch_Application();
	}

	@Then("^user clicks on the demosite and fill all necessary details$")
	public void user_clicks_on_the_demosite_and_fill_all_necessary_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   a.Details_filling();
	}

	@Then("^Clicks on the refresh button$")
	public void clicks_on_the_refresh_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    a.submit();
	}
}
