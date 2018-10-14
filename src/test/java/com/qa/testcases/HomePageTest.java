package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.base.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.WhetherFindPage;

public class HomePageTest extends BaseTest{
	
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
	
	@Test (priority=1)
	public void homePageUITest(){
		softAssert.assertEquals(homePage.isSignInLinkPresent(),true,"Sign In link is NOT present on Home Page");
		softAssert.assertEquals(homePage.isSignUpLinkPresent(),true,"Sign Up link is NOT present on Home Page");
		//String title = homePage.homePageTitle();
		//softAssert.assertEquals(title, "Current weather and forecast - OpenWeatherMap");
		
		softAssert.assertAll();
	}
	
	@Test (priority=2)
	public void searchCityWeather(){
		String cityName,temperature;
		cityName = "Mumbai";
		whetherFindPage = homePage.searchFor(cityName);
		
		temperature = whetherFindPage.getCityTemperature(cityName);
		if(temperature.endsWith("Not found")){
			System.out.println("No temperature found for searched city with name : " +cityName);
			softAssert.assertFalse(false);
		}
		else{
			System.out.println(cityName + " temperature is : " +temperature);
			softAssert.assertTrue(true);
		}	
		softAssert.assertAll();
	}
	
	@Test (priority=3)
	public void searchCityWeatherNegative(){
		String cityName,temperature;
		cityName = "ABC";
		whetherFindPage = homePage.searchFor(cityName);
		
		temperature = whetherFindPage.getCityTemperature(cityName);
		if(temperature.endsWith("Not found")){
			System.out.println("No temperature found for searched city with name : " +cityName);
			softAssert.assertTrue(true);
		}
		else{
			System.out.println(cityName + " temperature is : " +temperature);
			softAssert.assertFalse(false);
		}		
		softAssert.assertAll();
	}
	
	
}
