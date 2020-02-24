package Asserts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SDemo2 
{
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
	@Test
	public void s1()
	{
		String actual="QSP";
		String expected="JSP";
		
		System.out.println("the test1() starts");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actual, expected);
		
		System.out.println("the test1() ends");
		sa.assertAll();
	}

}
