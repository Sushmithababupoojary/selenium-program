package SampleNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssselectyoutube2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		ThreafindElementd.sleep(4000);
		driver.
		(By.cssSelector("input[name='username']")).sendKeys("sushmitha");
		//( By.cssSelector("input[id='search']")).sendKeys("kgf movie");
		//(By.cssSelector("input[name='username']")).sendKeys("sushmitha");
}
}
