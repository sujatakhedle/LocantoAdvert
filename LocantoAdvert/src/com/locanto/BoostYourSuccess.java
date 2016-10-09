package com.locanto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoostYourSuccess
{
	
	@FindBy(xpath="(//button[contains(text(),'Proceed  ')])[1]")
	private WebElement proceedButton;
	
	public  BoostYourSuccess(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
		public void ClickproceedButton()
		{
			proceedButton.click();
		}
}
