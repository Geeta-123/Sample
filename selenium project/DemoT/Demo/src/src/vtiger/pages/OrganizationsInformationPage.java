package vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsInformationPage {
	@FindBy(id="dtlview_Product Name")
	private WebElement actOrgName;
	public WebElement actOrgName()
	{
		return actOrgName;
	}
	public OrganizationsInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
