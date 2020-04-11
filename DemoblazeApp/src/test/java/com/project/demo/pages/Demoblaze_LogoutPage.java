package com.project.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoblaze_LogoutPage {

	@FindBy(xpath = "//a[@id='logout2']")
	WebElement logoutbtn;

	public Demoblaze_LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//Method to click on logout link
	public void Logout() throws InterruptedException {
		Thread.sleep(2000);
		logoutbtn.click();
	}
}
