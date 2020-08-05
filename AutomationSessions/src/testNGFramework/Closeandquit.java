package testNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Closeandquit {
	
WebDriver driver;

@Test 
public void a_urllaunch() {
	System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.naukri.com/");
	driver.manage().window().maximize();
}

@Test
public void b_close() {
	driver.quit();
}
}
