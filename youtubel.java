package SampleNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtubel {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Kgf movie");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	
	}

}
