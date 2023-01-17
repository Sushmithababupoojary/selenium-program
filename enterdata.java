package SampleNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class enterdata {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("sushmitha");
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.id("loginbutton")).click();
}
}
