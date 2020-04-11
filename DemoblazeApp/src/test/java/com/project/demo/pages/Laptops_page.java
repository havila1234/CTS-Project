package com.project.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Laptops_page {

	WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Laptops')]")
	WebElement LaptopElement;
	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	WebElement Selectedlaptop;
	@FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
	WebElement cart;

	public Laptops_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//Method to click on  laptop link	
	public void Laptop() {
		LaptopElement.click();
	}

//Method to select the desired laptop	
	public void SelectLaptop() {
		Selectedlaptop.click();
	}

//Method to click on add to cart
	public void Cart() throws InterruptedException {
		Thread.sleep(1000);
		cart.click();
	}

}
