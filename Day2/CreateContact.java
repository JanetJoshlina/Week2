package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Janet");
		driver.findElement(By.id("lastNameField")).sendKeys("Joshlina");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Janet");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Joshlina");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("department");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Descrption");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("test@gmail.com");
		new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"))).selectByValue("NY");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Notes");
		driver.findElement(By.xpath("(//input[@class=\"smallSubmit\"])[1]")).click();
		System.out.println(driver.getTitle());
	}
}
