package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.selenium.baseclass.BaseclassMaven;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\feature\\",glue = "com.cucumber.stepdefinition")

public class TestRunner {
public static WebDriver driver;

@BeforeClass
public static void setup() {
	driver =BaseclassMaven.browserlaunch("chrome");
}

@AfterClass
public static void tearDown() {
	//driver.quit();
}
}
