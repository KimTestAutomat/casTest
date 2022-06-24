package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTypeDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open chrome driver
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open URL app
		driver.get("https://demoqa.com/tool-tips/");

		// XPaTH by ChroPath
		Actions actions = new Actions(driver);
		
		/*
		 * ToolTip
		 * 
		 * */
		WebElement toolTip = driver.findElement(By.id("toolTipButton"));
		String toolTypeText = toolTip.getText(); 
		
		if(toolTypeText.equalsIgnoreCase("Hover me to see"))
		
		{
			System.out.println("pass: tooltip matching expected value");
			
		}else
			
		{
			System.out.println("Failt:tooltip not matching expected value");
			
		}
		
		/*
		 * PlaceHolder
		 * 
		 * */


		
	WebElement placeHolder = driver.findElement(By.id("toolTipTextField"));
	String textPlaceHolder = placeHolder.getAttribute("placeHolder");
	System.out.println("le text de placeHolder est : " +textPlaceHolder);
	
	driver.quit();
	}

}
