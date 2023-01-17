package SampleNew;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.support.ui.Select;

public class sortlistascend {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/reg/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//select[@id='year']"));
		ArrayList<String> l = new ArrayList<String>();
		Select s=new Select(ele);
		List<WebElement> options = s.getOptions();
				int count=options.size();
	for(WebElement opt: options)
	{
		String t = opt.getText();
		l.add(t);
	}
		Collections.sort(l);
	for(String a:l)
	{
		System.out.println(a);
	}
}
	
}

