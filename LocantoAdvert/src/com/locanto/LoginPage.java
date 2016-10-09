package com.locanto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="pwd")
	private WebElement passward;
	
	@FindBy(name="stay_logged_in")
	private WebElement StayCheckBox;
	
	@FindBy(xpath="//button[contains(text(),'Log In ')]")
	private WebElement LoginButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Login(String mail, String pwd)
	{
		email.sendKeys(mail);
		passward.sendKeys(pwd);
		StayCheckBox.click();
		LoginButton.click();
	}

}
