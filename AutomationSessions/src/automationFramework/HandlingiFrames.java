package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class HandlingiFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nunzioweb.com/index.shtml");
		driver.manage().window().maximize();
        int iframescount = driver.findElements(By.tagName("iframe")).size();
        System.out.println(iframescount);
        driver.switchTo().frame("oddcouple");
        String iframetext = driver.findElement(By.xpath("//div[contains(text(),'A television')]")).getText();
        System.out.println(iframetext);
	}

}
