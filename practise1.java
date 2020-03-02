package vjezba;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise1 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.cssSelector("#Adults")).click();
		driver.findElement(By.cssSelector("#Adults")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("#Childrens")).click();
		driver.findElement(By.cssSelector("#Childrens")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("#DepartDate")).click();
		driver.findElement(By.cssSelector("td:nth-of-type(1) > .ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("MoreOptionsLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("#homeErrorMessage")).getText());
		driver.close();
	}

}
