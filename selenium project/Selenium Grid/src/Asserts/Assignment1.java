package Asserts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assignment1 
{
	
		static
		{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    }
		@Test
		public void L1() throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://localhost/login.do");
			
			driver.findElement(By.id("username")).sendKeys("adminn");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			
			System.out.println("The TestCase is Start Here");
			String actualUN="admin";
			String expectedUN="admin";
			
			
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(actualUN, expectedUN);
			
			System.out.println("the test1() ends");
			sa.assertAll();
			
			
		}
		public void L2() throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://localhost/login.do");
			
			
			driver.findElement(By.xpath("//div[@title='Warning! Password recovery function is disabled as email settings are not configured.']")).click();
			Thread.sleep(1000);
			
			
			
			
			
		}
	}



