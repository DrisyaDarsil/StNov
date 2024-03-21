package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	
	WebDriver driver;
	 
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpassword;
	
	@FindBy(name="login")
	WebElement fblogin;
	
	 public Fbloginpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub

			this.driver=driver2;
			PageFactory.initElements(driver, this);
		}

	 public void setvalues(String username,String password) {
			fbemail.sendKeys(username);
			fbpassword.sendKeys(password);
		}

	 public void login()
		{
			fblogin.click();
		}
}


