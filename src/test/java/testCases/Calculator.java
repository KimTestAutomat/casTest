package testCases;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calculator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://juliemr.github.io/protractor-demo/");
		driver.manage().deleteAllCookies();

		WebElement field1 = driver.findElement(By.xpath("//*[@ng-model=\"first\"]"));
		WebElement field2 = driver.findElement(By.xpath("//*[@ng-model=\"second\"]"));
		field1.sendKeys("5");
		field2.sendKeys("9");
		driver.findElement(By.id("gobutton")).click();

		WebElement result = driver.findElement(By.tagName("h2"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Pattern pattern = Pattern.compile("\\d+");
		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));
		System.out.println("The result is: " + result.getText());
		driver.quit();
	}

}
