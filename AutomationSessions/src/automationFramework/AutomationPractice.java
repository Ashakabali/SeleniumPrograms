package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("june26th2020@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Passw0rd");
		driver.findElement(By.id("SubmitLogin")).click();
		String titleText=driver.getTitle();
		System.out.println(titleText);
		String pageUrl=driver.getCurrentUrl();
		System.out.println(pageUrl);
		String welcomemesage=driver.findElement(By.xpath("//p[contains(text(),'information')]")).getText();
		System.out.println(welcomemesage);
		String message=driver.findElement(By.xpath("//h1[contains(text(),'My account')]")).getText();
		System.out.println(message);
		String attribute=driver.findElement(By.xpath("//h1[contains(text(),'My account')]")).getAttribute("class");
		System.out.println(attribute);
		String cssvalue=driver.findElement(By.xpath("//h1[contains(text(),'My account')]")).getCssValue("vertical-align");
		System.out.println(cssvalue);
		String starttag=driver.findElement(By.xpath("//h1[contains(text(),'My account')]")).getTagName();
		System.out.println(starttag);
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		String Titlename=driver.getTitle();
		System.out.println(Titlename);
		String pageUrl1=driver.getCurrentUrl();
		System.out.println(pageUrl1);
		String paginationtext=driver.findElement(By.xpath("//div[@class='product-count'][1]")).getText();
		System.out.println(paginationtext);
		String cssvalue1=driver.findElement(By.xpath("//div[@class='product-count'][1]")).getCssValue("float");
		System.out.println(cssvalue1);
		driver.findElement(By.xpath("//i[@class='icon-th-list']")).click();
		String attributeforsearchdress=driver.findElement(By.xpath("//span[@class='lighter']")).getAttribute("class");
		System.out.println(attributeforsearchdress);
		String starttag1=driver.findElement(By.xpath("//span[@class='lighter']")).getTagName();
		System.out.println(starttag1);
		driver.close();

	}

}
