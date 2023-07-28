package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");

        driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Henderson");
       driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Vegas");
        driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("10000");
        WebElement Industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
        Select Ind = new Select(Industry);
        Ind.selectByIndex(3);
        WebElement Ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
        Select Own = new Select(Ownership);
        Own.selectByVisibleText( "S-Corporation");
     WebElement Source = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
        Select Sor = new Select(Source);
        Sor.selectByValue("LEAD_EMPLOYEE");
       WebElement Market =driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
       Select Mar = new Select(Market);
       Mar.selectByIndex(6);
       WebElement State = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
       Select St = new Select(State);
       St.selectByValue("TX");
        driver.findElement(By.className("smallSubmit")).click();
      
       
       
    		   
	}



	}


