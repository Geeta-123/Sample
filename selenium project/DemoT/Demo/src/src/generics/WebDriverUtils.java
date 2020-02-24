package generics;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	public int getRandomNum()
	{
		Random ran=new Random();
		return ran.nextInt(10000);//10000 is a boundary i.e no will vary from 1to 10000(repeats)
	}
public void waitelementToLOad(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
public void waitForElementToclick(WebDriver driver,WebElement element)
{
	WebDriverWait wait= new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(element));
}
public void waitForElementToBeSelected(WebDriver driver,WebElement element)
{
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeSelected(element));
}
//custom wait
public void waitForClickElement(WebDriver driver,WebElement element) throws Throwable
{
int count=0;
while(count<=20)
{
	try
	{
		element.click();
		break;
	}
	catch (Throwable t)
	{
		Thread.sleep(1000);
		count++;
	}
}
}
public void select(WebElement element,String text)
{
	Select sel = new Select(element);
	sel.selectByVisibleText(text);
}
public void select(WebElement element,int index)
{
	Select sel= new Select(element);
	sel.selectByIndex(index);
}
public void moveMouseOnElement(WebDriver driver,WebElement element)
{
	Actions act= new Actions(driver);
	act.moveToElement(element).perform();
}
public void acceptAlert(WebDriver driver)
{
	driver.switchTo().alert().accept();
}
public void cancelAlert(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
}
static String parentWID,childWID;
public void  switchToChildWindow(WebDriver driver)
{
	Set<String> whs = driver.getWindowHandles();
	Iterator<String> it= whs.iterator();
	parentWID=it.next();
	childWID=it.next();
	driver.switchTo().window(childWID);
}
public void switchToParent(WebDriver driver)
{
	driver.switchTo().window(parentWID);
}
public void maximizeAndTimeout(WebDriver driver,long ITO)
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
}



}
