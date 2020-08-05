package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertshandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement clickbutton = driver.findElement(By.xpath("//button[contains(text(),'display an  alert box:')]"));
		clickbutton.click();
		Thread.sleep(3000);
		Alert alertpopup = driver.switchTo().alert();
		String alerttext = alertpopup.getText();
		System.out.println(alerttext);
		alertpopup.accept();
		WebElement confirmationcase = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]"));
		confirmationcase.click();
		WebElement clickoption  = driver.findElement(By.xpath("//button[contains(text(),'display a confirm box ')]"));
		clickoption.click();
		Alert confirmpopup = driver.switchTo().alert();
		String confirmtext = confirmpopup.getText();
		System.out.println(confirmtext);
		confirmpopup.accept();
		String textmsg = driver.findElement(By.id("demo")).getText();
		System.out.println(textmsg);
		WebElement Prompt = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]"));
		Prompt.click();
		Thread.sleep(3000);
		WebElement Promptpop = driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate')]"));
		Promptpop.click();
		Alert Promptpopup = driver.switchTo().alert();
		String promptpoptext = Promptpopup.getText();
		System.out.println(promptpoptext);
		Promptpopup.sendKeys("testasite");
		Promptpopup.accept();
		String message = driver.findElement(By.id("demo1")).getText();
		System.out.println(message);
	}

}
