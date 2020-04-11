package com.project.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchaseproduct_page {

	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement PlaceorderElement;
	@FindBy(xpath = "//input[@id='name']")
	WebElement NameElement;
	@FindBy(xpath = "//input[@id='country']")
	WebElement CountryElement;
	@FindBy(xpath = "//input[@id='city']")
	WebElement CityElement;
	@FindBy(xpath = "//input[@id='card']")
	WebElement CardElement;
	@FindBy(xpath = "//input[@id='month']")
	WebElement MonthElement;
	@FindBy(xpath = "//input[@id='year']")
	WebElement yearElement;
	@FindBy(xpath = "//button[contains(text(),'Purchase')]")
	WebElement PurchaseElement;
	@FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
	WebElement OkbtnElement;

	public Purchaseproduct_page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

//Method to click on place order
	public void Placeorder() {
		PlaceorderElement.click();
	}

//Method to enter the name in name field
	public void Name(String name) {
		NameElement.sendKeys(name);

	}

//Method to enter the country name in country field
	public void Country(String country) {
		CountryElement.sendKeys(country);
	}

//Method to enter city name in city field
	public void City(String city) {
		CityElement.sendKeys(city);
	}

//Method to enter the card number in card field
	public void Card(String card) {
		CardElement.sendKeys(card);
	}

//Method to enter the month code in month field
	public void Month(String month) {
		MonthElement.sendKeys(month);
	}

//Method to enter the year 
	public void Year(String year) {
		yearElement.sendKeys(year);
	}

//Method to click on the purchase button
	public void Purchase() {
		PurchaseElement.click();
	}

//Method to click on the OK button
	public void ok() {
		OkbtnElement.click();
	}
}
