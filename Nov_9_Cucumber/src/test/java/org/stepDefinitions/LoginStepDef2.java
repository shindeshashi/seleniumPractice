package org.stepDefinitions;

import org.factory.DriverFactory;
import org.pomPages.LoginPage;
import org.utilities.PropertiesUtility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef2 {
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	DriverFactory.getDriver().get(PropertiesUtility.pu.getData("url"));

	}

	@Then("Username field should be displayed")
	public void username_field_should_be_displayed() {
		lp.isUserNameFieldDisplayed();
	}

	@Then("Password field should be displayed")
	public void password_field_should_be_displayed() {
		lp.isPasswordFieldDisplayed();
	}

	@Then("Login button should be displayed")
	public void login_button_should_be_displayed() {
		lp.isLoginBtnFieldDisplayed();
	}

	@When("User enters Username as {string}")
	public void user_enters_username_as(String uName) {
	lp.enterUserName(uName);
}

	@And("User enters password as {string}")
	public void user_enters_password_as(String pwd) {
	lp.enterPassWord(pwd);
}
	@When("User enters Username")
	public void user_enters_username() {
	lp.enterUserName(PropertiesUtility.pu.getData("username"));
}

	@And("User enters password")
	public void user_enters_password() {
	lp.enterPassWord(PropertiesUtility.pu.getData("password"));
	};

	
	@When("User enters login credentials")
	public void user_enters_login_credentials() {
//		lp.enterUserName(uName);
//		lp.enterPassWord(pwd);
	}

	@When("Clicks on the Login button")
	public void clicks_on_the_login_button() {
		lp.clickLoginButton();
	}

	@Then("User should be on login page")
	public void user_should_be_on_login_page() {

	}
}
