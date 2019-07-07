package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.baseclass.BaseclassMaven;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\test2\\feature",glue = 
	"com.cucumber.test2.stepdefinition" ,dryRun =false,strict = true,monochrome = true)
	
	public class MouseHoverTestRunner {
		public static WebDriver driver;
	
		
		
		@BeforeClass
	
		public static void driverlaunch() {
			driver=BaseclassMaven.browserlaunch("chrome");
			

		}
	
	@AfterClass
	public static void driverclose() {
		//driver.quit();
		

	}
	

}
