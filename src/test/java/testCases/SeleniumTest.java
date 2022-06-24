package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static WebDriver driver;

@BeforeClass
public static void setup() {
	
	System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");

	// open chrome navigator
	driver = new ChromeDriver();

	// implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	// maximize browser
	driver.manage().window().maximize();

	// open URL application
	driver.get("https://opensource-demo.orangehrmlive.com/");

	// delate cookies
	driver.manage().deleteAllCookies();
}

@Test
public void userCredential() {
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
}

@Test
public void invalid_userCredential() {
	
	driver.findElement(By.id("txtUsername")).sendKeys("Imen");
	driver.findElement(By.id("txtPassword")).sendKeys("admin456");
	driver.findElement(By.id("btnLogin")).click();
}

@AfterClass
public void tearDown() {
	
	driver.quit();
}

}
