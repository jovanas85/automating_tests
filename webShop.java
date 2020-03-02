package webShop;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class webShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kastner-oehler.at/");
		driver.findElement(By.cssSelector("[data-action='confirm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".en_header__desktop [data-slide-next-class='toggle']")).click();
		String text = "skoravajoca@gmail.com";
		driver.findElement(By.id("login_0_user")).sendKeys(text);
		String pass = "Selenium123";
		driver.findElement(By.id("login_0_pass")).sendKeys(pass);
		driver.findElement(By.id("login_button_1")).click();
		Thread.sleep(7000);
		Assert.assertEquals(driver.findElement(By.cssSelector("ul:nth-of-type(3)  .head.trigger")).getText(), "Mein Konto");
		System.out.println(driver.findElement(By.cssSelector("ul:nth-of-type(3)  .head.trigger")).getText());
		driver.close();
		
		
		
		
	}

}
