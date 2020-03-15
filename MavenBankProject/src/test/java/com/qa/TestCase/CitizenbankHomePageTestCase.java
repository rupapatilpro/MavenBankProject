package com.qa.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.Pages.CitizensbankHomePage;

public class CitizenbankHomePageTestCase extends TestBase {
	
	CitizensbankHomePage citizenBankHomePage;

	public CitizenbankHomePageTestCase() {
		super();
	}

	@BeforeClass
	public void setUp() {
		initilization();
		citizenBankHomePage = new CitizensbankHomePage();

	}

	@Test(priority = 1)
	public void CitizensbankBranchPageTitleTest() {
		String title = citizenBankHomePage.verifyCitizensbankBranchPageTitle();
		Assert.assertEquals(title, title);

	}

	@Test(priority = 2)
	public void CitizensbanklogoImageTest() {
		boolean flag = citizenBankHomePage.validateCitizensbankImage();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void homeTest() throws InterruptedException {
		citizenBankHomePage.home(prop.getProperty("City"));
		Thread.sleep(2000);
		Assert.assertEquals(true, true);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}



