package Genericutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fileutils 
{
	public String getDataFromProperties(String Key) throws IOException
	{
		FileInputStream fisobj=new FileInputStream("./commonProperties/common data.properties.txt");
		Properties pobj=new Properties();
		pobj.load(fisobj);
		String value=pobj.getProperty(Key);
		return value;
	}
	
	public String read_xl_Data(String path,String sheet,int row,int cell) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		String data="";
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			data=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
			wb.close();
		return data;
	}
	public String write_xl_Data(String path,String sheet,int row,int cell) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		String data="";

			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			data=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return data;
	}
public int getrowcount(String path,String sheet) throws EncryptedDocumentException, FileNotFoundException, IOException
{
	Workbook book=WorkbookFactory.create(new FileInputStream(path));
	int rcount=book.getSheet(sheet).getLastRowNum();
	return rcount;
}
public int getcolcount(String path,String sheet,int row) throws EncryptedDocumentException, FileNotFoundException, IOException
{
	Workbook book=WorkbookFactory.create(new FileInputStream(path));
	int colcount=book.getSheet(sheet).getRow(row).getPhysicalNumberOfCells();
	return colcount;
}

}
