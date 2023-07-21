package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SG Games");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jegatha");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Alaguraja");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jegathakutty@gmail.com");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7253004005");
driver.findElement(By.id("smallSubmit")).click();
		
		
}

}
