package SampleNew;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Dell/Assignment%20java/Documents/checkbox.html");
		WebElement text=driver.findElement(By.xpath("//input"));
		
		int count=text.size();
		System.out.println(count);
		for(WebElement we:text)
		{
			we.click();
		}
	}
}


