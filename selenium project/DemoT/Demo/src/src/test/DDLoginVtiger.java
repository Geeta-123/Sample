package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generics.WebDriverUtils;

public class DDLoginVtiger {
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	@Test
public void login() throws IOException
	
	{
		
		WebDriver driver= new ChromeDriver();
		WebDriverUtils lib = new WebDriverUtils();
		driver.manage().window().maximize();
		lib.waitelementToLOad(driver);
		FileInputStream fisObj=new FileInputStream("./commondata.properties");
		Properties pObj=new Properties();
		pObj.load(fisObj);
		driver.get(pObj.getProperty("url"));
		
		driver.findElement(By.name("user_name")).sendKeys(pObj.getProperty("un"));
		driver.findElement(By.name("user_password")).sendKeys(pObj.getProperty("pwd"));
		driver.findElement(By.id("submitButton")).click();
		
		//to create product
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys(pObj.getProperty("proname"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//to create organisation
		driver.findElement(By.xpath("//td[@class='tabUnSelected']/a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//td[@class='small']//td//td[1]//a[1]//img[1]")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(pObj.getProperty("orgname"));
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		
		//to create campaign
		driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']")).click();
		driver.findElement(By.name("Campaigns")).click();
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		driver.findElement(By.name("campaignname")).sendKeys(pObj.getProperty("camname"));
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
	}


}
