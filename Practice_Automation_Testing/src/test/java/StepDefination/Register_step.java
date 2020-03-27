package StepDefination;

import Testcases.Register;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_step {
	
	Register reg=new Register();
	@Given("^user launch the browser$")
	public void user_launch_the_browser()  {
	    reg.driver();

	}

	@When("^user opens the url$")
	public void user_opens_the_url() {
	   reg.url();
	}

	@Then("^click my account$")
	public void click_my_account()  {
	  reg.myacc();
	}

	@Then("^fill the details$")
	public void fill_the_details()  {
	   reg.details();
	}

	@Then("^close the browser$")
	public void close_the_browser()  {
	   reg.quit();
	}



}
