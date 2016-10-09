package com.locanto;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvertiseServices
{
	
		@FindBy(id="post_type_2")
		private WebElement Adtype;
		
		@FindBy(id="subject")
		private WebElement Title;
		
		@FindBy(xpath="//div[@class='redactor-editor']")
		private WebElement Description;
		
		
		@FindBy(id="tag_1")
		private WebElement Tagbox1;
		
		@FindBy(xpath="(//input[@value=''])[3]")
		private WebElement Tagbox2;
		
		@FindBy(xpath="(//input[@value=''])[4]")
		private WebElement Tagbox3;
		
		
		
		//image upload through excel 
		
		@FindBy(xpath="(//input[@value=''])[5]")
		private WebElement Website;
		
		@FindBy(xpath="(//input[@value=''])[6]")
		private WebElement PhNum;
		
		@FindBy( id="mapStreet" )
		private WebElement Street;
		
		@FindBy(id="geo_search_post")
		private WebElement City;
		
		@FindBy(id="mapZip")
		private WebElement PostalCode; 
		
		@FindBy(xpath="(//button[@type='submit'])[2]")
		private WebElement PostyourAd;
		
		public AdvertiseServices(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		public void enterData(String[] data) throws InterruptedException
		{
			

		Adtype.click();
			
		Title.sendKeys(data[0]);
			
		Description.sendKeys(data[1]);
			
		Tagbox1.sendKeys(data[2]);
		Thread.sleep(1000);
	        Tagbox1.sendKeys(Keys.TAB);
	        
	        
	        Tagbox2.sendKeys(data[3]);
	        Thread.sleep(1000);
	        Tagbox2.sendKeys(Keys.TAB);
	        
	        Tagbox3.sendKeys(data[4]);
	        Thread.sleep(1100);
	       
	        Tagbox3.sendKeys(Keys.TAB);
	        
	        Website.sendKeys(data[5]);
	        
	        PhNum.sendKeys(data[6]);
	        
	        Street.clear();
	        Street.sendKeys(data[7]);
	        
	        City.clear();
	        City.sendKeys(data[8]);
	        
	        PostalCode.clear();
	        PostalCode.sendKeys(data[9]);
	       
		PostyourAd.click();
	       }
  }


	

