package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;


public class VerifyColor {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver1.exe");

		// Open chrome navigator
		WebDriver driver = new ChromeDriver();

		// Maximize Browser
		driver.manage().window().maximize();

		// Open URL application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		// Get color element
		String color = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/span")).getCssValue("color");
		String[] hexaValue = color.replace("rgba(", "").replace(")", "").split(", ");
		
		int hexaValue1 = Integer.parseInt(hexaValue[0]);
		System.out.println("la valeur est :  "+hexaValue[0]);

		hexaValue[1] = hexaValue[1].trim();
		System.out.println("la valeur est :  "+hexaValue[1]);
		int hexaValue2 = Integer.parseInt(hexaValue[1]);
	    hexaValue[2] = hexaValue[2].trim();
		
		int hexaValue3 = Integer.parseInt(hexaValue[2]);
		System.out.println("la valeur est :  "+hexaValue[2]);
		
		String actualColor = String.format("#%02x%02x%02x", hexaValue1, hexaValue2, hexaValue3);
	Assert.assertEquals("#ff0000", actualColor);
		System.out.println("The color of the text is: " +actualColor );
		
		driver.quit();
		
	}

}
