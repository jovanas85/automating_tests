package webShop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoblitz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zooblitz.at/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".cookie-permission--accept-button")).click();
//		Thread.sleep(7000);
		driver.findElement(By.cssSelector("[class] .product-slider--item:nth-of-type(2) [alt='Biokat´s Micro Classic']")).click();
//		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[name='In den Warenkorb']")).click();
		driver.findElement(By.cssSelector("li#acl-cart--flyout")).click();
//		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".table--actions:nth-of-type(2) .btn--checkout-proceed")).click();
//		Thread.sleep(3000);
		driver.findElement(By.cssSelector("select#register_personal_customer_type")).click(); 
		driver.findElement(By.cssSelector("[value='private']")).click(); 
		driver.findElement(By.cssSelector("select#salutation")).click();
		driver.findElement(By.cssSelector(".register--personal [value='ms']")).click();
		driver.findElement(By.cssSelector("input#firstname")).sendKeys("Renate");
		driver.findElement(By.cssSelector("input#lastname")).sendKeys("Sholtz");
		driver.findElement(By.cssSelector("input#register_personal_skipLogin")).click();
		driver.findElement(By.cssSelector("input#register_personal_email")).sendKeys("skoravajoca@gmail.com");
		driver.findElement(By.cssSelector("input#street")).sendKeys("Fleishmarkt 20");
		driver.findElement(By.cssSelector("input#zipcode")).sendKeys("1011");
		driver.findElement(By.cssSelector("input#city")).sendKeys("Wien");
//		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".register--action [name]")).click();
		
		driver.close();
	}

}
