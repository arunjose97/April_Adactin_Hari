package com.adactin.runner;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.AdactinBase.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Hotelbookingfeature.feature",
					glue = "src\\test\\java\\com\\adactin\\stepdefinition")

public class Test_Runner {
	public static WebDriver driver;

	@Before
	public void setUp() {
		driver = Base_Class.browserLaunch("chrome");
	}
	
	@After
	public void tearDown() {
		driver.close();

	}
}
