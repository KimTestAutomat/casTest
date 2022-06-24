package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver1.exe");
		
		//open chrome driver
				WebDriver driver = new ChromeDriver();
				
				
		//maximize browser
			driver.manage().window().maximize();
				
		//open URL app
		driver.get("https://demoqa.com/buttons");

		//instantiate Class Action
		Actions action = new Actions(driver);
		
		//retrieve webElement to perform doubleClick
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn")); 
	
		//Double click on the button
		 
		action.doubleClick(btnDoubleClick).perform();
		
		String userMessage = driver.findElement(By.id("doubleClickMessage")).getText();
		 Assert.assertEquals(userMessage, "You have done a double click");
		// driver.quit();
	}

}
