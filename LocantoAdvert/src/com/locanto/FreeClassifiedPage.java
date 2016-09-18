package com.locanto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeClassifiedPage
{
	@FindBy(id="L_S")
	private WebElement ServicesMenu;
	
	@FindBy( id="L_S_511")
	private WebElement HomeServices;
	
	@FindBy(xpath="(//a[contains(text(),'Proceed  ')])[1]")
	private WebElement ProceedButton;
	
	public  FreeClassifiedPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
	public void ClickHomeService()
	{
		ServicesMenu.click();
		HomeServices.click();
		ProceedButton.click();	
	}
	
}


