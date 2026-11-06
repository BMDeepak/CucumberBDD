package stepdef;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDef {

	@Given("should be in login page")
	public void should_be_in_login_page() {
		System.out.println("bg given");
		Assert.assertFalse(true);
	}
	@When("credincials are passed")
	public void credincials_are_passed() {
		System.out.println("bg when");
	}
	@When("press login")
	public void press_login() {
		System.out.println("when bg");
	}
	@Then("should login to homepage")
	public void should_login_to_homepage() {
		System.out.println("bg then");
	}




	@Given("Should be on Home page.")
	public void should_be_on_home_page() {
		System.out.println("given");
	}

	@When("Clicked on profile.")
	public void clicked_on_profile() {
		System.out.println("when");
	}

	@Then("Logout should be shown.")
	public void logout_should_be_shown() {
		System.out.println("Then");
	}

	@Given("should be in Home")
	public void should_be_in_home() {
		System.out.println("given s2");
	}

	@When("moved to dashboard")
	public void moved_to_dashboard() {
		System.out.println("when s2");
	}

	@Then("Dashboard should be shown")
	public void dashboard_should_be_shown() {
		System.out.println("Then");
	}

}
