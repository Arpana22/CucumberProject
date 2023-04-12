package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is at login screen")
	public void precondition() {
		System.out.println("This is my given statement");
	}
	@When("User enters username")
	public void enterUsername() {
		System.out.println("When statement for entering username");
	}
	@When("User enters password")
	public void enterPassword() {
		System.out.println("When statement for entering password");
	}
	@When("User clicks on login button")
	public void clickOnLoginButton() {
		System.out.println("When statement for clicking on login button");
	}
	@Then("User should get redirected to home page")
	public void validateOnHomePage() {
		System.out.println("Then statement for home page");
	}
}
