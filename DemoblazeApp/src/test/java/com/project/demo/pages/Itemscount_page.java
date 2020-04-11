package com.project.demo.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itemscount_page {

	int count;

	@FindBy(xpath = "//a[@class='hrefch']")
	List<WebElement> itemlist;

	public Itemscount_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//Method to list the number of products in a webpage
	public void product() {

		count = itemlist.size();

	}

//Method to print the number of products in a webpage
	public void count() throws InterruptedException {

		System.out.println("The number of products in a page  " + count);

	}

}
