package vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generics.WebDriverUtils;

public class HomePage{
	WebDriver driver;
	WebDriverUtils lib=new WebDriverUtils();
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement admin;
	public WebElement getAdmin() 
	{
		return admin;
	}
	@FindBy(linkText="Sign Out")
	private WebElement signOut;
	public WebElement getSignOut()
	{
		return signOut;
	}
	@FindBy(linkText="Organizations")
	private WebElement Organizations;
	public WebElement getOrganizations()
	{
		return Organizations;
	}
	@FindBy(linkText="Products")
	private WebElement products;
	public WebElement getProducts()
	{
		return products;
	}
	@FindBy(linkText="More")
	private WebElement More;
	
	@FindBy(name="Campaigns")
	private WebElement Campaigns;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logOut() throws Throwable
	{
	lib.moveMouseOnElement(driver, admin);
	Thread.sleep(2000);
	//lib.waitForClickElement(driver, signOut);
	signOut.click();
	}
	
	//to navigate to organizations page and to return next page object i.e createOrganizatons
	public OrganizationsPage navigateToOrgPage()
	{
		Organizations.click();
		return new OrganizationsPage(driver);
	}
	public ProductsPage navigateToProPage()
	{
		products.click();
		return new ProductsPage(driver);
	}
	public void verifyHomePage()
	{
		String actual="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String expected=driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
	public CampaignsPage navigateToCamPage()
	{
		lib.moveMouseOnElement(driver, More);
		Campaigns.click();
		
		return new CampaignsPage(driver);
	}
}
