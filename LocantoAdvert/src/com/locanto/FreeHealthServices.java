package com.locanto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeHealthServices
{
     @FindBy(id="L_S")
     private WebElement ServiceMenu;
	
     @FindBy(id="L_S_508")
     private WebElement HealthService;
	
     @FindBy(id="L_S_508_50803")
     private WebElement Health;
    
     @FindBy (xpath="(//a[contains(text(),'Proceed  ')])[1]")
     private WebElement ProceedButton;
    
    public FreeHealthServices(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void ClickHealthService()
    {
    	ServiceMenu.click();
    	HealthService.click();
    	Health.click();
    	ProceedButton.click();
    }
}
