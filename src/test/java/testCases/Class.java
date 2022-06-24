package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedrive.exe");

		// open chrome nav
		WebDriver driver = new ChromeDriver();

	

		// maximize browser
		driver.manage().window().maximize();

		// open URL app
		driver.get("https://www.orangehrm.com/");
Thread.sleep(10000);
		// Delete Cookies
		driver.manage().deleteAllCookies();

	}

}
