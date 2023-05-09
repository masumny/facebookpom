package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatACcountModel extends BaseModel {
	public CreatACcountModel(WebDriver e) {
		super(e);
		
	}
	public WebElement  getfirstname() throws InterruptedException {
		Thread.sleep(3000);
		WebElement b = driver.findElement(By.xpath("//input[@name='firstname']"));
		return  b;
	
}
	public WebElement  getlastname() throws InterruptedException {
		//Thread.sleep(3000);
		WebElement i = driver.findElement(By.xpath("//input[@name='lastname']"));
		return  i;
	}
	public WebElement  getmobilenumber() {
		WebElement m = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		return  m;
	}
	public WebElement  selectmonth() {
		WebElement drop = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		return drop;
		}
	public WebElement  getmale() {
		WebElement s1 = driver.findElement(By.xpath("//input[@value='2']"));
		return s1;
	}
	public WebElement  getfemale() {
	WebElement s2 = driver.findElement(By.xpath("//input[@value='1']"));
	return s2;
	}
	public WebElement  getcoustom() {
		 WebElement s3 = driver.findElement(By.xpath("//input[@value='-1']"));	
		 return s3;
	
	}
}
