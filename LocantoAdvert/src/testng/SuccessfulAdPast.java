package testng;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.Test;
import com.locanto.AdvertiseServices;
import com.locanto.BoostYourSuccess;
import com.locanto.FreeClassifiedPage;
import com.locanto.LoginPage;
import generic.ReadFromExcel;

public class SuccessfulAdPast extends BasePage 
{
	@Test  
	public void testsuccessAdPost() throws Exception 
	{
		FreeClassifiedPage HS=new FreeClassifiedPage(driver);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		HS.ClickHomeService();
		
	
		LoginPage LP=new LoginPage(driver);
		LP.Login("dmamta419@gmail.com","myad@locanto");
		
	
		AdvertiseServices AD= new AdvertiseServices(driver);
		String xlFile = "./excelfiles/Data.xlsx";
		String xlSheet="AdForm"; 
		int cc=ReadFromExcel.getCellCount(xlFile, xlSheet,0);
		for(int i=1; i<=9; i++)
	        { 
		String[] data= ReadFromExcel.readRow(xlFile, xlSheet, i, cc);    
	        AD.enterData(data);
	      
		BoostYourSuccess BS= new  BoostYourSuccess(driver);
		BS.ClickproceedButton();
		
		driver.navigate().back();
		driver.navigate().back();
		}
	  }
}

