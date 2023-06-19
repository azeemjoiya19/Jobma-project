package com.qa.steps;

import com.qa.pages.Login;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends TestBase {

	// static WebDriver driver;

	Login login = new Login(driver);

	@Given("User is on Login Page")
	public void user_is_on_login_page() throws InterruptedException {

		TestBase.intialize();
		// driver.get(TestBase.prop.getProperty("url"));

	}

	@When("User enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {

		Thread.sleep(3000);

		login.user_enters_username_and_password();

	}

	@When("User click the login button")
	public void user_click_the_login_button() {

		login.user_click_the_login_button();

	}

	@Then("User are successfully logged in Dashboard")
	public void user_are_successfully_logged_in_dashboard() {

	}
	
	

}
