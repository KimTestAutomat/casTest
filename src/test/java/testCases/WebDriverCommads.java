package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommads  {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

	// Open Chrome Driver
	WebDriver driver = new ChromeDriver();

	// Implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	// Maximize Browser
	driver.manage().window().maximize();

	// Open url application
	String url = "https://opensource-demo.orangehrmlive.com/";
	driver.get(url);

	String tilePage = driver.getTitle();
	int titleLength = tilePage.length();

	System.out.println("Title of the page is: " + tilePage);
	System.out.println("Lenght title of the page is: " + titleLength);

	String actualURL = driver.getCurrentUrl();
	if (actualURL.equals(url)) {
		System.out.println("Verification successfull - The correct URL is opened");
	} else {
		System.out.println("Verification failed - an incorrect URL is opened");
	}

	System.out.println("Actual URL is: " + actualURL);
	System.out.println("Expected URL is: " + url);

	String sourcePage = driver.getPageSource();
	int lengthSourcePage = sourcePage.length();
	System.out.println("Length of the source is: " + lengthSourcePage);

	driver.quit();

		
	}

}
