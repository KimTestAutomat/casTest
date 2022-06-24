package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeriCol {

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
		
		System.out.println(color); /// tatla3 bel rgba(255,0,0,1) hek aleh ahna bch n9asmouha b split look down
		
		String[] hexaValue = color.replace("rgba(", "").replace(")", "").split(", ");
		//3mal lista mta3 stringes w samaha hexavalue 7att fiha el rgba eli jbedha fi variable color w bda ibadal feha
		//awel 7aja na77a rgba( w 7att fi blassetha chey "" juste na77aha eliminé w zed na77a parenthèse lekher belkol w 7at fi blastou chey ""
		//donc kanet haka rgba(255,0,0,1) walatelna haka 255,0,0,1 wmba3d bc i7ot kol valeur mel parenthèse fi lista ki 3mal split bel virgule walewt lista feha 255 0 0 1
		
		
		
		int hexaValue0 = Integer.parseInt(hexaValue[0]);// ja lel case loula hexavalue[0] 7atha fi variable hexavalue0 w déclarée int hek aleh parseha lel int
		System.out.println("la valeur de la prémière case est :  "+hexaValue[0]);

		
		
		hexaValue[1] = hexaValue[1].trim();
		System.out.println("la valeur de la deuxième case  est :  "+hexaValue[1]);
		
		
		int hexaValue1 = Integer.parseInt(hexaValue[1]);
	    hexaValue[2] = hexaValue[2].trim();
		
	    
	    
		int hexaValue2 = Integer.parseInt(hexaValue[2]);
		System.out.println("la valeur de la troisième valeur est :  "+hexaValue[2]);
		
		
		
		String actualColor = String.format("#%02x%02x%02x", hexaValue0, hexaValue1, hexaValue2);
		//3mal déclaration l variable actualColor de type String 
		
	Assert.assertEquals("#ff0000", actualColor);
		System.out.println("The color of the text is: " +actualColor );
		
		
		
		driver.quit();
	}

}
