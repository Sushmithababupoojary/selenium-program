package SampleNew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class optiondrop {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(500);
		WebElement ele=driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(ele);
		List<WebElement> options = s.getOptions();
				int count=options.size();
		System.out.println(count);
}
}