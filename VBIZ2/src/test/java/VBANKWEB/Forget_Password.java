package VBANKWEB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Forget_Password {

	
	public static WebDriver driver;
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Email = "Lanreola011@gmail.com";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://vbiz-dev.vfdbank.com/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/div/span")).click();
		System.out.println(driver.findElement(By.cssSelector("span[class='sc-iktFzd fwHiQD']")).getText());
		System.out.println(driver.findElement(By.cssSelector("span[class='sc-iktFzd kpppLK']")).getText());
		System.out.println(driver.findElement(By.cssSelector("button[class='sc-iNqMTl fXLStt']")).isEnabled());
		//Assert.assertEquals((driver.findElement(By.cssSelector("button[class='sc-iNqMTl fXLStt']")).isEnabled()), "true");
		driver.findElement(By.xpath("//input[@class='sc-dOSReg djhELM']")).sendKeys("Solex@yopmail.com");
		System.out.println(driver.findElement(By.cssSelector("button[class='sc-iNqMTl daZeWR']")).isEnabled());
		//Assert.assertEquals((driver.findElement(By.cssSelector("button[class='sc-iNqMTl daZeWR']")).isEnabled()), "false");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset password']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[class='sc-higXBA bYYIwB']")).getText());
		System.out.println(driver.findElement(By.cssSelector("div[class='sc-ehSCib kYuMkW']")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='sc-higXBA bYYIwB']")).getText(), "Error");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='sc-ehSCib kYuMkW']")).getText(), "User does not exist");
		
		//System.setProperties()
	}

}
