package vjezba;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.cssSelector("[for='fromCity']")).click();
		WebElement source=driver.findElement(By.cssSelector("div[role='combobox'] > .react-autosuggest__input"));
		source.sendKeys("MUM");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
//		driver.findElement(By.cssSelector("[for='toCity']")).click();
		WebElement destination=driver.findElement(By.cssSelector("div[role='combobox'] > .react-autosuggest__input"));
		destination.sendKeys("del");
		Thread.sleep(2000);
		int i=0;
		for(i=0;i<3;i++) {
			destination.sendKeys(Keys.ARROW_DOWN);
		}
		destination.sendKeys(Keys.ENTER);
		
		Assert.assertFalse(false);
		
		
		
	}

}
