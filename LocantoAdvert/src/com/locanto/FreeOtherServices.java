package com.locanto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeOtherServices 
{
	@FindBy(id="L_S")
        private WebElement ServiceMenu;
	
	@FindBy(id="L_S_502")
	private WebElement OtherService;
	
	@FindBy(xpath="(//a[contains(text(),'Proceed  ')])[1]")
	private WebElement ProceedButton;
	
	
	public FreeOtherServices(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickOtherService()
	{
		ServiceMenu.click();
		OtherService.click();
		ProceedButton.click();
	}
	
}
