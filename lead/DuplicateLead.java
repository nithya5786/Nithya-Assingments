package week3.lead;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends BaseTest {
@Test
	public  void DuplicateLe () throws InterruptedException {
						//10.Click on Find Leads
				driver.findElement(By.linkText("Find Leads")).click();
				
				//11.Click on Email
				driver.findElement(By.linkText("Email")).click();
				
				//12.Enter Email
				driver.findElement(By.name("emailAddress")).sendKeys("abc@gmail.com");
				
				//13.Click on Find Leads
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(2000);
				
				//14.Capture First Entry 
				String LeadName = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a")).getText();
				Thread.sleep(3000);
				
				//15.Click on First Entry
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
				
				//16.Click on Duplicate Lead
				driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
				
				//17.Verify The Title as Duplicate Lead
				String title = driver.getTitle();
				System.out.println(title);
				if(title.contains("Duplicate Lead")) {
					System.out.println("This page is Duplicate Lead");
					
				}
				else
				{
					System.out.println("The page title is not Duplicate Lead");
					
				}
				
				//18.Click on  create lead
				driver.findElement(By.name("submitButton")).click();
				
				//19.Verify the Duplicate created is same as Captured name
				String DuplicateName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
				if(LeadName.equals(DuplicateName))
				{
					System.out.println("Created Duplicate Name");
				}
				else
				{
					System.out.println("No Duplicate Created");
				}
				
				
				
				

	}

}
