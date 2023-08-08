package week4dayone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestingNg1 {
@Test
	public void SalesForce() throws InterruptedException {
		// TODO Auto-generated method stub
long id = Thread.currentThread().getId();
System.out.println(id);
ChromeOptions opt = new ChromeOptions();
opt.addArguments("--disable-notifications");
ChromeDriver driver = new ChromeDriver(opt);
driver.get("https://login.salesforce.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
driver.findElement(By.id("password")).sendKeys("Leaf$1234");
driver.findElement(By.id("Login")).click();
driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
driver.findElement(By.xpath("//button[text()='View All']")).click();
driver.findElement(By.xpath("//p[text()='Sales']")).click();
driver.findElement(By.xpath("//span[text()='Opportunities']")).click();
driver.findElement(By.xpath("//div[@title='New']")).click();
driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Jegatha");
WebElement date = driver.findElement(By.xpath("(//input[@class='slds-input'])[3]"));
date.click();
date.sendKeys("8/8/2023");
Select findElement =new Select (driver.findElement(By.xpath("(//button[@role='combobox'])[1]")));
findElement.selectByIndex(3);
driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

	}

}