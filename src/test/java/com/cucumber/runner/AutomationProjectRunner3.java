package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.baseclass.BaseclassMaven;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\java\\com\\AutomationProject3\\cucumber\\feature",glue = 
					"com.AutomationProject3.cucumber.Stepdefinition3",dryRun =false,strict = true,monochrome = true)


public class AutomationProjectRunner3 {
public static WebDriver driver;
@BeforeClass
public static void driverinitialization() {
	driver=BaseclassMaven.browserlaunch("chrome");
	
	}

@AfterClass
public static void teardown() {
	
	
}

}
