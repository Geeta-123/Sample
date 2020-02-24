package vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductInformationPage
{
	public ProductInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
