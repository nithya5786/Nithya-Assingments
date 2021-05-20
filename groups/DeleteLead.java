package week5.groups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead extends BaseTest {
@Test(dataProvider="TestData")
   
	public  void DeleteLe(String phoneNumber) throws InterruptedException {
	
	driver.findElement(By.linkText("Leads")).click();
	
	//10.Click on Find Leads
	
	
	driver.findElement(By.linkText("Find Leads")).click();
	//Thread.sleep(3000);
	        
//11.Click on PhoneNumber
	driver.findElement(By.linkText("Phone")).click();
	
//12.Enter Phone Number
	driver.findElement(By.name("phoneNumber")).sendKeys(phoneNumber);
	
//13.Click on Find Leads
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(3000);
	
//14.Accumulate Lead  ID of first result
	String LeadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).getText();
	
//15.Click on the first lead
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
	Thread.sleep(3000);
	
//16.Click Delete
	driver.findElement(By.linkText("Delete")).click();
	//Thread.sleep(3000);
	
//17.Click on Find Leads
	//driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	//Thread.sleep(3000);
	
//18.Enter the deleted lead id accumulated 	
	driver.findElement(By.name("id")).sendKeys(LeadId);
	
//19.Click on Find Lead
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	Thread.sleep(3000);
	
//19.Verify if message "No records to display" is seen 
	 String Text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	 System.out.println(Text);
	 if(Text.contains("No records to display")) {
		 System.out.println("Lead is deleted");
	 }
	 else
	 {
		 System.out.println("Lead is not deleted");
	 }
	 
 
				 
			

	}


@DataProvider(name="TestData")
public Object[][] fetchData() throws InvalidFormatException, IOException
{
	
	String[][] data = ReadExcelForDataProvider.readExcelData("Delete Lead");
	return data;
	
}
}
