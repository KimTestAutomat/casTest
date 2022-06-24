package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebPage {

	public static void main(String[] args) throws InterruptedException {

		// déclaration variables
		String driverPath = "src/test/resources/drivers/chromedriver.exe";
		String baseUrl = "https://demoqa.com/automation-practice-form";

		System.setProperty("webdriver.chrome.driver", driverPath);

		// open chrome driver
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// delete all cookies
		driver.manage().deleteAllCookies();

		// open URL app
		driver.get(baseUrl);

		// scroll down
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		
		/*
		for(int second = 0;;second++) {
			if(second>=60) {
				break;
			}
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

		}*/
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}

}
