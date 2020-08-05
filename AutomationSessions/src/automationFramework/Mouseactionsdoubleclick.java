package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactionsdoubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick).build().perform();
		Alert alr = driver.switchTo().alert();
		String popup = alr.getText();
		System.out.println(popup);
		alr.accept();
	}

}
