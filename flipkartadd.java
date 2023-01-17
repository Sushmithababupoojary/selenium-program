package SampleNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartadd {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[@id='twotabsearchtextbox']")).sendKeys("book");
		driver.findElement(By.xpath(".//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath(".//img[@alt='Curious Tales from the Desert']")).click();
		driver.findElement(By.xpath(".//span[@id='nav-cart-count']")).click();
	}


}
