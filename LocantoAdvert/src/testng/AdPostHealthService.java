package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.locanto.AdvertiseServices;
import com.locanto.BoostYourSuccess;
import com.locanto.FreeHealthServices;
import com.locanto.LoginPage;

import generic.ReadFromExcel;

public class AdPostHealthService extends BasePage {

	@Test
	
	public void testAdPostHealthService() throws Exception{
		
		FreeHealthServices HL=new FreeHealthServices(driver);
		HL.ClickHealthService();
		
		LoginPage LP=new LoginPage(driver);
		LP.Login("dmamta419@gmail.com","myad@locanto");
		
		AdvertiseServices AD= new AdvertiseServices(driver);
		String xlFile = "./excelfiles/Data.xlsx";
		String xlSheet="AdForm";
		int rc=ReadFromExcel.getRowCount(xlFile, xlSheet);
		int cc=ReadFromExcel.getCellCount(xlFile, xlSheet,0);
		
		 Reporter.log(rc+" " , true);
		
		 
	    for(int i=15; i<=17; i++){
	    	
			String[] data= ReadFromExcel.readRow(xlFile, xlSheet, i, cc);
		
		AD.enterData(data);
		
		BoostYourSuccess BS= new BoostYourSuccess(driver);
		BS.ClickproceedButton();
		driver.navigate().back();
		driver.navigate().back();
		}
	    	
		 }
	}
	
		
	