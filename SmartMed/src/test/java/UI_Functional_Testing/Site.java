package UI_Functional_Testing;

import org.openqa.selenium.WebDriver;
import UI_Functional_Testing.Locators;

public class Site {
	public static void wait(int ms) //for pausing the system, in SECONDS
	{
		try {
			Thread.sleep((ms));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void load_Page(WebDriver driver)
	{
		driver.navigate().to("https://nmed-c.zssbd.com/prms/");
		wait(1000);
		driver.navigate().to("https://nmed-c.zssbd.com/prms/patient/check/ref/number/");
		System.out.println("Page loaded");
		wait(1000);
	}
	
	public static void login(WebDriver driver)
	{
		driver.get("https://nmed-c.zssbd.com/");
		wait(1500);
		Locators.userID(driver).sendKeys("testdoc");
		Locators.pass(driver).sendKeys("Test123456");
		Locators.signInBtn(driver).click();
		wait(1500);
		System.out.println("Login complete");
	}

}
