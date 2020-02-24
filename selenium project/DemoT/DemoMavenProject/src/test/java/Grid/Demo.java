package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Demo 
{
	RemoteWebDriver driver;
	DesiredCapabilities cap;
	@Parameters("browser")
	@BeforeTest
	public void configBT(String browserName) throws MalformedURLException
	{
		URL address=new URL("");
		if(browserName.equals("chrome"))
		{
				cap=DesiredCapabilities.firefox();
		}
		else if(browserName.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
		}
		driver=new RemoteWebDriver(address,cap);
		}
	@Test
	public void sample()
	{
		driver.get("http://localhost:8888");
	}

}
