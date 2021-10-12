package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("Janet");
		driver.findElement(By.name("UserLastName")).sendKeys("Joshlina");
		driver.findElement(By.name("UserEmail")).sendKeys("test@gmail.com");
		new Select(driver.findElement(By.name("UserTitle"))).selectByValue("Sales_Manager_AP");
		driver.findElement(By.name("CompanyName")).sendKeys("Companyxyz");
		new Select(driver.findElement(By.name("CompanyEmployees"))).selectByValue("9");
		driver.findElement(By.name("UserPhone")).sendKeys("8608900404");
		driver.findElement(By.xpath("(//div[@class=\"checkbox-ui\"])[1]")).click();
	}

}
