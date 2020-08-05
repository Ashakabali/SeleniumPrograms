package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart_handlingtabs {
	
WebDriver driver;

@Test 

public void flipkartpageload() {
	System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
}

@Test 

public void loginlayer() {
	WebElement close = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	close.click();

}
@Test 
public void search() {
	driver.findElement(By.name("q")).sendKeys("hide and seek");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
	
}
@Test 
public void thesearchresults ( ) throws InterruptedException {
	Thread.sleep(10000);
     driver.findElement(By.xpath("//a[contains(text(),'Platina')]")).click();
     
     ArrayList <String> tabhandle = new ArrayList <String> (driver.getWindowHandles());
     for(String obj : tabhandle) {
    	 System.out.println(obj);
     }
     driver.switchTo().window(tabhandle.get(1));
     String offers= driver.findElement(By.xpath("//div[@class='edKlv2']")).getText();
     System.out.println(offers);
}

    

}
