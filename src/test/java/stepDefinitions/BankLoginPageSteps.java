package stepDefinitions;

import baseUtil.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.LandingPage_PF;

public class BankLoginPageSteps extends BaseClass {

	LandingPage_PF login;

	public BankLoginPageSteps() {
		super();
	}

	
//	@Before (order = 0)
//	public void setUp() {
//		initialization();
//	}
//
//	@After (order = 0)
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//	}

	@Given("user opens parabank link")
	public void user_opens_parabank_link() {

		System.out.println("Page opened");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_qa006_and_parabank006(String username, String password) {

		login = new LandingPage_PF();
		login.enterUsername(username);
		login.enterPassword(password);
	}

	@And("click login button")
	public void click_login_button() {

		login.clickLogin();

	}

	@Then("user is logged in successfully")
	public void user_is_logged_in_successfully() {

		System.out.println("logged in success");

	}
}
