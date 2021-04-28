package week2.day2assingments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// 1.Launch URL
		// Pre Condition
		WebDriverManager.chromedriver().setup();
		// Step 1:Launch chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// Step 2:URL load
		driver.get("http://leaftaps.com/opentaps");
		// Step 3:Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// 2.Enter UserName
		// label[text()='Username']
		
		//3.Enter Password
		//label[text()='Password']
		
		//4.Click Login
		//input[@value='Login']
		
		//5.Click on CRMSFA link
		//div[@for="crmsfa"]/a
		//div[@for='crmsfa']//a[1]
		
		//6.Click on Leads
		//a[text()='Leads']
		
		//7.Click Merge Leads
		//a[text()='Merge Leads']
		
		//8.Click on First Image Icon
		// (//img[@src='/images/fieldlookup.gif'])[1]
		
		//9.Click on Second Image Icon
		// (//img[@src='/images/fieldlookup.gif'])[2]
				
		//10.Click on second resulting Lead
		 // (//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]
		
		//11.Click on Merge Button
		//a[text()='Merge']
		
		//12.Get the company name based on label
		// driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		
		

	}

}
