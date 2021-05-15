package week3.lead;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseTest {
@Test
	public  void CreateLe() 
	{
			//Step 10:Enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		
	//Step 11:Enter First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithya");
		
	//Step 12:Enter LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
		
		WebElement eleDropDown1 =driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 =new Select(eleDropDown1);
		dd1.selectByVisibleText("Partner");
		
		//13.First Name -Local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nithya1");
		
		//14.Salutation
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		
		//15.Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QA");
		
		//Annual Revenue
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1200000");
		
		//Industry
		WebElement eleDropDown2 =driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2 = new Select(eleDropDown2);
		dd2.selectByVisibleText("Computer Software");
		
		//OwnerShip
		WebElement eleDropDown3 =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	   Select dd3 =new Select(eleDropDown3);
		dd3.selectByVisibleText("Corporation");
		
		//Sic Code
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234");
		
		//Marketing Campaign
		WebElement eleDropDown4 =driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd4 =new Select(eleDropDown4);
		dd4.selectByVisibleText("eCommerce Site Internal Campaign");
		
		//LastName Local
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("R");
		
		//BirtDate
		driver.findElement(By.name("birthDate")).sendKeys("05/07/1986");
		
		//Department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		
		//Currency
		WebElement eleDropDown5 =driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dd5 =new Select(eleDropDown5);
		dd5.selectByVisibleText("INR - Indian Rupee");
		
		//Number Of Employees
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50000");
		
		//Ticker Symbol
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("NA");
		
		//Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Global Company");
		
		//Important Note			
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Training");
		
		//Country Code
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		
		//Area Code
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		
		//Phone Number
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2435678");
		
		//Extension
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("112");
		
		//Person To Ask For
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Nithya");
		
		//E-Mail Address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nithyaiyer5786@gmail.com");
		
		//Web Url
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com");
		
		//To Name
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Nithya");
		
		//Attention Name
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Nithya");
		
		//Address Line 1	
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Mylapore");

		//Address Line 2	
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Chennai");
		
		//City
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		
		//Country
		WebElement eleDropDown6 =driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd6 =new Select(eleDropDown6);
		dd6.selectByVisibleText("India");
		
		//Zip/Postal Code	
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600004");
		
		//Zip/Postal Code Extension	
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600004");
		
		//State/Province
		WebElement eleDropDown7 =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd7 =new Select(eleDropDown7);
		dd7.selectByVisibleText("TAMILNADU");
		
		//Click CreateLead
		driver.findElement(By.className("smallSubmit")).click();
		
		//Duplicate Lead		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//Clear Current Company Name
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		//Update with new name
		String updatedCompanyName="Wipro";
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(updatedCompanyName);
		System.out.println(updatedCompanyName);
		
		//Click CreateLead
		driver.findElement(By.className("smallSubmit")).click();
		
		
		//Verify if the Duplicate Name is Updated
		
		String Currentcompanyname=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String updatedname=Currentcompanyname.replaceAll("[^a-zA-Z]", " ");
		System.out.println(updatedname);
		if(updatedname.contains(updatedCompanyName))
			System.out.println("Duplicate lead name updated");
		else
			System.out.println("Error with duplicate value");

	
	}
	}


