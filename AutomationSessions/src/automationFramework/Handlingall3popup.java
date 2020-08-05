package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingall3popup {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		WebElement alertpop = driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
		alertpop.click();
		Alert alertpopup = driver.switchTo().alert();
		String alertpopuptext = alertpopup.getText();
		System.out.println(alertpopuptext);
		alertpopup.accept();
		WebElement confirmpop = driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
		confirmpop.click();
		Alert confirmpopup = driver.switchTo().alert();
		String confirmpopuptext = confirmpopup.getText();
		System.out.println(confirmpopuptext);
		confirmpopup.accept();
		String oktext= driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		System.out.println(oktext);
		WebElement Promptpop = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
		Promptpop.click();
		Alert Promptpopup = driver.switchTo().alert();
		String promptpoptext = Promptpopup.getText();
		System.out.println(promptpoptext);
		Promptpopup.sendKeys("testasite");
		Promptpopup.accept();
	}
}
