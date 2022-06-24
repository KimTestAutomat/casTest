package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open chrome driver
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open URL app
		driver.get("https://google.com");
		
		WebElement googleSearch = driver.findElement(By.id("realbox"));
		
		googleSearch.sendKeys("selenium");
		googleSearch.sendKeys(Keys.ENTER);

	}

}
