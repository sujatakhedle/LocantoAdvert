package testng;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BasePage
{
  public WebDriver driver;

  @BeforeMethod
  public void precondition()
  {
  driver =new FirefoxDriver();
  driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
  driver.manage().window().maximize();
  driver.get("http://bangalore.locanto.in/");
  driver.findElement(By.xpath("//span[text()='Post free ad']")).click();
  }

  @AfterMethod
  public void postcondition()
  {
   driver.close();
  }
}

