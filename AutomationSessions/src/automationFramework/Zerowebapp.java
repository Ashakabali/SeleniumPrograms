package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerowebapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		}

}
