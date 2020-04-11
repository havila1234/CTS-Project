package com.project.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoblaze_LoginPage {

	@FindBy(linkText = "Log in")
	WebElement mylogin;
	@FindBy(id = "loginusername")
	WebElement usernameElement;
	@FindBy(id = "loginpassword")
	WebElement passwordElement;
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement loginBtnElement;

	public Demoblaze_LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

// Method to click on login link
	public void Login() {
		mylogin.click();
	}

//Method to enter the username 
	public void SetUserName(String username) {
		usernameElement.sendKeys(username);

	}

//Method to enter the password
	public void SetPassword(String password) {
		passwordElement.sendKeys(password);

	}

//Method to click on login button
	public void LoginBtnClick() throws InterruptedException {
		loginBtnElement.click();

	}

}
