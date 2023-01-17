package solvedprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parentbrowser {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.get("https://skpatro.github.io/demo/links/");
	     Thread.sleep(2000);
	     String p_id = driver.getWindowHandle();
	     System.out.println(p_id);
}
}