package webShop;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Method;

import org.testng.annotations.Test;
import webShop.helperClass;

public class zahlungO1 extends helperClass{

	public static void main(String[] args) throws InterruptedException {
		startTest();
		zahlung(null);
		
	}
		
	public static void zahlung (WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.cssSelector(".confirm--outer-container .actions--bottom:nth-child(3) .is--icon-right")).click();
		driver.findElement(By.cssSelector("[name='dateOfBirth']")).sendKeys("25.11.1995");
		driver.findElement(By.cssSelector("[name='phoneNumber']")).sendKeys("065874145");
		driver.findElement(By.cssSelector("#purchase-approval__footer-button-wrapper")).click();
		WebDriverWait w= new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("cssSelector")));
		
		
}
}
