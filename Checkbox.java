package vjezba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		Assert.assertFalse(false);
		System.out.println(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		Assert.assertTrue(true);
		System.out.println(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
		
		
		
	}

}
