package com.locanto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeComputerService {
	@FindBy(id="L_S")
	private WebElement ServiceMenu;
	
	@FindBy(id="L_S_504")
    private WebElement ComputerService;
	
	@FindBy(xpath="(//a[contains(text(),'Proceed  ')])[1]")
	private WebElement ProceedButton;
	
	public  FreeComputerService(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void ClickComputerService()
	{
		ServiceMenu.click();
		ComputerService.click();
		ProceedButton.click();
	}
}
