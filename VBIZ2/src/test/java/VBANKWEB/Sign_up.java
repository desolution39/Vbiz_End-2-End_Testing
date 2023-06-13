package VBANKWEB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sign_up {

	public static WebDriver driver;
@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Email = "Lanreola011@gmail.com";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://vbiz-dev.vfdbank.com");
		driver.findElement(By.xpath("(//button[@class='sc-iwyYcG dmnvNE'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[4]")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='sc-gUUzQN duHF'][1]")).getText());
		System.out.println(driver.findElement(By.xpath("//p[@class='sc-gUUzQN duHF'][2]")).getText());
		System.out.println(driver.findElement(By.xpath("//p[@class='sc-gUUzQN duHF'][3]")).getText());
		System.out.println(driver.findElement(By.xpath("//p[@class='sc-gUUzQN duHF'][4]")).getText());
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		// Thread.sleep(20);
		// driver.switchTo().activeElement().click();
		System.out.println(driver.findElement(By.cssSelector("button[type='button']")).isEnabled());
		driver.findElement(By.xpath("//input[@type='currency']")).sendKeys("22241006154");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("45678899900");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Solex@yopmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("99000");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("09029241830");
		driver.findElement(By.xpath("//input[@class='sc-jvfriV kxdBff']")).click();
		driver.findElement(By.xpath("(//div)[24]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("button[type='button']")).isEnabled());
		driver.findElement(By.cssSelector("button[type='button']")).click();
		Thread.sleep(5000);
		// driver.switchTo().alert().getText();
		// driver.switchTo().alert().dismiss();

		

	}

}
