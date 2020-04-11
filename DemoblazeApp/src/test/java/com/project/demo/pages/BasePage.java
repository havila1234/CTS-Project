package com.project.demo.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

	protected WebDriver driver;
	String Browser = "Chrome";

// To launch Chrome browser
	public void LaunchApplication() {
		if (Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		}
		if (Browser.equals("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}

	}

// Method to Launch Demo_Blaze Web application
	public void OpenWebsite() {

		driver.get("https://www.demoblaze.com/");
	}

// Method to click on  cart link
	public void cart() {

		driver.findElement(By.xpath("//a[@id='cartur']")).click();
	}

// Method to click on  Homepage link
	public void home() {

		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	}

// Method to close the browser
	public void quit() {

		driver.close();
	}
}
