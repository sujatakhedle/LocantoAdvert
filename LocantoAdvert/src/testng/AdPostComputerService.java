package testng;

import org.testng.annotations.Test;
import com.locanto.AdvertiseServices;
import com.locanto.BoostYourSuccess;
import com.locanto.FreeComputerService;
import com.locanto.LoginPage;
import generic.ReadFromExcel;

public class AdPostComputerService extends BasePage
{

	@Test
	
	public void testAdComputerService() throws Exception
	{		
		FreeComputerService CS= new FreeComputerService(driver);
		CS.ClickComputerService();
		
		LoginPage LP= new LoginPage(driver);
		LP.Login("dmamta419@gmail.com","myad@locanto");
		
		AdvertiseServices AD= new AdvertiseServices(driver);
		String xlFile = "./excelfiles/Data.xlsx";
		String xlSheet="AdForm";
		int cc=ReadFromExcel.getCellCount(xlFile, xlSheet,0);
		for(int i=18; i<=19; i++)
		{
		String[] data= ReadFromExcel.readRow(xlFile, xlSheet, i, cc);
		AD.enterData(data);
			
		BoostYourSuccess BS= new BoostYourSuccess(driver);
		BS.ClickproceedButton();
		
		driver.navigate().back();
		driver.navigate().back();
		}
         }
 }
