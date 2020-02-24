package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.AmazonHomePage;

public class BaseTest implements IAutoConstant
{
	static {
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	public WebDriver driver;
	@BeforeTest
	public void openBrowser() throws IOException
	{
		String BrowserName = FileLib.getDataFromProperties("browser");
		if(BrowserName.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BrowserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		
		goToAmazon();
}
	
	@AfterTest
	public void closeBrowser()
	{
		
	}
	
	public void goToAmazon()
	{
		driver.get(FileLib.getDataFromProperties("amazonURL"));
		amazon=new AmazonHomePage(driver);
	}
}


