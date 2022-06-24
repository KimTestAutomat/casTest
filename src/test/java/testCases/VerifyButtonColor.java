package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyButtonColor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver1.exe");

		// Open chrome navigator
		WebDriver driver = new ChromeDriver();

		// Maximize Browser
		driver.manage().window().maximize();

		// Open URL application
		driver.get("https://demoqa.com/buttons");
		
		// Get color element
		String backgroundColor = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]")).getCssValue("background-color");
		System.out.println(backgroundColor);
		String[] hexaValue = backgroundColor.replace("rgba(", "").replace(")", "").split(", ");
		
		int hexaValue1 = Integer.parseInt(hexaValue[0]);
		System.out.println("la valeur est :  "+hexaValue[0]);

		hexaValue[1] = hexaValue[1].trim();
		System.out.println("la valeur est :  "+hexaValue[1]);
		int hexaValue2 = Integer.parseInt(hexaValue[1]);
	    hexaValue[2] = hexaValue[2].trim();
		
		int hexaValue3 = Integer.parseInt(hexaValue[2]);
		System.out.println("la valeur est :  "+hexaValue[2]);
		
		String actualColor = String.format("#%02x%02x%02x", hexaValue1, hexaValue2, hexaValue3);
	Assert.assertEquals("#007bff", actualColor);
		System.out.println("The color of the text is: " +actualColor );
		
		driver.quit();

	}

}
