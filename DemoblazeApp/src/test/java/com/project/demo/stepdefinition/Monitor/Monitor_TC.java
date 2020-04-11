package com.project.demo.stepdefinition.Monitor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

import com.project.demo.pages.BasePage;
import com.project.demo.pages.Monitors_page;

import Utility.Screenshot;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Monitor_TC extends BasePage {
	Monitors_page monitor_page = null;
	Screenshot screenshot = null;

	@Given("^person  click on Monitor$")
	public void person_click_on_monitor() throws Throwable {
		LaunchApplication();
		OpenWebsite();
		monitor_page = new Monitors_page(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		monitor_page.Monitor();
	}

	@Then("^user click on desired Monitor$")
	public void user_click_on_desired_monitor() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		monitor_page.SelectMonitor();
	}

	@Then("^user tap add to cart$")
	public void user_tap_add_to_cart() throws Throwable {
		Thread.sleep(2000);
		screenshot = new Screenshot(driver);
		screenshot.takeSnapShot("src/test/resources/screenshot/Monitor.png");
		monitor_page.Cart();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@And("^click OK in message$")
	public void click_ok_in_message() throws Throwable {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("^click on cart$")
	public void click_on_cart() throws Throwable {
		cart();
		Thread.sleep(2000);
		driver.close();
	}
}
