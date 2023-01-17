package solvedprogram;

import javax.imageio.spi.ImageInputStreamSpi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonFacebook
{
	public static void main(String[]args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in");
	WebElement ele=driver.findElement(By.xpath("//a[.='Facebook']"));
	Point loc = ele.getLocation();
	int x=loc.getX();
	int y=loc.getY();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	Thread.sleep(2000);
	ele.click();
	Thread.sleep(2000);
	driver.close();
}
}