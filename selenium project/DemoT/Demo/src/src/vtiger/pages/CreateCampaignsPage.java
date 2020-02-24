package vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.WebDriverUtils;

public class CreateCampaignsPage {
	WebDriver driver;
	WebDriverUtils lib=new WebDriverUtils();
	@FindBy(name="campaignname")
	private WebElement campaignname;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement addProductIcon;
	
	@FindBy(name="search_text")
	private WebElement searchTextBox;
	
	@FindBy(name="search")
	private WebElement searchBtn;
	
	@FindBy(id="1")
	private WebElement selectProduct;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement saveCampaign;
	
	@FindBy(name="budgetcost")
	private WebElement budgetcost;
	@FindBy(name="actualcost")
	private WebElement actualcost;
	
	
	public CreateCampaignsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public CampaignInfoPage createCampaign(String CamName,String proName)
	{
		campaignname.sendKeys(CamName);
		addProductIcon.click();
		lib.switchToChildWindow(driver);
		searchTextBox.sendKeys(proName);
		searchBtn.click();
		selectProduct.click();
		lib.switchToParent(driver);
		saveCampaign.click();
		return new CampaignInfoPage(driver);
	}
	public CampaignInfoPage createCampaign(String CamName,String proName,String budgcost)
	{
		campaignname.sendKeys(CamName);
		budgetcost.sendKeys(budgcost);
		addProductIcon.click();
		lib.switchToChildWindow(driver);
		searchTextBox.sendKeys(proName);
		searchBtn.click();
		selectProduct.click();
		lib.switchToParent(driver);
		saveCampaign.click();
		return new CampaignInfoPage(driver);
	}
	public CampaignInfoPage createCampaign(String CamName,String proName,String budgcost,String actCost)
	{
		campaignname.sendKeys(CamName);
		budgetcost.sendKeys(budgcost);
		actualcost.sendKeys(actCost);
		addProductIcon.click();
		lib.switchToChildWindow(driver);
		searchTextBox.sendKeys(proName);
		searchBtn.click();
		selectProduct.click();
		lib.switchToParent(driver);
		saveCampaign.click();
		return new CampaignInfoPage(driver);
	}

}
