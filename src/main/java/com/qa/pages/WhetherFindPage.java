package com.qa.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;

public class WhetherFindPage extends BaseTest{

	//@FindBy(xpath="//a[contains(text(),'Mumbai')]") WebElement cityLabel;
	
	@FindBy(xpath="//span[@class='badge badge-info']") WebElement cityTemperature;
	
	@FindBy(xpath="//div[@class='alert alert-warning']")WebElement alertMessage;
	
	 

	//Initializing the page objects
	public WhetherFindPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean isCityNameExist(String cityName){
		String pre = "//a[contains(text(),'";
		String post = "')]";
				
		String xpathValue= pre + cityName + post;							//cityLabel found dynamically at run time
		try{
			return driver.findElement(By.xpath(xpathValue)).isDisplayed();
		}catch(Exception e){                           //NoSuchElementException  didn't work
			return false;
		}
	}
	
	public String getCityTemperature(String cityName) {
		if (isCityNameExist(cityName))
			return cityTemperature.getText();			// City's temperature returned
		else
			return alertMessage.getText();				//"Not found" text returned	in case city not found
    }
}
