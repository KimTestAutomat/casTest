package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver1.exe");

		// open chrome driver
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open URL app
		driver.get("https://demoqa.com/menu/");
		
        //XPaTH by ChroPath
		Actions actions = new Actions(driver);
		WebElement mouseHover = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		//WebElement mouseHover2 = driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"));

		actions.moveToElement(mouseHover).perform();
		//actions.moveToElement(mouseHover2).perform();
		driver.quit();
	}

}
