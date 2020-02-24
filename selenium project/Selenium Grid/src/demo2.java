import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo2 
{
	
	@Test
	@Parameters({"url","browser"})
	public  void browserTest(String url,String browser) throws MalformedURLException
	{
		URL node1=new URL(url);
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setBrowserName(browser);
		
		
		WebDriver driver=new RemoteWebDriver(node1,ds);
		driver.get("http://www.google.com");
	}

}
