package week5.groups;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadData extends BaseTest
{
	@Test(dataProvider ="TestData")
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
	@DataProvider(name ="TestData")
	public Object[][] fetchData()
	{
		String[][] data =new String[2][3];
		data[0][0]="TestLeaf";
		data[0][1]="Nithya";
		data[0][2] ="Ravi";
		
		data[1][0]="Infosys";
		data[1][1]="Ravi";
		data[1][2]="Shankar";
		return data;
	}

}
