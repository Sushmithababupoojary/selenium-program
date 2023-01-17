package SampleNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartprice {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//input[@id='twotabsearchtextbox']")).sendKeys(" Apple iPhone 12 Mini (128GB)");
		driver.findElement(By.xpath(".//input[@id='nav-search-submit-button']")).click();
		WebElement ele=driver.findElement(By.xpath("//span[text()='53,900']"));
		String e=ele.getText();
		System.out.println("the cost of Amazon is" +e);
		//driver.findElement(By.xpath(".//img[@alt='Curious Tales from the Desert']")).click();
}
}