package com.project.demo.stepdefinition.Purchaseproduct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;

import com.project.demo.pages.BasePage;
import com.project.demo.pages.Demoblaze_LoginPage;
import com.project.demo.pages.Demoblaze_LogoutPage;
import com.project.demo.pages.Laptops_page;
import com.project.demo.pages.Monitors_page;
import com.project.demo.pages.Phones_page;
import com.project.demo.pages.Purchaseproduct_page;

import Utility.Screenshot;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Purchaseproduct_TC extends BasePage {
	Demoblaze_LoginPage mylogin = null;
	Laptops_page laptop_page = null;
	Monitors_page monitor_page = null;
	Phones_page phone_page = null;
	Purchaseproduct_page purchaseproduct_page = null;
	Demoblaze_LogoutPage mylogout = null;
	Screenshot screenshot = null;

	@Given("^User launch the chrome browser$")
	public void user_launch_the_chrome_browser() throws Throwable {

		LaunchApplication();
	}

	@When("^user open  demoblaze homepage$")
	public void user_open_demoblaze_homepage() throws Throwable {

		OpenWebsite();
	}

	@And("^click  login button popup window appears$")
	public void click_login_button_popup_window_appears() throws Throwable {

		mylogin = new Demoblaze_LoginPage(driver);
		mylogin.Login();
		Thread.sleep(2000);
	}

	@And("^user fill up  (.+)$")
	public void user_fill_up(String username) throws Throwable {

		mylogin.SetUserName(username);
		Thread.sleep(2000);
	}

	@And("^user fills up the (.+)$")
	public void user_fills_up_the(String password) throws Throwable {

		mylogin.SetPassword(password);
		Thread.sleep(2000);
	}

	@Then("^select Login button$")
	public void select_login_button() throws Throwable {

		mylogin.LoginBtnClick();
	}

	@Then("^click on Laptop link$")
	public void click_on_laptop_link() throws Throwable {

		laptop_page = new Laptops_page(driver);
		Thread.sleep(3000);
		laptop_page.Laptop();
	}

	@And("^user choose desired Laptop$")
	public void user_choose_desired_laptop() throws Throwable {

		laptop_page.SelectLaptop();
		Thread.sleep(2000);
	}

	@Then("^user select add to cart option$")
	public void user_select_add_to_cart_option() throws Throwable {

		laptop_page.Cart();
		Thread.sleep(2000);
	}

	@And("^person  need to handle the alert$")
	public void person_need_to_handle_the_alert() throws Throwable {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("^tap on cart link$")
	public void tap_on_cart_link() throws Throwable {
		cart();
		Thread.sleep(2000);
	}

	@Then("^click home button to go homePage$")
	public void click_home_button_to_go_homepage() throws Throwable {
		home();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@And("^user on pc link$")
	public void user_on_pc_link() throws Throwable {

		monitor_page = new Monitors_page(driver);
		Thread.sleep(3000);
		monitor_page.Monitor();
	}

	@Then("^user has to choose desired option$")
	public void user_has_to_choose_desired_option() throws Throwable {

		monitor_page.SelectMonitor();
		Thread.sleep(2000);
	}

	@Then("^choose add to cart$")
	public void choose_add_to_cart() throws Throwable {

		monitor_page.Cart();
		Thread.sleep(2000);
	}

	@Then("^popup message should be handle$")
	public void popup_message_should_be_handle() throws Throwable {

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("^tap the cart button$")
	public void tap_the_cart_button() throws Throwable {

		cart();
		Thread.sleep(2000);
	}

	@And("^again go to homePage$")
	public void again_go_to_homepage() throws Throwable {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		home();
	}

	@Then("^click on phone link$")
	public void click_on_phone_link() throws Throwable {

		phone_page = new Phones_page(driver);
		Thread.sleep(3000);
		phone_page.Phone();
	}

	@Then("^user clicks on a desired phone$")
	public void user_clicks_on_a_desired_phone() throws Throwable {

		phone_page.SelectPhone();
		Thread.sleep(2000);
	}

	@And("^add the phone to cart$")
	public void add_the_phone_to_cart() throws Throwable {

		phone_page.Cart();
		Thread.sleep(2000);
	}

	@Then("^handle alert message$")
	public void handle_alert_message() throws Throwable {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("^go to cart page$")
	public void go_to_cart_page() throws Throwable {
		cart();
		Thread.sleep(2000);
	}

	@Then("^user click on purchase with credentials(.+) (.+) (.+) (.+) (.+) (.+)$")
	public void user_click_on_purchase_with_credentials(String name, String country, String city, String card,
			String month, String year) throws Throwable {

		System.out.println("in Purchase product page ");
		purchaseproduct_page = new Purchaseproduct_page(driver);
		System.out.println("page object got created");
		purchaseproduct_page.Placeorder();
		Thread.sleep(3000);
		purchaseproduct_page.Name(name);
		purchaseproduct_page.Country(country);
		purchaseproduct_page.City(city);
		purchaseproduct_page.Card(card);
		purchaseproduct_page.Month(month);
		purchaseproduct_page.Year(year);
		purchaseproduct_page.Purchase();
		System.out.println("values added successfully");
		Thread.sleep(2000);
	}

	@And("^tap the accept button$")
	public void tap_the_accept_button() throws Throwable {
		screenshot = new Screenshot(driver);
		screenshot.takeSnapShot("src/test/resources/screenshot/Purchaseproduct.png");
		purchaseproduct_page.ok();
	}

	@Then("^logout the website$")
	public void logout_the_website() throws Throwable {
		mylogout = new Demoblaze_LogoutPage(driver);
		mylogout.Logout();
		Thread.sleep(1000);
		driver.close();
	}

}
