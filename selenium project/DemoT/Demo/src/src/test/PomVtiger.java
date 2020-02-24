package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomVtiger {
	@FindBy(name="user_name")
	private WebElement un;
	
	@FindBy(name="user_password")
	private WebElement pwd;
	
	@FindBy(id="submitButton")
	private WebElement login;
	
	@FindBy(linkText="Products")
	private WebElement products;
	
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createProduct;
	
	@FindBy(name="productname")
	private WebElement proName;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement saveProduct;
	
	@FindBy(linkText="Organizations")
	private WebElement Organizations;
	
	@FindBy(xpath="//td[@class='small']//td//td[1]//a[1]//img[1]")
	private WebElement createOrg;
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement enterOrgName;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveOrg;
	
	@FindBy(xpath="//img[@src='themes/softed/images/menuDnArrow.gif']")
	private WebElement more;
	
	@FindBy(name="Campaigns")
	private WebElement Campaigns;
	
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement createCampaign;
	
	@FindBy(name="campaignname")
	private WebElement campaignname;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveCampaign;
	
	public void login()
	
	
}
