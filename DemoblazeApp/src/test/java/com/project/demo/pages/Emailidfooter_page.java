package com.project.demo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Emailidfooter_page {

	@FindBy(xpath = "//p[contains(text(),'Email: demo@blazemeter.com')]")
	WebElement string;
	String text;

	public Emailidfooter_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//Method to get the Email text
	public void email() throws InterruptedException {
		Thread.sleep(4000);
		text = string.getText();
	}

//Method to assert the actual and expected Email id		
	public void assert1() throws InterruptedException {
		Assert.assertEquals("Email: demo@blazemeter.com", text);
		System.out.println("expected emailId and actual emailId is matched");

	}

}
