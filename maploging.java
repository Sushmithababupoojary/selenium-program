package SampleNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class maploging {
	public static void main(String[]args) throws InterruptedException{
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/maps/");
	Thread.sleep(40000);		
	driver.findElement(By.xpath("//input[@id='searchboxinput']")).click();		

}
}