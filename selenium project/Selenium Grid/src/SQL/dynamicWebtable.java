package SQL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicWebtable 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("mankargeeta27@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		
		
		
		
		
		
	}

}
