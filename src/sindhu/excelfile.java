package sindhu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelfile {

	public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\Users\\sindh\\Desktop\\Test.xlsx");
		FileInputStream fio = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(fio);
		XSSFSheet sheet = book.getSheetAt(0);
		
		int rowc = sheet.getLastRowNum();
		System.out.println(rowc);
		
		for(int i=0;i<=rowc;i++)
		{
			
			int cellc = sheet.getRow(i).getLastCellNum();
			System.out.println(cellc);
			
			for(int j=0;j<cellc;j++)
			{
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
			}
	
		}
		
		book.close();
		
		/*
		 String data = sheet.getRow(1).getCell(1).getStringCellValue();
		String data1 = sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println(data);
		System.out.println(data1);
		 */

	}

}
