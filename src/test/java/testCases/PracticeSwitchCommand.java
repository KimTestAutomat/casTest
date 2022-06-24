package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {
		// déclaration variables
		String driverPath = "src/test/resources/drivers/chromedriver.exe";
		String baseUrl = "https://demo.guru99.com/test/guru99home/";

		System.setProperty("webdriver.chrome.driver", driverPath);

		// open chrome driver
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// delete all cookies
		driver.manage().deleteAllCookies();

		// open URL app
		driver.get(baseUrl);

		// we are switching to the iFrame
		driver.switchTo().frame("a077aa5e");
		System.out.print(" ********* We are switching to the iFrame ******** ");
		WebElement pub = driver.findElement(By.xpath("html/body/a/img"));
		pub.click();
		
		//return to the parent frame 
		//driver.switchTo().parentFrame();
		
		
		driver.quit();

	}

}
