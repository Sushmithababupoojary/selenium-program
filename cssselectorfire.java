package SampleNew;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssselectorfire {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(4000);
			driver.findElement
			(By.cssSelector("input[id='email']")).sendKeys("sushmitha");
	}

}
