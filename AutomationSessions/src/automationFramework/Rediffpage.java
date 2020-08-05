package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[1]")).sendKeys("Test K");
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[2]")).sendKeys("selenium90");
		WebElement check = driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[3]"));
		check.click();
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[4]")).sendKeys("Password@756");
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[5]")).sendKeys("Password@756");
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]/following::input[6]")).sendKeys("xyz90@gmail.com");
		//Select code = new Select(driver.findElement(By.xpath("//span[@id='lbl_txt']")));
		//code.selectByVisibleText("India (+91)");
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("8945678909");
		Select day =new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[1]")));
		day.selectByVisibleText("03");
		Select month =new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[2]")));
		month.selectByVisibleText("FEB");
		Select year =new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[3]")));
		year.selectByVisibleText("1990");
		WebElement gender = driver.findElement(By.xpath("//td[contains(text(),'Gender')]/following::input[2]"));
		gender.click();
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("India");
		Select city = new Select(driver.findElement(By.xpath("//select[@id='country']/following::select[1]")));
		city.selectByVisibleText("Chennai");
		Thread.sleep(20000);
		WebElement create = driver.findElement(By.xpath("//input[@id='Register']"));
		create.click();
		
		

	}

}
