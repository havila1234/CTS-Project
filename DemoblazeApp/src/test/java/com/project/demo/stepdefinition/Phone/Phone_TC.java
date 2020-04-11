package com.project.demo.stepdefinition.Phone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

import com.project.demo.pages.BasePage;

import com.project.demo.pages.Phones_page;

import Utility.Screenshot;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Phone_TC extends BasePage {
	Phones_page phone_page = null;
	Screenshot screenshot = null;

	@Given("^user click on Phone$")
	public void user_click_on_Phone() throws Throwable {
		LaunchApplication();
		OpenWebsite();
		phone_page = new Phones_page(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		phone_page.Phone();
	}

	@And("^select the desired phone$")
	public void select_the_desired_phone() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		phone_page.SelectPhone();
	}

	@Then("^select add to cart button$")
	public void select_add_to_cart_button() throws Throwable {
		Thread.sleep(1000);
		screenshot = new Screenshot(driver);
		screenshot.takeSnapShot("src/test/resources/screenshot/Phone.png");
		phone_page.Cart();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@And("^handle the window alerts$")
	public void handle_the_window_alerts() throws Throwable {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("^person tap cart page$")
	public void person_tap_cart_page() throws Throwable {
		cart();
		Thread.sleep(2000);
		driver.close();
	}

}
