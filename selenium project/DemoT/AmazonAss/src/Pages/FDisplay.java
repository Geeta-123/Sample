package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FDisplay 
{
	WebDriver driver;
	public FDisplay(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[.=Apple iPhone XR (64GB) - Yellow']/../../../../../..//span[@data-a-color='price']")
	private WebElement iphone;
	
public void iphoneDisplay()
{
	String iphoneprice=iphone.getText();
	double iprice=Double.parseDouble(iphoneprice);
	System.out.println("price is"+iprice);
}

}
