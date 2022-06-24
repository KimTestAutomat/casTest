package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		
		//open chrome driver
				WebDriver driver = new ChromeDriver();
				
				
		//maximize browser
			driver.manage().window().maximize();
				
		//open URL app
		driver.get("https://demoqa.com/buttons");

		
		
		//retrieve webElement to perform doubleClick
		WebElement btnRightClick= driver.findElement(By.id("rightClickBtn")); 
		
		//instantiate Class Action
				Actions action = new Actions(driver);
		//Right click on the button
		 action.contextClick(btnRightClick).perform();
	

			String MessageRightClick = driver.findElement(By.id("rightClickMessage")).getText();
			// Assert.assertEquals(MessageRightClick, "You have done a right click");
			Assert.assertTrue(MessageRightClick.contains("right click"));
		 driver.quit();

	}

}
