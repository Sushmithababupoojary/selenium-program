package solvedprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification {
@ Test
public void validLogin() throws InterruptedException
{
System.setProperty("Webdriver.gecko.driver", "./Softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com");
driver.findElement(By.id("email")).sendKeys("admin");
driver.findElement(By.id("pass")).sendKeys("manager");
driver.findElement(By.name("login")).click();
Thread.sleep(2000);
String title = driver.getTitle();
//Assert.assertEquals(title,"Facebook - log in or sign up" );
//System.out.println("1");
}
}
