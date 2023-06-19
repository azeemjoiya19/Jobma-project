package com.qa.util;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class TestBase {

	static String projectpath = System.getProperty("user.dir");

	public static WebDriver driver;

	public static Properties prop;

	public TestBase() {

		try {

			prop = new Properties();
			FileInputStream fis = new FileInputStream(projectpath + "/src/test/resources/config/config.properties");

			prop.load(fis);
		} catch (Exception e) {
			
			e.getMessage();

		}
		
		
	}
	
	public static void intialize() throws InterruptedException {
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("browser")) {
			
			WebDriverManager.edgedriver().setup();
			
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
		
	}
	
	public static void closeBrowser() {
		
		driver.close();
	}
  
	

}
