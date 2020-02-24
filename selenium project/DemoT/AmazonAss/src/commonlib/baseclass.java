package commonlib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Generic.GenericUtils;
import Generic.filelib;
import Pages.Homepage;
import Pages.loginPage;

public class baseclass 
{
	public GenericUtils lib=new GenericUtils();
	public filelib flib=new filelib();
	public WebDriver driver;
	
	