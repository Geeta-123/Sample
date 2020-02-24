package commonlib;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author Admin
 *
 */

public class GenericUtils {

/**
 * 
 * @return
 */
	
	public void waitforElementToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitforElementToClick(WebDriver driver,WebElement element) 
	{
		WebDriverWait wt=new WebDriverWait(driver,20);
		wt.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitforElementToVisible(WebDriver driver,WebElement element)
	{
		WebDriverWait wt=new WebDriverWait(driver,20);
		wt.until(ExpectedConditions.visibilityOf(element));
	}
	public void WaitForElementAndClick(WebDriver driver, WebElement element) throws InterruptedException
	{
		int count=0;
		while(count<=20)
		{
			try
			{
				element.click();
				break;
			}
			catch(Throwable t)
			{
				Thread.sleep(1000);
				count++;
			}
		}
	}
	
	public void moveMouseOnElement(WebElement element, WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * switch to child window
	 * @param driver
	 */
	static String parentWinID;
	static String childWinID;
	public void SwitchToChildWindow(WebDriver driver)
	{
		Set<String> set=driver.getWindowHandles();
		Iterator<String> ltr=set.iterator();
		parentWinID=ltr.next();
		childWinID=ltr.next();
		driver.switchTo().window(childWinID);
	}
	/**
	 * switchto parent window
	 * @param driver
	 */
	public void SwitchToParentWindow(WebDriver driver)
	{
		driver.switchTo().window(parentWinID);
	}
}
	

		
	
	

 

