import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	@Parameters({"url","browser"})
		public void browserTest(String url,String browser) throws MalformedURLException
	{
		URL node=new URL(url);
		
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setBrowserName(browser);
		
		WebDriver driver=new RemoteWebDriver(node, ds);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	
	
			
		}
		
	}


