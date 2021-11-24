package newpackage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LogintestClass {
	public static String msg;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/shirleyaddo/Software/chromedriver");
		System.out.println("Setting up the test");
		System.out.println("Initializing the driver");}
	
	@After
	public void tearDown() {
			System.out.println("Closing the test");
			System.out.println("Closing the driver");}
	
	@Test
	public void login() {
		String email = "standard_user";
		String password = "secret_sauce";
		String browserType = "chrome";
		
	//User defines WebDriver
		WebDriver driver;
		driver = utilities.DriverFactory.open(browserType);
		driver.get("https://www.saucedemo.com/");
		
	//User defines Web Elements
		WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		WebElement passwordElement = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
	
	//User fills out form with correct details
		emailElement.sendKeys(email);
		passwordElement.sendKeys(password);
		loginButton.click();
		
	driver.quit();}
	
	@Test
	public void wrongLogin() {
		String email = "standard_user";
		String wrongpassword = "secret_sauce2";
		String browserType = "chrome";
		

	//User defines WebDriver
		WebDriver driver;
		driver = utilities.DriverFactory.open(browserType);
		driver.get("https://www.saucedemo.com/");
		
	//User defines Define Web Elements
		WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		WebElement wrongpasswordElement = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		
	//User fills out form with wrong details
		emailElement.sendKeys(email);
		wrongpasswordElement.sendKeys(wrongpassword);
		loginButton.click();
		
	//Verify wrong login
		Assert.assertTrue(msg != "Epic sadface: Username and password do not match any user in this service");
		System.out.println("Test Failed");
	
	driver.quit(); }
	
	

} 
		



	
	
	




	

