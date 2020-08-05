package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlingtabs {
	
WebDriver driver;

@Test
public void a_tabs() {
	System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/gmail/about/#");
	driver.manage().window().maximize();
}

@Test
public void b_creataccount() {
	WebElement create = driver.findElement(By.xpath("(//a[contains(text(),'Create an account')])[4]"));
	create.click();
	
	ArrayList <String> windows  = new ArrayList <String> (driver.getWindowHandles());
	for(String obj:windows) {
		System.out.println(obj);
		
	}
 driver.switchTo().window(windows.get(1));
 driver.findElement(By.id("firstName")).sendKeys("asha90");
}

}
