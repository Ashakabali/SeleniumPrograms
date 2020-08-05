package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlingwindows {

	WebDriver driver;

	@Test 
	public void a_urllaunch() {
		System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void b_windowsswitch() {
		ArrayList <String> windows  = new ArrayList <String> (driver.getWindowHandles());
		for(String obj:windows) {
			System.out.println(obj);
			
		}
		driver.switchTo().window(windows.get(1));
		driver.close();
		driver.switchTo().window(windows.get(2));
		driver.close();
		driver.switchTo().window(windows.get(3));
		driver.close();
	}
	


}
