package utilitiesReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelReader {
	static String filePath = "0";
	static HSSFWorkbook wb;
	
	public static void setPath(String filePath) throws IOException
	{
		File InputsFile = new File(filePath);
		FileInputStream fip = new FileInputStream(InputsFile);
		wb = new HSSFWorkbook(fip); 
	}
	
	public static String read(int RowNumber, int ColumnNumber) throws IOException
	{
		String CellData = "2";

		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(RowNumber);
		
			Cell cell = row.getCell(ColumnNumber);
			
			if (CellData != null && cell != null) 
				CellData = cell.getStringCellValue().toString();
		
		return CellData;
	}

	public static void main(String[] args) {
		String filePath = System.getProperty("user.dir")+"/src/test/resources/"+"Book2.xlsx";
		try {
			setPath(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	ExcelReader ExcelObj = new ExcelReader();
    	String CellDataValue = "1";
    	for (int i = 1; i< 2; i++)
    	{
    		for (int j = 0; j< 2; j++)
    		{
        		try {
					CellDataValue = ExcelObj.read(i, j);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		System.out.println(CellDataValue);
    		}
    	}
	}

}
