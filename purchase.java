package webShop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class purchase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();
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
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1300);");
		
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[data-url] .en_mdl_product--in-view:nth-of-type(3) .en_mdl_product__image--default")).click();
		driver.findElement(By.cssSelector(".mdl_article_detail__button")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".notification__section.notification__section--left a")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".en_hidden_medium_down")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".mdl_checkout_process_header__button")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".mdl_checkout_process_header__button")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.findElement(By.cssSelector(".article_label")).getText(), "DSQUARED 2");
		driver.findElement(By.cssSelector("[title='Artikel löschen']")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector(".en_spacer_bottom_small")).getText(), "Der Warenkorb ist leer.");
		driver.close();
		
	}

}
