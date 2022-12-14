package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	
	public static WebDriver driver;
	
	@BeforeMethod
    public void setUp() {
    System.setProperty("webdriver.chrome.driver", "D:\\selenium-server-3.9.1\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
}
	//@AfterMethod
	public void cleanUp() {
		driver.quit();
	}
}
