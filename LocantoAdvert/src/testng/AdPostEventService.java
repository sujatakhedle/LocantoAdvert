package testng;

import org.testng.annotations.Test;
import com.locanto.AdvertiseServices;
import com.locanto.BoostYourSuccess;
import com.locanto.FreeEventServices;
import com.locanto.LoginPage;
import generic.ReadFromExcel;

public class AdPostEventService extends BasePage
{
	@Test
	public void testAdPostEventService() throws Exception
	{
		FreeEventServices ES= new FreeEventServices(driver);
		ES.ClickEventService();
		
		LoginPage LP= new LoginPage(driver);
		LP.Login("dmamta419@gmail.com","myad@locanto");
		
		AdvertiseServices AD= new AdvertiseServices(driver);
		String xlFile = "./excelfiles/Data.xlsx";
		String xlSheet="AdForm";
		int cc=ReadFromExcel.getCellCount(xlFile, xlSheet,0);
		for(int i=22; i<=22; i++)
		{
		String[] data= ReadFromExcel.readRow(xlFile, xlSheet, i ,cc);	
		AD.enterData(data);
		System.out.println("i value sys"+i);
		
		 BoostYourSuccess BS= new  BoostYourSuccess(driver);
		 BS.ClickproceedButton();
			
		driver.navigate().back();
		driver.navigate().back();
		  
		}
        }
}		


