package com.qa.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.Pages.AdvancedPage;
import com.qa.Pages.LocationsPage;

public class LocationsPageTestCase extends TestBase {

	LocationsPage locationsPage;
	AdvancedPage advancedPage;

	public LocationsPageTestCase() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initilization();
		
		locationsPage =	new LocationsPage();
		advancedPage=  new AdvancedPage();
	}
		
	@Test(priority = 1)
	public void locationsTest() throws InterruptedException {
		locationsPage.Locations(prop.getProperty("ZIP"));
		Thread.sleep(5000);
		Assert.assertTrue(true);
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		
	

	
	}





