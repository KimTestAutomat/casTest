package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvent {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver1.exe");

		// open chrome driver
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open URL application
				driver.get("https://demoqa.com/text-box");
				
				// find element
				WebElement fullName = driver.findElement(By.id("userName"));
				WebElement email = driver.findElement(By.id("userEmail"));
				WebElement currentAdress = driver.findElement(By.id("currentAddress"));
				WebElement permanentAdress = driver.findElement(By.id("permanentAddress"));
				WebElement buttonSubbmit = driver.findElement(By.id("submit"));
			
				
				Actions actions = new Actions(driver);
				actions.sendKeys(fullName, "Imen").perform();
				actions.sendKeys(email, "Imen@gmail.com").perform();
				actions.sendKeys(currentAdress, "Monastir").perform();
				
				// copie current adress
				actions.keyDown(currentAdress, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
				actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(permanentAdress, Keys.CONTROL).perform();
				actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
			//	actions.click(buttonSubbmit).perform();
				

	}

}
