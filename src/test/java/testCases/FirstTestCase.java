package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedrive.exe");
		
//open chrome nav
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//maximize browser
	driver.manage().window().maximize();
		
//open URL app
driver.get("https://opensource-demo.orangehrmlive.com/");

//Delete Cookies
driver.manage().deleteAllCookies();

//Input username
driver.findElement(By.id("txtUsername")).sendKeys("Admin");

//Thread treatment
//Thread.sleep(3000);

//Input password
driver.findElement(By.id("txtPassword")).sendKeys("admin123");


//Thread.sleep(3000);

//Click login button with explicit wait
WebDriverWait wait = new WebDriverWait(driver,20);
WebElement btnLogin;
btnLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLogin")));
btnLogin.click();

//click login
//driver.findElement(By.id("btnLogin")).click();

/*
//Assert
String userMessage = driver.findElement(By.id("welcome")).getText();
 Assert.assertEquals(userMessage, "Welcome Beth");

//Thread.sleep(3000);
//print logging message
System.out.println("Authentification reussie");

//close browser fermer un seul onglet
driver.close();
//kill browser fermer toutes les onglets
driver.quit();
		*/
	}

}
