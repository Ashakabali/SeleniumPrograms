package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demostore_compareitems {
	
	WebDriver driver;

	@Test

	public void a_urllauch () {
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demostore.x-cart.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void b_hotdeals () {
		WebElement menu = driver.findElement(By.xpath("(//span[contains(text(),'Hot deals')])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(menu).build().perform();
		driver.findElement(By.xpath("(//span[contains(text(),'Bestsellers')])[2]")).click();
		
		
	}
	
	@Test
	public void c_categoryselection () throws InterruptedException {
		Thread.sleep(3000);
		WebElement selection = driver.findElement(By.xpath("(//h4[text()='Category'])[2]/following::input[3]"));
		selection.click();
	}

	@Test
	public void d_compareitems () throws InterruptedException {
		Thread.sleep(10000);
	WebElement label1 = driver.findElement(By.xpath("//a[contains(text(),'Balloon Sleeves')]"));
	WebElement label2 = driver.findElement(By.xpath("//a[contains(text(),'White Stripe')]"));
	Actions act = new Actions(driver);
	act.moveToElement(label1).build().perform();
	driver.findElement(By.xpath("//span[contains(text(),'$25.49')]/following::label[1]")).click();
	act.moveToElement(label2).build().perform();
	driver.findElement(By.xpath("//span[contains(text(),'$9.99')]/following::label[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(@class,'back-to-top show')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='counter'])[3]")).click();
	}
}
