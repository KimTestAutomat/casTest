package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open chrome driver
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open URL app
		driver.get("https://demoqa.com/slider/");

		// XPaTH by ChroPath
		Actions actions = new Actions(driver);
		WebElement slider = driver.findElement(By.id("sliderContainer"));

		actions.moveToElement(slider, 25, 50).perform();

		slider.click(); 
         driver.quit();

	}

}
