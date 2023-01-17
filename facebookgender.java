package SampleNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookgender {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement btn=driver.findElement(By.xpath("//label[text()='Female']"));
		Thread.sleep(2000);
		if(btn.isDisplayed())
		{
			System.out.println("btn is displayed");
			if(btn.isSelected())
			{
				System.out.println("btn is selected");
			
			}
		
			else
			{
				btn.click();
				System.out.println("btn is clicked");
			}
		}
		else
		
		{
		System.out.println("btn is not displayed");	
		}
		}
}