package Asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void test1()
	{
		System.out.println("The TestCase is Start Here");
		String actual="QSP";
		String expected="JSP";
		Assert.assertEquals(actual, expected);
		System.out.println("Click on Compose Module");
	}

}
