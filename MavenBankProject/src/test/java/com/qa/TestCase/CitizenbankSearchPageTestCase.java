package com.qa.TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.Pages.CitizenbankSearchPage;

public class CitizenbankSearchPageTestCase extends TestBase {

	CitizenbankSearchPage citizenBankSearchPage;

	public CitizenbankSearchPageTestCase() {
		super();
	}
	
	@BeforeClass
	public void setUp() {
		initilization();
		citizenBankSearchPage = new CitizenbankSearchPage();
			
		}

	@Test(priority = 1)
	public void CitizenbankSearchPageTitleTest() {
		String title = citizenBankSearchPage.verifyCitizenbankSearchPageTitle();
	}

	@Test(priority = 2)
	public void CitizenbankimageTest() {
		boolean flag = citizenBankSearchPage.validateCitizenbankimageTest();
	}

	@Test(priority = 3)
	public void SearchTest() throws InterruptedException {
		citizenBankSearchPage.search(prop.getProperty("Description"));
		Thread.sleep(2000);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
