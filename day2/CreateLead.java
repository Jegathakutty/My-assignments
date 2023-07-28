package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("SG");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jegatha");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Alaguraja");

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourc = new Select(source);
		sourc.selectByVisibleText("Employee");

		WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mark = new Select(market);
		mark.selectByValue("9001");


		WebElement  Indus= driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select Industry = new Select(Indus);
		Industry.selectByIndex(3);

		WebElement  Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select Own = new Select(Ownership);
		Own.selectByIndex(4);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7253004005");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jegathakutty@gmail.com");

		WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select Countr = new Select(Country);
		Countr.selectByVisibleText("India");
		Thread.sleep(3000);

		driver.findElement(By.name("submitButton")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		if(Title.contains("Lead | opentaps"))
		{
			System.out.println("We are in the right page");
		}else
		{
			System.out.println("We are not in the right page");
		}

	}

}
