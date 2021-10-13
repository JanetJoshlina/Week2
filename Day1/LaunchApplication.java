package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Janet");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Joshlina");
		new Select(driver.findElement(By.id("createLeadForm_dataSourceId"))).selectByValue("LEAD_DIRECTMAIL");
		new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId"))).selectByValue("9002");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Janet");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Joshlina");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("level1");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/10/1887");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("commerce");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("20000000");
		new Select(driver.findElement(By.id("createLeadForm_industryEnumId"))).selectByValue("IND_HEALTH_CARE");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("900");
		new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId"))).selectByValue("OWN_PARTNERSHIP");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("008");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("description");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Note");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("900098");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8608900404");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("commerce");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Company@test.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https:testleaf.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("name");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("attname");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("address1");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("address2");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("tamilnadu");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600119");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}
}
