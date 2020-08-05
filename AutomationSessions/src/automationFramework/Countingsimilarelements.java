package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countingsimilarelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/A._P._J._Abdul_Kalam");
		driver.manage().window().maximize();
		int linkcount= driver.findElements(By.tagName("a")).size();
		System.out.println(linkcount);
        int immagecount = driver.findElements(By.tagName("img")).size();
        System.out.println(immagecount);
        
	}

}
