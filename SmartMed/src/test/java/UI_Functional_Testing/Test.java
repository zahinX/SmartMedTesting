package UI_Functional_Testing;

import org.openqa.selenium.WebDriver;

import UI_Functional_Testing.Locators;
import UI_Functional_Testing.BrowserDrv;
import UI_Functional_Testing.Site;

public class Test {	
	WebDriver [] driver = new WebDriver[3];
	
	public void setUp()
	{
		BrowserDrv.edgeSetup();
		BrowserDrv.firefoxSetup();
		BrowserDrv.chromeSetup();		
	}		
	
	public void addPatient(WebDriver driver) 
	{
		Locators.patientID(driver).sendKeys("011111111111");
		Locators.checkBtn(driver).click();
		Site.wait(1500);
		Locators.addPatient(driver).click();
		Site.wait(1500);
	}
		
	public void edge_Test()
	{
		driver[0]= BrowserDrv.edgeDrvInit();
		BrowserDrv.maximizeWindow(driver[0]);
		Site.login(driver[0]);
		Site.load_Page(driver[0]);
		addPatient(driver[0]);
	}
	
	public void firefox_Test()
	{
		driver[1]= BrowserDrv.firefoxDrvInit();
		BrowserDrv.maximizeWindow(driver[1]);
		Site.login(driver[1]);
		Site.load_Page(driver[1]);
		addPatient(driver[1]);
	}
	
	public void chrome_Test()
	{
		driver[2]= BrowserDrv.chromeDrvInit();
		BrowserDrv.maximizeWindow(driver[2]);
		Site.login(driver[2]);
		Site.load_Page(driver[2]);
		addPatient(driver[2]);
	}
		
	public void tearDown()
	{
		driver[0].close();
		System.out.println("Edge driver closed");
		driver[1].close();
		System.out.println("Gecko driver closed");
		driver[2].close();
		System.out.println("Chrome driver closed");
	}

}
