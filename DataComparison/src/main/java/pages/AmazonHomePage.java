package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage 
{
	@FindBy(id="twotabsearchtextbox")
    private WebElement searchBar;
	
	WebDriver driver;
	public AmazonHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchPhone()
	{
		searchBar.sendKeys("iPhone XR (64GB) - Yellow",Keys.ENTER);
	
			
}
}
