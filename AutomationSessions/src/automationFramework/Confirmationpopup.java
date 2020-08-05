package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmationpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("testqa");
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(2000);
		Alert alr = driver.switchTo().alert();
		String popuptext= alr.getText();
		System.out.println(popuptext);
		alr.dismiss();
		
		

	}

}
