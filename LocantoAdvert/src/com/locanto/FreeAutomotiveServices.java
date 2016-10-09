package com.locanto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeAutomotiveServices
{
	
    @FindBy(id="L_S")
    private WebElement ServiceMenu;
	
    @FindBy(id="L_S_516")
    private WebElement AutomotiveService;
	
    @FindBy(xpath="(//a[contains(text(),'Proceed  ')])[1]")
    private WebElement ProceedButton;
    
    public FreeAutomotiveServices(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void ClickAutomotiveServices()
    {
    	ServiceMenu.click();
    	AutomotiveService.click();
    	ProceedButton.click();
    }
}
