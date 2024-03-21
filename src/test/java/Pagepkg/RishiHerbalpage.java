package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RishiHerbalpage {
	WebDriver driver;
	
	By health=By.xpath("//*[@id=\"menu\"]/ul/li[2]/a");
	 By instock=By.xpath("//*[@id=\"outOfStockFilter\"]");
	 By sortby=By.xpath("//*[@id=\"input-sort\"]");
	 By select=By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img");
	 By addto=By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span");
	
	 public void RishiHerbal(WebDriver driver)
	 {
		 this.driver=driver;
	 }

	 public void health()
	 {
		 driver.findElement(health).click();
	 }

	 public void instock()
	 {
		 driver.findElement(instock).click();
	 }

	 public void sortby()
	 {
		 WebElement sort=driver.findElement(sortby);
			Select sortdetails= new Select(sort);
			sortdetails.selectByVisibleText("A-Z alphabetical order");

	 }
	 public void select()
	 {
		 driver.findElement(select).click();
	 }

	 public void addto()
	 {
		 driver.findElement(addto).click();
	 }

}

	
