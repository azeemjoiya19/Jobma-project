package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.TestBase;

public class Login extends TestBase {
	
//public static WebDriver driver;

	
public static final By emaidId=By.xpath("//*[@id=\"jobma_user_name\"]");
	
public static final By password =By.xpath("//*[@id=\"password\"]");
	
public static final By LoginButton=By.xpath("//*[@id=\"submitBtn\"]/span[1]");
	
//public static final By ForgotPwdlink=By.xpath("//*[@id=\"loginForm\"]/div[5]/a");

public Login(WebDriver driver) {
	
	this.driver=driver;
	
	
}

public void user_enters_username_and_password() throws InterruptedException {
	
	driver.findElement(emaidId).sendKeys(TestBase.prop.getProperty("username"));
	
	Thread.sleep(3000);
	
	driver.findElement(password).sendKeys(TestBase.prop.getProperty("password"));
	Thread.sleep(3000);
	
	}

 public void user_click_the_login_button() {
	 
	 driver.findElement(LoginButton).click();
 }

}
