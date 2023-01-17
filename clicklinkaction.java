package SampleNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clicklinkaction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Dell/Assignment%20java/Documents/tagi.html");
		Thread.sleep(4000);
		driver.findElement(By.tagName("a")).click();
}
}