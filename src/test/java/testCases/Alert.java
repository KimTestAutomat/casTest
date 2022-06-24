package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open chrome driver
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open URL app
		driver.get("https://demoqa.com/alerts/");

		driver.findElement(By.id("alertButton")).click();

        // Accept Alert
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println("Title of the page is : " +title);
	driver.quit();
		

	}

}
