package VBANKWEB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.input.Input;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Make_a_Transfer_to_other_accounts {

	public static WebDriver driver;

	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://vbiz-dev.vfdbank.com");
		driver.findElement(By.xpath("(//button[@class='sc-iwyYcG dmnvNE'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='sc-dOSReg djhELM'])[1]")).sendKeys("Lanreola011@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[label='Log In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='sc-bYAVKt bckjlX'])[2]")).click();
	
		driver.findElement(By.xpath("(//button[@class='sc-iwyYcG dmnvNE'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='sc-fnMOsY htTLsw'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='sc-kVmgbL llQhLd'])[4]")).click();
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.xpath("(//button[@class='sc-iNqMTl fXLStt'])[5]")).isEnabled());
		//driver.findElement(By.xpath("(//div[@class='sc-hYAvag iJHUok'])[199]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-bUWkXR eDkyXB'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-iciFWK imoBCx'])[30]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-iciFWK imoBCx'])[32]")).click();
		driver.findElement(By.xpath("(//input[@class='sc-jvfriV kxdBff'])[2]")).sendKeys("Ecobank");
		driver.findElement(By.xpath("(//div[@class='sc-hYAvag ievNrp'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='currency'])[2]")).sendKeys("4861126097");
		//driver.findElement(By.xpath("(//input[@class='sc-dOSReg djhELM'])[4]")).sendKeys("500");
		System.out.println(driver.findElement(By.xpath("//div[@class='sc-hTZhsR cQSaWH']")).getText());
		driver.findElement(By.xpath("(//input[@type='currency'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@type='currency'])[2]")).sendKeys("2180009960");
		System.out.println(driver.findElement(By.xpath("(//button[@class='sc-iNqMTl daZeWR'])[6]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//div[@class='sc-jgHCyG eZqcrI']")).getText());
		driver.findElement(By.xpath("(//button[@class='sc-iNqMTl daZeWR'])[6]")).click();
		System.out.println(driver.findElement(By.xpath("(//tr[@class='sc-iQzcNf ivuoLF'])[2]")).getText());
		
		
		
		
		
		
		
	}

}
