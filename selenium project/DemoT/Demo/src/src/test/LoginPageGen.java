package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageGen {
	public void loginToVtiger(WebDriver driver,String un,String pwd)
	{
		driver.get("localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
	}
	public void createOrganizations(WebDriver driver,String orgname)
	{
	driver.findElement(By.xpath("//td[@class='tabUnSelected']/a[text()='Organizations']")).click();
	driver.findElement(By.xpath("//td[@class='small']//td//td[1]//a[1]//img[1]")).click();
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
	driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
	}
}
