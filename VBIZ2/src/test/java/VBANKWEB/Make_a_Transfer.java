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

public class Make_a_Transfer {

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
		driver.findElement(By.xpath("(//input[@class='sc-dOSReg djhELM'])[1]")).sendKeys("Lanreola011@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[label='Log In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='sc-bYAVKt bckjlX'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='sc-iwyYcG dmnvNE'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='sc-jvfriV kxdBff'])[1]")).click();  
		driver.findElement(By.xpath("(//div[@class='sc-hJJQhR iromvB'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='sc-jvfriV kxdBff'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("(//button[@class='sc-iNqMTl fXLStt'])[2]")).isEnabled());
		driver.findElement(By.xpath("(//div[@class='sc-hJJQhR iromvB'])[3]")).click();
		driver.findElement(By.cssSelector("input[type='currency']")).sendKeys("1000");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Thanks for the test");
		System.out.println(driver.findElement(By.xpath("(//button[@class='sc-iNqMTl daZeWR'])[5]")).isEnabled());
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[@class='sc-iktFzd dwKoPS']")).getText());
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("3");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("3");
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("3");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("4");
		
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		
		System.out.println(driver.findElement(By.xpath("(//span[@class='sc-iktFzd jSTaBT'])[1]")).getText());
		System.out.println(driver.findElement(By.xpath("(//span[@class='sc-iktFzd jSTaBT'])[2]")).getText());
		System.out.println(driver.findElement(By.xpath("(//span[@class='sc-iktFzd jSTaBT'])[3]")).getText());
		
		
		
		
		
		
	}

}
