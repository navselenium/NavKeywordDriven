import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	
	public static void setexcel(String path, int sheetnum)
	{
		try {
		File src = new File(path);		
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			sh = wb.getSheetAt(sheetnum);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static String getData(int rownum, int cellnum) {
		String data = sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
		
	}
}
