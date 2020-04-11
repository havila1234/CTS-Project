package com.project.demo.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Testcase.feature", glue = { "com.project.demo.stepdefinition" },
/*tags = {"@TC01_Demoblaze","@TC02_De0moblaze","@TC03_Demoblaze","@TC04_Demoblaze","@TC05_Demoblaze","@TC06_Demoblaze","@TC07_Demoblaze","@TC08_Demoblaze"},*/
		plugin = { "pretty","html:reports/cucumber-html-report", "json:reports/cucumber-html-report/jsonreport",
				"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html" }, monochrome = true)
public class Allatonego {

	@AfterClass
	public static void extendReports() {
		Reporter.loadXMLConfig("src\\test\\resources\\Testdata\\extent_reports.xml");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}

}
