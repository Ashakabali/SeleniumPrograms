package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verificationcommands {
	
WebDriver driver;

@Test
public void pageload () {
	System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
}

@Test
public void radiobutton () throws InterruptedException {
	Thread.sleep(5000);
	WebElement button = driver.findElement(By.xpath("//label[text()='Round Trip']"));
	button.click();
	Boolean result = button.isEnabled();
	System.out.println(result);
	WebElement checkbox = driver.findElement(By.xpath("//label[text()=' Student']"));
	checkbox.click();
	Boolean result1 = checkbox.isEnabled();
	System.out.println(result1);
	Boolean result2 = driver.findElement(By.xpath("//p[contains(text(),'Connect with us')]")).isDisplayed();
	System.out.println(result2);
	
	
	
}


}
