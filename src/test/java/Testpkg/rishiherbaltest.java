package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.RishiHerbalpage;

public class rishiherbaltest {
	WebDriver driver;

	@BeforeTest
	public void setup() {

	 driver=new ChromeDriver();
	 driver.get("https://rishiherbalindia.linker.store/");
	 driver.manage().window().maximize();

	}

	@Test

	public void test()

	{

		rishiherbaltest ob=new rishiHerbaltest(driver);

		ob.health();
		ob.instock();
		ob.sortby();
		ob.select();
		ob.addto();

	}
}
