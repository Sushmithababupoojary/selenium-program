package solvedprogram;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildandParent {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
	     WebElement ele = driver.findElement(By.name("NewWindow"));
	     ele.click();
	     Thread.sleep(2000);
	     Set<String> allwh = driver.getWindowHandles();
	     int count = allwh.size();
	     System.out.println(count);
	     for(String wh: allwh)
	     {
	    	 System.out.println(wh); 
	     }
}
}