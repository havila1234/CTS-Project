package com.project.demo.stepdefinition.Emailidfooter;

import com.project.demo.pages.BasePage;
import com.project.demo.pages.Emailidfooter_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Emailidfooter_TC extends BasePage {

	Emailidfooter_page Emailid = null;

	@Given("^user launch Web application$")
	public void user_launch_web_application() throws Throwable {
		LaunchApplication();
		OpenWebsite();
	}

	@Then("^get the Email address from footer$")
	public void get_the_email_address_from_footer() throws Throwable {
		Emailid = new Emailidfooter_page(driver);
		Emailid.email();
	}

	@Then("^assert the actual and expected Email addresses$")
	public void assert_the_actual_and_expected_email_addresses() throws Throwable {
		Emailid.assert1();
		driver.close();
	}
}
