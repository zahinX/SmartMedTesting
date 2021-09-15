package UI_Functional_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//setting up and initialization of the browser drivers, and manipulation of browser window
@SuppressWarnings({})
public class BrowserDrv {
	public static void edgeSetup()
	{
		WebDriverManager.edgedriver().setup();
		System.out.println("Edge setup complete");
	}
	
	public static void firefoxSetup()
	{
		WebDriverManager.firefoxdriver().setup();
		System.out.println("Firefox setup complete");
	}
	
	public static void chromeSetup()
	{
		WebDriverManager.chromedriver().setup();
		System.out.println("Chrome setup complete");
	}
	
	public static WebDriver edgeDrvInit()
	{
		System.out.println("Edge driver initializing");
		System.setProperty("webdriver.edge.silentOutput", "true"); //to suppress console messages
		return new EdgeDriver();
	}
	
	public static WebDriver firefoxDrvInit()
	{
		System.out.println("Firefox driver initializing");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null"); //to suppress console messages
		return new FirefoxDriver();
	}
	
	public static WebDriver chromeDrvInit()
	{
		System.out.println("Chrome driver initializing");
		System.setProperty("webdriver.chrome.silentOutput", "true"); //to suppress console messages
		return new ChromeDriver();
	}

	public static void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
}
