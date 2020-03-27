package StepDefination;




import Testcases.Book;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Book_step {
	
	Book b=new Book();

	@Given("^launch the browser$")
	public void launch_the_browser()  {
		b.driver();
	}

	@When("^user opens with correct url$")
	public void user_opens_with_correct_url()  {
	    b.url();
	}

	@Then("^select book and add to basket$")
	public void select_book_and_add_to_basket()  {
	    b.select_book();
	}

	@Then("^select quantity$")
	public void select_quantity() {
	  b.select_quantity();
	}

	@Then("^update the basket$")
	public void update_the_basket()  {
	  b.update_total();
	}

	@Then("^get the total price$")
	public void get_the_total_price()   {
		String total=b.total();
		System.out.println(total);
	}
	
	@Then("^close the Browser$")
	public void close_the_Browser()  {
	   b.quit();
}
}