package testCases;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		// déclaration variables
				String driverPath = "src/test/resources/drivers/chromedriver1.exe";
				String baseUrl = "https://demo.guru99.com/test/upload/";

				System.setProperty("webdriver.chrome.driver", driverPath);

				// open chrome driver
				WebDriver driver = new ChromeDriver();

				// maximize browser
				driver.manage().window().maximize();

				// delete all cookies
				driver.manage().deleteAllCookies();

				// open URL app
				driver.get(baseUrl);
				
				
				//Upload file
				WebElement uploadFileButton = driver.findElement(By.id("uploadfile_0"));
				uploadFileButton.sendKeys("C:\\Users\\DELL\\Desktop\\Formation\\flower_noun_002_14403.jpg");
				
				driver.findElement(By.id("terms")).click();
				driver.findElement(By.id("submitbutton")).click();

				Thread.sleep(3000);
				String message = driver.findElement(By.xpath("//*[@id=\"res\"]")).getText();
				System.out.println("***************" + message + "*********");

				Assert.assertTrue(message.contains("1 file"));
				System.out.println("Pass");

				driver.quit();
				// Verify text appeared!
			/*
			        String[] split = result.split(" ");
			        for (int i=0; i<split.length; i++)
			        {   System.out.println(split[i]);
			         
			      //  System.out.println("Done");
			        
			    }
			        if (split[0].equals("1")) {
						System.out.println("Success!");
					} else {
						System.out.println("Fail!");
					} 
				*/
		//Assert.assertTrue(result.contains("1 file"));
		
				//Assert.assertEquals(result, "1 file\n has been successfully uploaded.");
				/*
			
			
				if (result.equals("1 file has been successfully uploaded.")) {
					System.out.println("Pass: source is dropped to target as expected!");
				} else {
					System.out.println("Fail: source could not be dropped to target as expected!");
				}
*/
				driver.quit();
			}
				
}


