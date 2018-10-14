package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.WhetherFindPage;

public class WhetherFindTest extends BaseTest{
	HomePage homePage;
	WhetherFindPage whetherFindPage;
	SoftAssert softAssert;
	
	@BeforeMethod
	public void setup(){
		InitializationSetup();
		homePage = new HomePage();
		whetherFindPage = new WhetherFindPage();
		softAssert = new SoftAssert();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
}
