package VBANKWEB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

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
		driver.findElement(By.xpath("(//button[@class='sc-iwyYcG dmnvNE'])[1]")).click();
	//invalid password
	/*	driver.findElement(By.xpath("(//input[@class='sc-dOSReg djhELM'])[1]")).sendKeys("Lanreola011@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Admin@12");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[label='Log In']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[class='sc-higXBA bYYIwB']")).getText());
		System.out.println(driver.findElement(By.cssSelector("div[class='sc-ehSCib kYuMkW']")).getText());
	    Assert.assertEquals(driver.findElement(By.cssSelector("div[class='sc-higXBA bYYIwB']")).getText(), "Failed to log in");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='sc-ehSCib kYuMkW']")).getText(), "Invalid credentials");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='sc-dOSReg ekynly'])[1]")).clear();
		driver.findElement(By.cssSelector("input[type='password']")).clear();
		//invalid email
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Lanreola011@gmail.co");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[label='Log In']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[class='sc-higXBA bYYIwB']")).getText());
		System.out.println(driver.findElement(By.cssSelector("div[class='sc-ehSCib kYuMkW']")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='sc-higXBA bYYIwB']")).getText(), "Failed to log in");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='sc-ehSCib kYuMkW']")).getText(), "Invalid credentials");
		*/
		//valid credentials
		driver.findElement(By.xpath("(//input[@class='sc-dOSReg djhELM'])[1]")).sendKeys("Lanreola011@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[label='Log In']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[class='sc-higXBA bYYIwB']")).getText());
		System.out.println(driver.findElement(By.cssSelector("div[class='sc-ehSCib kYuMkW']")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='sc-higXBA bYYIwB']")).getText(), "Success");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='sc-ehSCib kYuMkW']")).getText(), "You are logged in");
		
	}

}
