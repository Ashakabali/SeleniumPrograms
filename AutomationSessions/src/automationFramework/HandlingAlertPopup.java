package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		WebElement signin = driver.findElement(By.name("proceed"));
		signin.click();
		Alert alrpop = driver.switchTo().alert();
		String popuptext = alrpop.getText();
		System.out.println(popuptext);
		alrpop.accept();

	}

}
