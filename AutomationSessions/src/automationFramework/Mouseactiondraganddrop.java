package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactiondraganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement source = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement target = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
		Actions actdrag = new Actions(driver);
		actdrag.dragAndDrop(source, target).build().perform();
		
		

	}

}
