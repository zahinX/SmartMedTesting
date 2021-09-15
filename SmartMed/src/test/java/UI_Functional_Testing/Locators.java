package UI_Functional_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//includes the locators for various buttons and fields
public class Locators {
	
	public static WebElement userID(WebDriver driver) 
	{
		return driver.findElement(By.id("id_username"));
	}	
	
	public static WebElement pass(WebDriver driver) 
	{
		return driver.findElement(By.id("id_password"));
	}	
	
	public static WebElement signInBtn(WebDriver driver) 
	{
		return driver.findElement(By.id("clinicianLogin"));
	}
	
	public static WebElement patientID(WebDriver driver) //Edit button
	{
		return driver.findElement(By.name("clinic_patient_ref"));
	}
	
	public static WebElement checkBtn(WebDriver driver) //Edit button
	{
		return driver.findElement(By.cssSelector("input[value='CHECK']"));
	}
	
	public static WebElement addPatient(WebDriver driver) //Edit button
	{
		return driver.findElement(By.xpath("//a[normalize-space()='ADD PATIENT']"));
	}
	
}
