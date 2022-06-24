package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// open chrome driver
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open URL app
		driver.get("https://demoqa.com/droppable/");

		// instantiate Class Action
		Actions actions = new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(from, to).perform();

		// Verify text changed in to dropped!
		String textTo = to.getText();
		if (textTo.equals("Dropped!")) {
			System.out.println("Pass: source is dropped to target as expected!");
		} else {
			System.out.println("Fail: source could not be dropped to target as expected!");
		}

		driver.quit();
	}

}
