package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import Page.CreatAccountPage;
import Page.HomePage; 

public class BaseTest {
	
static WebDriver driver;
static HomePage hp;
static CreatAccountPage ca;
@BeforeSuite
public void setup () {
	System.setProperty ("webdriver.chrome.driver", "driver/chromedriver.exe");	
	
	 driver = new ChromeDriver();	
	driver.get("https://www.facebook.com");
}
public void gethomepage() {
	hp = new HomePage(driver);
}

public void getaccountpage() {
	
	ca = new CreatAccountPage(driver);
}
}

