package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class CitizensbankHomePage extends TestBase {
	
	// 1.Page factory - OR:

	@FindBy(xpath = "//a[contains(@class,'icon_NEW_locator icon_left')]")
	WebElement FindBranch;

	@FindBy(xpath = "//input[@id='autocompleteAddress']")
	WebElement State;

	@FindBy(xpath = "//a[@class='findBranchBtn cta_btn'] ")
	WebElement Find;

	@FindBy(xpath = "//div[@id='Utility_Home']//a//img ")
	WebElement logo;

	@FindBy(xpath = "//button[2]//div[1]//p[1] ")
	WebElement ATM;

	@FindBy(xpath = " //button[1]//div[1]//p[1]")
	WebElement Branches;

	@FindBy(xpath = "//p[contains(text(),'Voice Assisted ATMs')] ")
	WebElement VoiceAssistedATMs;

	@FindBy(xpath = "//div[@id='SU560156']//a[@class='text_cta icon_arrow_down icon_right columns small-12'][contains(text(),'See Details')]  ")
	WebElement SeeDetails;

	// 2. initilization the page object :

	public CitizensbankHomePage() {
		PageFactory.initElements(driver, this);

}

	// 3.Action :
	public String verifyCitizensbankBranchPageTitle() {
		return driver.getTitle();

	}

	public boolean validateCitizensbankImage() {
			return logo.isDisplayed();
		}
	
	public BranchPage home(String City) {
		
		FindBranch.click();

		State.sendKeys(City);

		ATM.click();

		Branches.click();

		VoiceAssistedATMs.click();

		Find.click();

		return new BranchPage();
	}
	
}
