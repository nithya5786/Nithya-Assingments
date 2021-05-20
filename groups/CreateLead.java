package week5.groups;


import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseTest {

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
	
	@DataProvider(name="TestData")
public Object[][] fetchData() throws InvalidFormatException, IOException
	{
		
		String[][] data = ReadExcelForDataProvider.readExcelData("Create Lead");
		return data;
		
	}
	
	/*@DataProvider(name ="TestData")
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
	}*/
	}



