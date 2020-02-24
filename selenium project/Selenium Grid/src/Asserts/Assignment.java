package Asserts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment 
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
		String actualUN="actiTIME -  Enter Time-Track</title>";
		String expectedUN="adminn";
		
		Assert.assertEquals(actualUN, expectedUN);
		Assert.assertTrue(true);
		
		
	}

}
