package com.project.demo.stepdefinition.Itemscount;

import com.project.demo.pages.BasePage;
import com.project.demo.pages.Itemscount_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Itemscount_TC extends BasePage {

	Itemscount_page itemcount = null;

	@Given("^user launch demoblaze application$")
	public void user_launch_demoblaze_application() throws Throwable {
		LaunchApplication();
		OpenWebsite();
	}

	@Then("^user check the number of products in a webpage$")
	public void user_check_the_number_of_products_in_a_webpage() throws Throwable {
		itemcount = new Itemscount_page(driver);
		itemcount.product();
	}

	@Then("^print the number of products in a webpage$")
	public void print_the_number_of_products_in_a_webpage() throws Throwable {
		itemcount.count();
		driver.close();
	}

}
