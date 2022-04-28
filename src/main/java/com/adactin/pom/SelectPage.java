package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage {

	public static WebDriver driver;
	
	public SelectPage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	private WebElement radioButton;
	@FindBy(id = "continue")
	private WebElement selContinue;
	
	
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getSelContinue() {
		return selContinue;
	}
}
