package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DublicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Leaftaps"))
		{
			System.out.println("We are in Right Page");
		}
		else
		{
			System.out.println("We are in Wrong Page");
		}
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']/parent::span")).click();
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='emailAddress']")).sendKeys("jegathakutty@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String Duplicate = driver.findElement(By.xpath("//a[text()='13204']")).getText();
		System.out.println(Duplicate);
		driver.findElement(By.xpath("//a[text()='13204']")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String DubPage = driver.getTitle();
		System.out.println(DubPage);
		driver.findElement(By.linkText("Create Lead")).click();
		String Dublead = driver.findElement(By.id("createLeadForm_firstName")).getText();
		System.out.println(Dublead);
		if (Dublead.equals(Duplicate))
		{
			System.out.println("Lead name is verified");
		}
			else
			{
				System.out.println("Lead name is Dublicate");
				driver.close();
			}
		}
	}


