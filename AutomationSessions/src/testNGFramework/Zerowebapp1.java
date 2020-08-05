package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zerowebapp1 {
WebDriver driver;

@Test (groups = "X")
public void applicationlauch(){
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
}

@Test (groups = "Y")
public void signin() throws InterruptedException {
	    Thread.sleep(5000);
		driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
}
		

}
