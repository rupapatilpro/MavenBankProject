package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class LocationsPage extends TestBase {

	// 1.Page factory - OR:

	@FindBy(xpath = "//input[@id='q']")
	WebElement Enter;

	@FindBy(xpath = "//button[@class='cta-button search-submit yellow'] ")
	WebElement FindaBranch;


//2. initilization the page object :

	public LocationsPage() {
		PageFactory.initElements(driver, this);

	}

	// 3.Action :
	public String verifyLocationsPageTitle() {
		return driver.getTitle();

	}

	public AdvancedPage Locations(String ZIP) {

		Enter.sendKeys(ZIP);

		FindaBranch.click();

		return new AdvancedPage();

	}

}
