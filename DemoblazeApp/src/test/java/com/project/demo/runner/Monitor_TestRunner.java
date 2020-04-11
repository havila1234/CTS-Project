package com.project.demo.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
				 glue = {"com.project.demo.stepdefinition.Monitor"},
				 tags = {"@TC03_Demoblaze"},
				 plugin = {"pretty","html:target/cucumber" },
				 monochrome=true
)
public class Monitor_TestRunner {

}
