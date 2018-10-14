package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseTest;

public class HomePage extends BaseTest {

	WhetherFindPage whetherFindPage;
	
	//Page factory (OR)
	@FindBy(xpath="//input[@id='q'][@placeholder='Your city name']") WebElement searchBox;
	@FindBy(xpath="//button[@type='submit'][contains(text(),'Search')]") WebElement searchButton;
	@FindBy(xpath="//a[contains(text(),' Sign In')][@class='pull-right']") WebElement signInLink;
	@FindBy(xpath="//a[contains(text(),' Sign Up')][@class='pull-right']") WebElement signUpLink;
	
	
	//Initializing the page objects
	public HomePage(){
		//PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, this);
		whetherFindPage = new WhetherFindPage();
	}
	
	
	public String homePageTitle() {
        return driver.getTitle();
    }
	
	public boolean isSignInLinkPresent() {
        return signInLink.isDisplayed();
    }
	
	public boolean isSignUpLinkPresent() {
        return signUpLink.isDisplayed();
    }
	
	// Enter city name and find weather of that city
	public WhetherFindPage searchFor(String cityName) {
        searchBox.sendKeys(cityName);
        searchButton.submit();
        return new WhetherFindPage();
    }
}