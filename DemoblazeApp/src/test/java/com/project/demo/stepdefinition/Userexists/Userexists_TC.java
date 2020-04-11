package com.project.demo.stepdefinition.Userexists;

import org.openqa.selenium.Alert;

import com.project.demo.pages.BasePage;
import com.project.demo.pages.Userexists_page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class Userexists_TC extends BasePage {
	Userexists_page userexists = null;

	@Given("^User launch browser$")
	public void user_launch_browser() throws Throwable {

		LaunchApplication();
	}

	@When("^user opens homepage$")
	public void user_opens_homepage() throws Throwable {

		OpenWebsite();
	}

	@And("^click on the signup button popup window appears$")
	public void click_on_the_signup_button_popup_window_appears() throws Throwable {

		userexists = new Userexists_page(driver);
		userexists.Signup();
		Thread.sleep(4000);
	}

	@And("^enter the  (.+)$")
	public void enter_the(String username) throws Throwable {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userexists.Username(username);
	}

	@And("^user fill up the (.+)$")
	public void user_fill_up_the(String password) throws Throwable {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userexists.Password(password);
	}

	@Then("^user click on signup button$")
	public void user_click_on_signup_button() throws Throwable {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userexists.Signupbtnclick();
		Thread.sleep(3000);
	}

	@Then("^click OK on alert message$")
	public void click_ok_on_alert_message() throws Throwable {

		Alert confirmation = driver.switchTo().alert();
		String alerttext = confirmation.getText();
		System.out.println(alerttext);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		userexists.Close();
		Assert.assertEquals("This user already exist.", alerttext);
		driver.close();
	}

}
