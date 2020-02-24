package vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
	WebDriver driver;//imp
	//WebDriverUtils wdu=new WebDriverUtils();
	
	@FindBy(linkText="Organizations")
	private WebElement Organizations;
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOrgIcon;
	public WebElement getOranizations()
	{
		return Organizations;
	}
	public OrganizationsPage( WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public CreateOrganizationsPage clickOncreateNewOrganizations()
	{
		createOrgIcon.click();
		return new CreateOrganizationsPage(driver);
		
	}

}
