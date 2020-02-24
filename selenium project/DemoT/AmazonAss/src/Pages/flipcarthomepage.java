package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipcarthomepage
{
		WebDriver driver;
		public flipcarthomepage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		@FindBy(name="q")
		private WebElement search;
		
	public void searchphone()
	{
		search.sendKeys("iphone XR (64GB) - Yellow",Keys.ENTER);
	}

}
