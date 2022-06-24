package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {

	public static void main(String[] args) {
		
	        	//  variables declaration
				String driverPath = "src/test/resources/drivers/chromedriver.exe";
				String baseUrl = "https://demoqa.com/browser-windows";

				System.setProperty("webdriver.chrome.driver", driverPath);

				// open chrome driver
				WebDriver driver = new ChromeDriver();

				// maximize browser
				driver.manage().window().maximize();

				// delete all cookies
				driver.manage().deleteAllCookies();

				// open URL app
				driver.get(baseUrl);
				
				//store and print the name of the first window
				String firstWindow = driver.getWindowHandle();
				System.out.println(firstWindow);
				
				//click on the button "new window message"
				WebElement newWindowMessageButton = driver.findElement(By.id("messageWindowButton"));
				newWindowMessageButton.click();
				
		       //store and print of all open windows
				Set<String> handles = driver.getWindowHandles();
				System.out.println(handles);
				
				//pass a window handle to another window
				for(String handle1 :driver.getWindowHandles() ) {
					driver.switchTo().window(handle1);
					System.out.println(handle1);
				}
				
	}

}
