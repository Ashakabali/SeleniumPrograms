package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	WebDriver driver;
	String text;

	@Test 
	public void applicationlauch(){
			System.setProperty("webdriver.chrome.driver", "D://Automation//Essentials//chromedriver_win32//chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("http://zero.webappsecurity.com/");
	}

	@Test
	public void assertequals() throws InterruptedException {
	Thread.sleep(3000);
	String text = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
	Assert.assertEquals(text, "online banking");
	System.out.println("assertequals pass");
	}
	
	@Test
	public void assertnotequals() {
		Assert.assertNotEquals(text, "online banking");
		System.out.println("assertnotequals pass");
		}
	@Test
	public void asserttrue() {
		Assert.assertTrue("ONLINE BANKING".equals(driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText()));
		System.out.println("asserttrue pass");
		
	}
	@Test
	public void assertfalse() {
		Assert.assertFalse("online banking".equals(text));
		System.out.println("assertfalse pass");
	}
	
	@Test
	public void assertnotnull()
	{
		Object obj = driver.getTitle();
		Assert.assertNotNull(obj);
		System.out.println("assertnotnull pass");
	}
	
	@Test
	public void assertnull() {
		Object obj = null;
		Assert.assertNull(obj);
		System.out.println("assertnull pass");
	}
	}

