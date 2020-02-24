package restassured;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class AssignmentAuthentication {
	@Test
	public void getResource() throws Throwable {
		FileInputStream fis= new FileInputStream(new File("./src/test/resources/gitrepo.json"));
		
		given()
		.auth().preemptive().basic("geeta-123", "mankar@123")
		.contentType(ContentType.JSON)
		.body(IOUtils.toString(fis))
		.when()
		.post("https://api.github.com/user/repos")
		.then()
		.log().all();
	}
		
		@Test
		public void opengit()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://github.com/");
			
			driver.findElement(By.linkText("Sign in")).click();
			driver.findElement(By.id("login_field")).sendKeys("geeta-123");
			driver.findElement(By.name("password")).sendKeys("mankar@123");
			driver.findElement(By.name("commit")).click();
			
			driver.findElement(By.xpath("//img[@src='https://avatars0.githubusercontent.com/u/60417610?s=40&v=4']")).click();
			driver.findElement(By.linkText("Your repositories")).click();
			
			List<WebElement> lst =driver.findElements(By.xpath("//div[@id='user-repositories-list']"));
			for(WebElement s:lst)
			{
				if(s.getText().contains("Test1"))
				{
					System.out.println("created");
				}
				String t=s.getText();
		
			}
	
	}
}


