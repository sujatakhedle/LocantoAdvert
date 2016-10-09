package testng;

import org.testng.annotations.Test;

import com.locanto.AdvertiseServices;
import com.locanto.BoostYourSuccess;
import com.locanto.FreeAutomotiveServices;
import com.locanto.LoginPage;
import generic.ReadFromExcel;

public class AdPostAutomotiveServices extends BasePage
{
	
	@Test

	public void testAdPostAutomotiveServices() throws Exception
	{
		FreeAutomotiveServices AM=new FreeAutomotiveServices(driver);
		AM.ClickAutomotiveServices();
		
		LoginPage LP= new LoginPage(driver);
		LP.Login("dmamta419@gmail.com","myad@locanto");
		
		AdvertiseServices AD= new AdvertiseServices(driver);
		String XlFile = "./excelfiles/Data.xlsx";
		String XlSheet="AdForm";
		int cc=ReadFromExcel.getCellCount(XlFile, XlSheet, 0);
		for(int i=20; i<=21; i++)	
		{
		String[] data= ReadFromExcel.readRow(XlFile, XlSheet, i, cc);
		AD.enterData(data);
		
		BoostYourSuccess BS=new BoostYourSuccess(driver);
		BS.ClickproceedButton();
		
		driver.navigate().back();
		driver.navigate().back();
	       }
       }
}

