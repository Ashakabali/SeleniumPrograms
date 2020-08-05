package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("testk");
		driver.findElement(By.id("u_0_o")).sendKeys("ktest");
		driver.findElement(By.id("u_0_r")).sendKeys("0945643224");
		driver.findElement(By.id("password_step_input")).sendKeys("FBtest@2020");
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByVisibleText("10");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Feb");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2020");
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.id("u_0_6"));
		gender.click();
		WebElement signup = driver.findElement(By.id("u_0_12"));
		signup.click();
	}

}
