package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

		// Open Chrome Driver

		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximize Browser
		driver.manage().window().maximize();

		// Open url application
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement userName = driver.findElement(By.id("txtUsername"));

		String attValue = userName.getAttribute("id");
		System.out.println("The id attribute is:" + attValue);
		userName.clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement passWord = driver.findElement(By.id("txtPassword"));
		Dimension dimension = passWord.getSize();
		System.out.println("Hight:" + dimension.height);
		System.out.println("Hight:" + dimension.width);

		Point point = passWord.getLocation();
		System.out.println("X cordinate:" + point.x);
		System.out.println("Y cordinate:" + point.y);

		
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		btnLogin.click();
		
		// Verifier si le boutton login affiché vrai/faux
		boolean status = btnLogin.isDisplayed();
		System.out.println(status);

		// Verifier si le boutton login activé vrai/faux
		boolean status1 = btnLogin.isEnabled();
		System.out.println(status1);

		// Verifier si le boutton login existe
		List<WebElement> login = driver.findElements(By.id("btnLogin"));
		if (login.size() != 0) {
			System.out.println("Login button exist");

		} else {
			System.out.println("Login button does not exist");
		}
	}

}
