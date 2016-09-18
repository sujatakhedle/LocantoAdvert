package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.locanto.AdvertiseServices;
import com.locanto.BoostYourSuccess;
import com.locanto.FreeLegalServices;
import com.locanto.LoginPage;

import generic.ReadFromExcel;

public class AdPostLegalServices extends BasePage {
@Test
	
	public void testAdPostLegalServices() throws Exception{
		FreeLegalServices LS=new FreeLegalServices(driver);
		LS.ClickLegalService();
		
		LoginPage LP=new LoginPage(driver);
		LP.Login("dmamta419@gmail.com","myad@locanto");
		
		AdvertiseServices AD= new AdvertiseServices(driver);
		String XlFile= "./excelfiles/Data.xlsx";
		String XlSheet="AdForm";
		//int rc=ReadFromExcel.getRowCount(XlFile, XlSheet);
		int cc=ReadFromExcel.getCellCount(XlFile, XlSheet, 0);
		
		for(int i=23; i<=23; i++)
		{
			
				String[] data=ReadFromExcel.readRow(XlFile, XlSheet, i, cc);
			
				AD.enterData(data);
				
		         BoostYourSuccess BS=new BoostYourSuccess(driver);
		         BS.ClickproceedButton();
		
		         driver.navigate().back();
		         driver.navigate().back();	
		         
		        Reporter.log(data+"+",true);
		       
		        
			}
			
		}
  }

