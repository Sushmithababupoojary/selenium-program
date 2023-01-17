package SampleNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleoption {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Dell/Assignment%20java/Documents/multipledrop.html");
		WebElement ele=driver.findElement(By.xpath("//input"));
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByVisibleText("curd rice");
		s.deselectByValue("j");
		s.deselectAll();
		
	}
}
