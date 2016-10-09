package com.locanto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeLegalServices
{
	@FindBy(id="L_S")
	private WebElement ServiceMenu;
	
	@FindBy( id="L_S_521")
	private WebElement LegalService;
	
	@FindBy(xpath="(//a[contains(text(),'Proceed  ')])[1]")
        private WebElement ProceedButton;
	
	
	public FreeLegalServices(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
        }
	public void ClickLegalService()
	{
		ServiceMenu.click();
		LegalService.click();
		ProceedButton.click();
	}
	

}
