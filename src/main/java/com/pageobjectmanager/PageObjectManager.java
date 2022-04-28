package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.LoginPage;
import com.adactin.pom.SearchPage;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public static LoginPage getLoginPage() {
		LoginPage lp = new LoginPage(driver);
		return lp;
			
//	public static void getSearchPage() {
//		SearchPage sp = new SearchPage(driver);
//		return sp;
		
//	}
		
	}
}
