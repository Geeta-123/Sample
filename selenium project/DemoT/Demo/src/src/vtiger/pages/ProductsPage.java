package vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage{
	WebDriver driver;
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createNewProductIcon;
	public WebElement getCreateProduct()
	{
		return createNewProductIcon;
	}
	public ProductsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public CreateProductPage clickOnCreateNewProduct()
	{
		createNewProductIcon.click();
		return new CreateProductPage(driver);
	}

}
