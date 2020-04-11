package com.project.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Phones_page {

	WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Phones')]")
	WebElement PhoneElement;
	@FindBy(xpath = "//a[contains(text(),'Iphone 6 32gb')]")
	WebElement SelectedPhone;
	@FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
	WebElement cart;

	public Phones_page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

//Method to click on the  phone link
	public void Phone() {

		PhoneElement.click();
	}

//Method to select the desired phone
	public void SelectPhone() {

		SelectedPhone.click();
	}

//Method to click on add to cart
	public void Cart() {

		cart.click();
	}

}
