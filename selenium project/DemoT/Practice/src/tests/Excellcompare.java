package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Genericutils.fileutils;

public class Excellcompare 
{
	@Test
	public void compare() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		fileutils fu=new fileutils();
		String px="./data/New Microsoft Excel Worksheet.xlsx";
		int rowcnt1=fu.getrowcount(px, "Sheet1");
		int rowcnt2=fu.getrowcount(px, "Sheet2");
		int colcount1=fu.getcolcount(px, "Sheet1", rowcnt1);
		int colcount2=fu.getcolcount(px, "Sheet2", rowcnt2);
		
		boolean flag=true;
		if(rowcnt1==rowcnt2)
		{
			if(colcount1==colcount2)
			{
				for(int i=1;i<rowcnt1;i++)
				{
					for(int j = 0;j<colcount1;j++)
					{
						String str1=fu.read_xl_Data(px, "Sheet1", i, j);
						String str2=fu.read_xl_Data(px, "Sheet2", i, j);
						if(str1.equals(str2))
							continue;
						else
						{
							flag=false;
							break;
							
						}
					}
				}
				
			}
		}
		if(flag==true)
	{
		System.out.println("matching");
	}
	else
		System.out.println("not matching");
		
}
}
