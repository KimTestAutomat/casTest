package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickmeDemo {

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
		
		//retrieve webElement to perform simpleClick
		WebElement btnClickme= driver.findElement(By.id("SeZGF"));
		
		//click on the button

	action.click(btnClickme).perform();
		
	

		//	String MessageRightClick = driver.findElement(By.id("rightClickMessage")).getText();
	}

}
