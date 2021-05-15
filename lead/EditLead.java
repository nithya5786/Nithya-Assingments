package week3.lead;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseTest {
@Test
	public  void EditLe() throws InterruptedException {
						// 10.Click on Find Leads
				driver.findElement(By.linkText("Find Leads")).click();

				// 11.Enter First name
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Nithya");

				// 12.Click on Find Leads
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

				Thread.sleep(3000);
				// 13.Click on first Contact
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();

				// 14.Verify Title of the page
				String Title = driver.findElement(By.xpath("//div[text()='View Lead']")).getText();
				System.out.println(Title);

				String OldName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				String Old = OldName.replaceAll("[^a-zA-Z]", " ");
				System.out.println("Old name is -" + Old);

				// 15.Click on Edit Button
				driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();

				// 16.Clear Company Name
				driver.findElement(By.id("updateLeadForm_companyName")).clear();

				// 17.Edit Company Name
				driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TF1");

				// 18.Click on Update Button
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();

				// 19.Verify Updated Company Name
				String UpdateName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				String CompanyName = UpdateName.replaceAll("[^a-zA-Z]", " ");
				System.out.println("Company Name  Updated to -" + CompanyName);

				if (Old.equals(CompanyName)) {
					System.out.println("Lead got updated and both the company names are same ");

				} else {
					System.out.println("Lead is Updated");
				}
				driver.close();
			

	}

}
