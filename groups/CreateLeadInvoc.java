package week5.groups;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLeadInvoc extends BaseTest {
	
	@Test(invocationCount=3)
	public  void CreateLe(String companyname,String username,String lastname  ) 
	{
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		
	//Step 11:Enter First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(username);
		
	//Step 12:Enter LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		
		//Click CreateLead
		driver.findElement(By.className("smallSubmit")).click();

		
	
	}


}
