package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class CitizenbankSearchPage extends TestBase {

	// 1. Page Factory OR :-

	@FindBy(xpath = "//a[@class='icon_search2 icon_left medium-3 columns show-for-medium-up search_link'] ")
	WebElement Search;

	@FindBy(xpath = "//input[@id='searchterm']")
	WebElement searchDescription;

	@FindBy(xpath = "//button[@class='icon_search icon_left button postfix right'] ")
	WebElement submitbutton;
	
	@FindBy(xpath = "//div[@id='Utility_Home']//a//img ")
	WebElement logo;

	// 2. initilization the page object :

	public CitizenbankSearchPage() {
		PageFactory.initElements(driver, this);
	}

	// 3. Actions:

	public String verifyCitizenbankSearchPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCitizenbankimageTest() {
		return logo.isDisplayed();
	}

	public MortgagePage search(String Description) {
		
		Search.click();
		
		searchDescription.sendKeys(Description);
		
		submitbutton.click();
		
		return new MortgagePage();
		
		
	}

}
