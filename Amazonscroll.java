package solvedprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonscroll {
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	for(int i=0;i<3;i++)
	{
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
		}
	for(int j=0;j<3;j++)
	{
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(2000);	
	}
	}
}
