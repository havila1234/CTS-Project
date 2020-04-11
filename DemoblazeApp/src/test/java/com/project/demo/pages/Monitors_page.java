
package com.project.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Monitors_page {

	WebDriver driver;
	@FindBy(xpath = "//a[contains(text(),'Monitors')]")
	WebElement MonitorElement;
	@FindBy(xpath = "//a[contains(text(),'ASUS Full HD')]")
	WebElement SelectedMonitor;
	@FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
	WebElement cart;

	public Monitors_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//Method to click on the monitor link
	public void Monitor() {
		MonitorElement.click();
	}

//Method to select the desired monitor

	public void SelectMonitor() {
		SelectedMonitor.click();
	}

//Method to click on add to cart	
	public void Cart() {
		cart.click();
	}

}
