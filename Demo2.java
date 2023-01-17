package SampleNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.qspiders.com");


	}

}
