package vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.WebDriverUtils;

public class CreateProductPage {
	WebDriver driver;
	WebDriverUtils lib=new WebDriverUtils();
	
	
	@FindBy(name="productname")
	private WebElement productName;
	
	@FindBy(id="qty_per_unit")
	private WebElement qty_per_unit;
	
	@FindBy(id="qtyindemand")
	private WebElement qtyindemand;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement saveProduct;
	
	public CreateProductPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createNewProduct(String proName )
	{
	productName.sendKeys(proName);
	saveProduct.click();
	}
	public void createNewProduct(String proName,String QtyPerUnit)
	{
	productName.sendKeys(proName);
	qty_per_unit.sendKeys(QtyPerUnit);
	saveProduct.click();
	}
	public void createNewProduct(String proName,String QtyPerUnit,String QtyInDemand)
	{
	productName.sendKeys(proName);
	qty_per_unit.sendKeys(QtyPerUnit);
	qtyindemand.sendKeys(QtyInDemand);
	saveProduct.click();
	}

}
