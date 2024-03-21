package Testpkg;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.Fbloginpage;


public class fblogintest {
	WebDriver driver;

	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	}
	@Test
	public void testlogin()
	{
	Fbloginpage ob = new Fbloginpage(driver);
	ob.setvalues("abc@gmail.com", "abc");
	ob.login();
	}
}
