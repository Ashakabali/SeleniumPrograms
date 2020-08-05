package testNGFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoblaze_Addtocartflow {
	
WebDriver driver;

@Test

public void a_urllauch () {
	System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
	driver.manage().window().maximize();
}

@Test

public void b_productmenu () throws InterruptedException {
	driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[contains(text(),'MacBook air')]")).click();
	Thread.sleep(3000);
	WebElement cart = driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']"));
	cart.click();
	Thread.sleep(3000);
	Alert popup = driver.switchTo().alert();
	String text = popup.getText();
	System.out.println(text);
	popup.accept();
}

}
