package vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	WebDriver driver;
	//WebDriverUtils wdu=new WebDriverUtils();
	@FindBy(name="user_name")
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	@FindBy(name="user_password")
	private WebElement password;
	public WebElement getPassWord() 
	{
		return password;
	}
	@FindBy(id="submitButton")
	private WebElement login;
	public WebElement getLogin()
	{
		return login;
	}
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Rule 4:login and default login
	public void login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		//return new HomePage(driver);
	}/*
	public void login() throws IOException
	{
		FileLib file= new FileLib();
		username.sendKeys(file.getDataFromProperties("username"));
		password.sendKeys(file.getDataFromProperties("password"));
		login.click();*/
	}

	
	
			


