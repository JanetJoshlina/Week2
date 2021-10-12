package week2.day1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click(); 
		driver.findElement(By.name("firstname")).sendKeys("Janet");
		driver.findElement(By.name("lastname")).sendKeys("Joshlina");
		driver.findElement(By.name("reg_email__")).sendKeys("8608900404");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password");
		new Select(driver.findElement(By.id("day"))).selectByValue("4");
		new Select(driver.findElement(By.id("month"))).selectByValue("10");
		new Select(driver.findElement(By.id("year"))).selectByValue("1974");
		driver.findElement(By.xpath("(//input[@name=\"sex\"])[1]")).click();
	}

}
