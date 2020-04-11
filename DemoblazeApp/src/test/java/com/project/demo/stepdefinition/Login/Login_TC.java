package com.project.demo.stepdefinition.Login;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.project.demo.pages.BasePage;
import com.project.demo.pages.Demoblaze_LoginPage;
import com.project.demo.pages.Demoblaze_LogoutPage;

import Utility.Screenshot;
import Utility.Datadriven;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_TC extends BasePage {
	Demoblaze_LoginPage mylogin = null;
	Screenshot screenshot = null;
	Datadriven excel = new Datadriven();
	Demoblaze_LogoutPage mylogout = null;
	final static Logger logger = LogManager.getLogger(Login_TC.class.getName());

	@Given("^Launch web browser$")
	public void launch_web_browser() throws Throwable {
		logger.info("Opening the chrome browser");
		LaunchApplication();
	}

	@When("^user open the demoblaze homepage$")
	public void user_open_the_demoblaze_homepage() throws Throwable {
		logger.info("Opening the demoblaze application");
		OpenWebsite();
	}

	@And("^click on the login button popup window appears$")
	public void click_on_the_login_button_popup_window_appears() throws Throwable {
		logger.info("popup window appears");
		mylogin = new Demoblaze_LoginPage(driver);
		mylogin.Login();
	}

	@And("^user enter the username$")
	public void user_enter_the_username() throws Throwable {
		logger.info("filling up username");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mylogin.SetUserName(excel.excel_username(0));
		Thread.sleep(1000);
	}

	@And("^user enter the passsword$")
	public void user_enter_the_passsword() throws Throwable {
		logger.info("filling up password");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mylogin.SetPassword(excel.excel_password(0));
	}

	@Then("^user click on Login button to go to homePage$")
	public void user_click_on_login_button_to_go_to_homepage() throws Throwable {
		logger.info("clicking on login button");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mylogin.LoginBtnClick();
		Thread.sleep(3000);
		screenshot = new Screenshot(driver);
		screenshot.takeSnapShot("src/test/resources/screenshot/Login.png");
		mylogout = new Demoblaze_LogoutPage(driver);
		mylogout.Logout();
		Thread.sleep(3000);
		screenshot = new Screenshot(driver);
		screenshot.takeSnapShot("src/test/resources/screenshot/Logout.png");
		driver.close();
	}

}
