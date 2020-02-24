package generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import vtiger.pages.HomePage;
import vtiger.pages.LoginPage;

public class BaseClass {
	public WebDriverUtils lib= new WebDriverUtils();
	public FileLib flib=new FileLib();
	
	public WebDriver driver;
	@BeforeClass
	public void configBC() throws IOException {
		String BrowserName= flib.getDataFromProperties("browser");
		if(BrowserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(BrowserName.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		lib.maximizeAndTimeout(driver, 20);
	}
	@BeforeMethod
	public void configBM() throws IOException
	{
		String URL = flib.getDataFromProperties("url");
		String USERNAME= flib.getDataFromProperties("username");
		String PASSWORD= flib.getDataFromProperties("password");
		LoginPage lp=new LoginPage(driver);
		lib.waitelementToLOad(driver);
		driver.get(URL);
		lp.login(USERNAME,PASSWORD);
	}
	@AfterMethod
	public void configAM() throws Throwable
	{
		HomePage hp=new HomePage(driver);
		hp.logOut();
	}
	@AfterClass
	public void configAC()
	{
		driver.close();
	}

}
