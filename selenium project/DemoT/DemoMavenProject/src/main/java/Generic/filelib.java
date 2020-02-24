package Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class filelib 
{
		static String filepath="./src/main/resources/properties/common data.properties.txt";
		/**
		 * read the data from properties file based on key
		 * @param key
		 * @return
		 * @throws IOException
		 */
	public static String getDataFromProperties(String key) throws IOException
	{	
		FileInputStream fileObj=new FileInputStream(filepath);
		Properties pObj=new Properties();
		pObj.load(fileObj);
		String value=pObj.getProperty(key);
		return value;
	}

}
