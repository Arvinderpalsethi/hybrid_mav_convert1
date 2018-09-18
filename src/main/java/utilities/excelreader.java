package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class excelreader {

	public static String [][] excelread(String tid) {
	//public static void main(String[] tid) {
		
		String data[][]= null;
		try 
		{
			FileInputStream fi = new FileInputStream("D:\\Study 1\\Java_Practice\\Selenium\\15 Sept Hybrid\\testcase.xls");
			HSSFWorkbook bk = new HSSFWorkbook(fi);
			HSSFSheet sheet = bk.getSheetAt(1);
			
			int rc = sheet.getPhysicalNumberOfRows();
			//System.out.println(rc);
			
			 data = new String [rc][5];
			int aindex = 0;
			
			//System.out.println("hi");
			for (int i=1;i<rc;i++)
			{
				HSSFRow row = sheet.getRow(i);
				HSSFCell cell = row.getCell(0);
				if ( cell.getStringCellValue().equals("ERP_01"))
				{
					cell = row.getCell(0);
					data [aindex][0]=cell.getStringCellValue();
					
					System.out.println("data"+aindex+" 0  :"+data [aindex][0]);
					
					cell = row.getCell(1);
					data [aindex][1]=cell.getStringCellValue();
					System.out.println("data"+aindex+" 1  :"+data [aindex][1]);
					
					
					cell = row.getCell(2);
					data [aindex][2]=cell.getStringCellValue();
					System.out.println("data"+aindex+" 2  :"+data [aindex][2]);
					
					
					cell = row.getCell(3);
					data [aindex][3]=cell.getStringCellValue();
					System.out.println("data"+aindex+" 3  :"+data [aindex][3]);
					
					cell = row.getCell(4);
					data [aindex][4]=cell.getStringCellValue();
					System.out.println("data"+aindex+" 4  :"+data [aindex][4]);
					
					aindex++;
				}
			}
				
		}
		
		catch (Exception e) {
			
		}
               	 
		return data;
	}

	
}
