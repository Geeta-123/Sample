package commonlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class filelib 
{
	static String propFile = "./commonProperties/common data.properties.txt";
	public static String getProp(String key)
	{
		Properties prop=new Properties();
		try
		{
			prop.load(new FileInputStream(propFile));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	
	
}