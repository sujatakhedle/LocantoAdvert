package testng;

import org.testng.annotations.Test;
import com.locanto.AdvertiseServices;
import com.locanto.BoostYourSuccess;
import com.locanto.FreeOtherServices;
import com.locanto.LoginPage;

import generic.ReadFromExcel;

public class AdPostOtherService extends BasePage {
	
@Test

public void testAdPostOtherService() throws Exception{
	FreeOtherServices OS= new FreeOtherServices(driver);
	OS.ClickOtherService();
	
	LoginPage LP=new LoginPage(driver);
	LP.Login("dmamta419@gmail.com","myad@locanto");
	
	AdvertiseServices AD=new AdvertiseServices(driver);
	String XlFile="./excelfiles/Data.xlsx";
	String XlSheet= "AdForm";
	//int rc=ReadFromExcel.getRowCount(XlFile, XlSheet);
	int cc=ReadFromExcel.getCellCount(XlFile, XlSheet, 0);
	

	
	for(int i=10; i<=14; i++)
	{

			String[] data=ReadFromExcel.readRow(XlFile, XlSheet, i, cc);
		
			AD.enterData(data);
			
	         BoostYourSuccess BS=new BoostYourSuccess(driver);
	         BS.ClickproceedButton();
	
	         driver.navigate().back();
	         driver.navigate().back();	
	         

		
	}
			
}
	
	
}


