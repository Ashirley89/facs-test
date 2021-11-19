package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class TestClass {
	
	public static void main (String[] args) {
		String portal = "qaqc";
		String email = "ashirley668@gmail.com";
		String password = "q4t3S7m$st3rFLe#";
		String browserType = "chrome";
		//String wrongPassword = "q4t3S7m$st3rFLe";
		
	
		
		//Define WebDriver
		WebDriver driver;
		driver = utilities.DriverFactory.open(browserType);
	
		driver.get("https://apiqa.facsware.com/login");
		
		
		// Define Web Elements
		
		WebElement portalElement = driver.findElement(By.xpath("//*[@id=\"portal\"]"));
		WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement passwordElement = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/form/div[5]/div[1]/button"));
		//WebElement wrongPasElement = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/form/div[3]/div/span/strong"));
		//WebElement checkBoxElement = driver.findElement(By.xpath("//*[@id=\"optOut\"]"));
		
		
		// Fill Out form with correct details
		portalElement.sendKeys(portal);
		emailElement.sendKeys(email);
		passwordElement.sendKeys(password);
		
		
		//logoutButton.click();
		//wrongPasElement.sendKeys(wrongPassword);
		
		//user selects a Service
		//Select service = new Select(driver.findElement(By.id(browserType)));
		
		// User selects a project
		//Select project = new Select(driver.findElement(By.id("customSelect-vaxVP-selectedOption")));	
		//project.deselectByVisibleText("Portal");
		
		
		
		//User selects Service from service menu
		
		
		
		
		
		//Submit Button
		loginButton.click();
		
		
			
		
		
		// Get Confirmation
		String dashboardurl = "https://apiqa.facsware.com/";
		String expectedUrl= driver.getCurrentUrl(); 
		
		if(dashboardurl.equalsIgnoreCase(expectedUrl)) { 
			  System.out.println("Test passed"); } 
		
		else { System.out.println("Test failed"); } }   
		
		
		
		
		
		
		
		// Close Browser
		//driver.close();
	}
	
	

