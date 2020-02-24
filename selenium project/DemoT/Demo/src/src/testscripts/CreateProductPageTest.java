package testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generics.WebDriverUtils;
import vtiger.pages.CreateProductPage;
import vtiger.pages.LoginPage;

public class CreateProductPageTest {
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	@Test
	public void createProduct() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverUtils lib= new WebDriverUtils();
		driver.get(lib.getDataFromProperties("url"));
	    LoginPage lp = new LoginPage(driver);
	    lp.login(lib.getDataFromProperties("un"), lib.getDataFromProperties("pwd"));
		CreateProductPage cp=new CreateProductPage(driver);
		cp.createnewProduct("san");
	}

}
