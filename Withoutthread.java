package solvedprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Withoutthread {
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://in.mail.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@alt='Sign in']")).click();	
	    driver.findElement(By.xpath("//input[@ id='login-username']")).sendKeys("sushmithababupoojary");
	    driver.findElement(By.xpath("//input[@ id='login-signin']")).click();
	    driver.findElement(By.xpath("//input[@ id='login-passwd']")).sendKeys("Sush@1412");	
	    driver.findElement(By.xpath("//button[@ id='login-signin']")).click();
	    driver.findElement(By.xpath(" //a[@aria-label='Compose']")).click();
	    driver.findElement(By.xpath("//input[@ id='message-to-field']")).sendKeys("sushmithababupoojary1996@gmail.com");
	    driver.findElement(By.xpath("//input[@ data-test-id='compose-subject']")).sendKeys("invitation");
	    driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Happy Deepavali");
	    driver.findElement(By.xpath("//button[@title='Send this email']")).click();
	    
}
	
}
	

