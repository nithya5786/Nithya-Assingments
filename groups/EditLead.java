package week5.groups;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseTest {
//@Test(groups="Sanity",dependsOnGroups = "Smoke")
	@Test(dataProvider ="TestData")
	public  void EditLe(String username,String companyname) throws InterruptedException {
				
		        driver.findElement(By.linkText("Leads")).click();
		        //Click on Find Leads
				driver.findElement(By.linkText("Find Leads")).click();
				//Enter First name
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(username);
                // Click on Find Leads
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
              	Thread.sleep(3000);
				// Click on first Contact
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
				// Verify Title of the page
				String Title = driver.findElement(By.xpath("//div[text()='View Lead']")).getText();
				System.out.println(Title);
				String OldName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				String Old = OldName.replaceAll("[^a-zA-Z]", " ");
				System.out.println("Old name is -" + Old);
				// Click on Edit Button
				driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
				// Clear Company Name
				driver.findElement(By.id("updateLeadForm_companyName")).clear();
				// Edit Company Name
				driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyname);
				// Click on Update Button
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				//Verify Updated Company Name
				String UpdateName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				String CompanyName = UpdateName.replaceAll("[^a-zA-Z]", " ");
				System.out.println("Company Name  Updated to -" + CompanyName);
				if (Old.equals(CompanyName)) {
					System.out.println("Lead got updated and both the company names are same ");
				} else {
					System.out.println("Lead is Updated");
				}
				}
			
				@DataProvider(name="TestData")
				public Object[][] fetchData() throws InvalidFormatException, IOException
				{
					
					String[][] data = ReadExcelForDataProvider.readExcelData("Edit Lead");
					return data;
					
				}
				

	}


