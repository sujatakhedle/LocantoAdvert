package generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadFromExcel {
	
		public static String getCellValue(String xlPath,String Sheet,int r, int c)
		{
			String v="";
			try{
				
				Workbook wb=WorkbookFactory.create(new FileInputStream(xlPath));
				v=wb.getSheet(Sheet).getRow(r).getCell(c).toString();
		       
			}
			catch(Exception e){
				
			}
			return v;
		}
		public static int getRowCount(String xlPath,String Sheet){
			int rc=0;
			try{
				Workbook wb=WorkbookFactory.create(new FileInputStream(xlPath));
				rc=wb.getSheet(Sheet).getLastRowNum();
			}
			catch(Exception e)
			{
				
			}
			return rc;
		}
		
		public static int getCellCount(String xlPath, String Sheet, int Row )
		{
			
		    int lastColumn=0;
			try{
			Workbook wb=WorkbookFactory.create(new FileInputStream(xlPath)); //Use XSSFWorkBook incase of error, resolved in apache poi 3.7
		    Row rowNo=wb.getSheet(Sheet).getRow(Row);
		    lastColumn=(int) rowNo.getLastCellNum(); //getLastCellNum return short type, upcasted to int type
		    }
			catch(Exception e){
				
			}
			return lastColumn;

	}
		
		public static String[] readRow(String xlPath,String xlSheet,int row, int columnCount)
		{
			String[] data=new String[columnCount];
						
	        for(int j=0;j<columnCount;j++)
	        {
	        	data[j]=ReadFromExcel.getCellValue(xlPath, xlSheet, row, j);
	        }
	        return data;
		}
	}