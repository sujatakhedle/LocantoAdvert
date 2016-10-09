package com.locanto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeEventServices
{
	
	@FindBy(id="L_S")
	private WebElement ServicesMenu;
	
	@FindBy( id="L_S_507")
	private WebElement EventServices;
	
	@FindBy(xpath="(//a[contains(text(),'Proceed  ')])[1]")
	private WebElement ProceedButton;
	
	
	public FreeEventServices(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}
	public void ClickEventService()
	{
	   ServicesMenu.click();
	   EventServices.click(); 
	   ProceedButton.click();
	}
}
