package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardactionIncr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/inputs");
		driver.findElement(By.xpath("//p[contains(text(),'Number')]/following::input[1]")).sendKeys("5");
		Actions act =new Actions(driver);
		for(int i=0;i<5;i++) {
			act.sendKeys(Keys.ARROW_UP).build().perform();
			Thread.sleep(1000);
		}
		for(int i=0;i<5;i++) {
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(1000);
		}
		

	}

}
