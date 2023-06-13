package VBANKWEB;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DashBoard {

	public static WebDriver driver;

	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String email = "Lanreola011@gmail.com";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://vbiz-dev.vfdbank.com");
		driver.findElement(By.xpath("(//button[@class='sc-iwyYcG dmnvNE'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='sc-dOSReg djhELM'])[1]")).sendKeys(email);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[label='Log In']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("(//span[@class='sc-iktFzd ejJeSh'])[1]")).getText() + " is the name of the account owner");
		System.out.println(driver.findElement(By.xpath("(//span[@class='sc-iktFzd Mpkjj'])[1]")).getText() + " is the name of the account owner");
		System.out.println(driver.findElement(By.cssSelector("div[class='sc-higXBA bYYIwB']")).getText());
		System.out.println(driver.findElement(By.cssSelector("div[class='sc-ehSCib kYuMkW']")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='sc-higXBA bYYIwB']")).getText(), "Success");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='sc-ehSCib kYuMkW']")).getText(),
				"You are logged in");
		System.out.println(driver.findElement(By.xpath("(//span[@class='sc-iktFzd dwKoPS'])")).getText() + " This is the current account balance of an account selected");
		driver.findElement(By.cssSelector("div[class='sc-kemFKM dbPbyL']")).click();
		driver.manage().timeouts().getImplicitWaitTimeout();
		driver.findElement(By.xpath("(//div[@class='sc-jLQRhj bIMsaj'])[2]")).click();
		driver.findElement(By.cssSelector("div[class='sc-kemFKM dbPbyJ']")).click();
		System.out.println(driver.findElement(By.xpath("(//span[@class='sc-iktFzd dwKoPS'])")).getText() + " This is the current account balance of the account selected");
		System.out.println(driver.findElement(By.xpath("(//div/button)[6]")).getText());
		driver.findElement(By.xpath("(//div/button)[6]")).click();
		driver.findElement(By.cssSelector("p[class='sc-epgtjm grgBve']")).click();
		System.out.println(driver.findElement(By.xpath("(//div/button)[6]")).getText() + " Before a particular year is selected");
		System.out.println(driver.findElement(By.xpath("(//div/button)[7]")).getText() + " This is the year selected");
		driver.findElement(By.xpath("(//div/button)[7]")).click();
		driver.findElement(By.xpath("//p[@class='sc-epgtjm Ovew'][2]")).click();
		System.out.println(driver.findElement(By.xpath("(//div/button)[7]")).getText() + " This is the year selected");
		driver.findElement(By.xpath("(//div/button)[6]")).click();
		driver.findElement(By.xpath("(//p[@class='sc-epgtjm Ovew'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("(//div/button)[6]")).getText() + " Before a particular month is selected");
		driver.findElement(By.xpath("(//div/button)[7]")).click();
		driver.findElement(By.xpath("(//p[@class='sc-epgtjm grgBve'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("(//div/button)[7]")).getText() + " This is the month selected");
		System.out.println(driver.findElement(By.xpath("(//span[@class='sc-iktFzd guzqNm'])[1]")).getText());
		System.out.println(driver.findElement(By.xpath("(//span[@class='sc-iktFzd kHAJoh'])[2]")).getText() + " This is the outflow balance");
		System.out.println(driver.findElement(By.xpath("(//span[@class='sc-iktFzd guzqNm'])[2]")).getText());
		System.out.println(driver.findElement(By.xpath("(//span[@class='sc-iktFzd jEdgKX'])[1]")).getText() + " This is the income balance");
		System.out.println(driver.findElement(By.xpath("//div[@class='sc-cYKZwy fOOtpV']")).getText() + " These are the Recent Transactions and their status");
		driver.findElement(By.xpath("//div[@class='sc-fLUVeN jOaQry']")).click();
		driver.findElement(By.xpath("//div[@class='sc-dCQIiZ jfFlPE']")).click();
		System.out.println(driver.findElement(By.xpath("//button[@class='sc-hZkHVu gpiJfi']")).getText());
		driver.findElement(By.xpath("//button[@class='sc-hZkHVu gpiJfi']")).click();
		driver.findElement(By.xpath("//p[@class='sc-epgtjm Ovew'][2]")).click();
		System.out.println(driver.findElement(By.xpath("//button[@class='sc-hZkHVu gpiJfi']")).getText());
		driver.findElement(By.xpath("//input[@class='sc-iyePXt dCjRdB']")).sendKeys("1001554966");
		driver.findElement(By.xpath("(//div[@class='sc-eGkixZ gHzZdG'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-bEgcJd hqVYQO'])[3]")).click();
		driver.findElement(By.xpath("//input[@class='sc-jvfriV kxdBff']")).click();
		driver.findElement(By.xpath("(//div[@class='sc-hYAvag iJHUok'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-EchRo iCblwv'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='sc-bgXrcJ tJqyO'])[5]")).getText());
		System.out.println(driver.findElement(By.xpath("(//div[@class='sc-bgXrcJ tJqyO'])[6]")).getText());
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();

	}

}
