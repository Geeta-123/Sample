package generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	String filePath="./data/testData.xlsx";
	public String getDataFromProperties(String key) throws IOException
	{
		FileInputStream fisObj=new FileInputStream("./data/commondata.properties");
		Properties pObj=new Properties();
		pObj.load(fisObj);
		String value=pObj.getProperty(key);
		return value;
		
	}
	public String getExcelData(String sheetName,int rowNum,int colNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(filePath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet(sheetName);
		Row row= sh.getRow(rowNum);
		String data= row.getCell(colNum).getStringCellValue();
		wb.close();
		return data;
	}
	public void setExcelData(String sheetName,int rowNum,int colNum,String data) throws IOException
	{
		FileInputStream fis=new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row =sh.getRow(rowNum);
		Cell cell=row.createCell(colNum);
		cell.setCellValue(data);
		FileOutputStream fos= new FileOutputStream(filePath);
				wb.write(fos);
		}
public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException
{
	FileInputStream fis= new FileInputStream(filePath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet(sheetName);
	int rowIndex = sh.getLastRowNum();
	return rowIndex;
}
}
