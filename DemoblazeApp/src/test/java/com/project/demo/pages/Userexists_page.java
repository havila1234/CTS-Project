package com.project.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userexists_page {
	@FindBy(xpath = "//a[@id='signin2']")
	WebElement SignupElement;
	@FindBy(xpath = "//input[@id='sign-username']")
	WebElement UsernameElement;
	@FindBy(xpath = "//input[@id='sign-password']")
	WebElement PasswordElement;
	@FindBy(xpath = "//button[contains(text(),'Sign up')]")
	WebElement SignupbtnElement;
	@FindBy(xpath = "//div[@id='signInModal']//button[@class='btn btn-secondary'][contains(text(),'Close')]")
	WebElement CloseElement;

	public Userexists_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//Method to click on SignUp link
	public void Signup() {
		SignupElement.click();
	}

//Method to enter the username 	
	public void Username(String username) {
		UsernameElement.sendKeys(username);
	}

//Method to enter the password
	public void Password(String password) {
		PasswordElement.sendKeys(password);
	}

//Method to click on SignUp button
	public void Signupbtnclick() {
		SignupbtnElement.click();
	}

//Method to close the driver
	public void Close() {
		CloseElement.click();
	}

}
