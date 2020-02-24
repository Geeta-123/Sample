package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generics.WebDriverUtils;

public class VtigerLogin {
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	@Test
	public void login() throws InterruptedException
	
	{
		
		WebDriver driver= new ChromeDriver();
		WebDriverUtils lib = new WebDriverUtils();
		driver.manage().window().maximize();
		lib.waitelementToLOad(driver);
		driver.get("localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		//to create product
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys("sandisk");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//to create organisation
		driver.findElement(By.xpath("//td[@class='tabUnSelected']/a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//td[@class='small']//td//td[1]//a[1]//img[1]")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("saqsassaa");
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		
		//to create campaign
		driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']")).click();
		driver.findElement(By.name("Campaigns")).click();
		driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();
		driver.findElement(By.name("campaignname")).sendKeys("sandisk");
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
		lib.switchToChildWindow(driver);
		driver.findElement(By.name("search_text")).sendKeys("sandisk");
		WebElement element = driver.findElement(By.xpath("//select[@class='txtBox']"));
		lib.select(element, 3);
		Thread.sleep(3000);
		driver.findElement(By.name("search")).click();
		driver.findElement(By.linkText("sandisk")).click();
		lib.switchToParent(driver);
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
	}

}
