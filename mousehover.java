package solvedprogram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

public static void main(String[]args) throws AWTException, InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	Actions act = new Actions(driver);
	act.contextClick(ele).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyPress(KeyEvent.VK_T);
	}
}
