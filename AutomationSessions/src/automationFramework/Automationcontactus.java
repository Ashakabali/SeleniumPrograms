package automationFramework;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationcontactus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("(//a[contains(text(),'Contact us')])[1]")).click();
		Select heading = new Select(driver.findElement(By.id("id_contact")));
		heading.selectByVisibleText("Customer service");
		driver.findElement(By.id("email")).sendKeys("june26th2020@gmail.com");
		driver.findElement(By.id("message")).sendKeys("Replacement");
		WebElement send = driver.findElement(By.xpath("//span[contains(text(),'Send')]"));
		send.click();
		

	}

}
