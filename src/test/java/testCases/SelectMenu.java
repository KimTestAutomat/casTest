package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenu {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver1.exe");

		// open chrome driver
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open URL app
		driver.get("https://demoqa.com/select-menu/");
		
        // Select Class
		Select dropDownList = new Select(driver.findElement(By.id("oldSelectMenu")));
		//dropDownList.selectByIndex(0);
		// dropDownList.selectByValue("4");
		dropDownList.selectByVisibleText("Blue");

	}

}
