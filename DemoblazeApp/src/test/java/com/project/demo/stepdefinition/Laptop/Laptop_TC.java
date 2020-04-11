package com.project.demo.stepdefinition.Laptop;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;

//import org.openqa.selenium.By;

import com.project.demo.pages.BasePage;
import com.project.demo.pages.Laptops_page;

import Utility.Screenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Laptop_TC extends BasePage {
	Laptops_page laptop_page = null;
	Screenshot screenshot = null;
	final static Logger logger = LogManager.getLogger(Laptop_TC.class.getName());

	@Given("^user tap on Laptop$")
	public void user_tap_on_laptop() throws Throwable {
		LaunchApplication();
		OpenWebsite();
		laptop_page = new Laptops_page(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		laptop_page.Laptop();
	}

	@Then("^user will click on desired Laptop$")
	public void user_will_click_on_desired_laptop() throws Throwable {
		logger.info("clicking on desired laptop");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		laptop_page.SelectLaptop();
	}

	@Then("^tap on add to cart$")
	public void tap_on_add_to_cart() throws Throwable {
		Thread.sleep(2000);
		screenshot = new Screenshot(driver);
		screenshot.takeSnapShot("src/test/resources/screenshot/Laptop.png");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		laptop_page.Cart();
		Thread.sleep(1000);
	}

	@Then("^tap Ok on popup$")
	public void tap_ok_on_popup() throws Throwable {
		logger.info("handling window alerts");
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("^the user click on cart page$")
	public void the_user_click_on_cart_page() throws Throwable {
		logger.info("clicking on cart page");
		cart();
		Thread.sleep(2000);
		driver.close();
	}

}
