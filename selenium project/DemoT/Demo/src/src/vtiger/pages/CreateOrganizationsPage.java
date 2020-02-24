package vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.FileLib;
import generics.WebDriverUtils;

public class CreateOrganizationsPage {
	WebDriver driver;
	WebDriverUtils lib=new WebDriverUtils();
	FileLib flib=new FileLib();
	
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement enterOrgName;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveOrg;
	@FindBy(id="phone")
	private WebElement enterPhone;
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement addMember;
	@FindBy(id="search_txt")
	private WebElement searchBox;
	@FindBy(name="search")
	private WebElement searchBtn;
	@FindBy(id="1")
	private WebElement selMember;
	
	
	
	public CreateOrganizationsPage(WebDriver driver)
	{
		this.driver= driver;//important
		PageFactory.initElements(driver, this);
	}
	public OrganizationsInformationPage createNewOraganizations(String orgName)
	{
		enterOrgName.sendKeys(orgName);
		saveOrg.click();
		return  new OrganizationsInformationPage(driver);
	}
	public OrganizationsInformationPage createNewOraganizations(String orgName,String PhoneNo)
	{
		enterOrgName.sendKeys(orgName);
		enterPhone.sendKeys(PhoneNo);
		saveOrg.click();
		return  new OrganizationsInformationPage(driver);
	}
	public OrganizationsInformationPage createNewOraganizations(String orgName,String phoneNo,String MemberName)
	{
		enterOrgName.sendKeys(orgName);
		enterPhone.sendKeys(phoneNo);
		addMember.click();
		lib.switchToChildWindow(driver);
		searchBox.sendKeys(MemberName);
		searchBtn.click();
		selMember.click();
		lib.switchToParent(driver);
		saveOrg.click();
		return  new OrganizationsInformationPage(driver);
	}
}
