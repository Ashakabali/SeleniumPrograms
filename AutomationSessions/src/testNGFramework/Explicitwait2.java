package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicitwait2 {
	
WebDriver driver;

@Test 
public void google() {
	System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
}

@Test
public void search() {
	driver.findElement(By.name("q")).sendKeys("Asha");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
	WebDriverWait wait = new WebDriverWait(driver,20);
	WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Accredited')])[1]")));
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'Accredited')])[1]")));
	driver.findElement(By.xpath("(//h3[contains(text(),'Accredited')])[1]")).click();
}


}