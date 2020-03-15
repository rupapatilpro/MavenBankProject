package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBase {
	
	public static WebDriver driver;

	public static Properties prop;
	
	public TestBase() {

		try {
		prop = new Properties();

		FileInputStream ip;

			ip = new FileInputStream(
					"C:\\Users\\rupap\\eclipse-workspace\\MavenBankProject\\src\\main\\java\\com\\qa\\Config\\Config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	public static void initilization() {
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\rupap\\eclipse-workspace\\MavenBankProject\\Browser\\BrowserExe\\chromedriver.exe");
			driver = new ChromeDriver();

		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\rupap\\eclipse-workspace\\MavenBankProject\\Browser\\BrowserExe\\geckodriver.exe");
			driver = new FirefoxDriver();
		}




		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Config.properties - url = https://www.iberiabank.com/about-us/locations/?q=

		// driver.get(prop.getProperty("url"));

		// Config.properties - qaurl = https://www.citizensbank.com/HomePage.aspx

		driver.get(prop.getProperty("qaurl"));

	}

}



