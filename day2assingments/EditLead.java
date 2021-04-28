package week2.day2assingments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// Pre Condition
		WebDriverManager.chromedriver().setup();
		// Step 1:Launch chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// Step 2:URL load
		driver.get("http://leaftaps.com/opentaps");
		// Step 3:Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Step 4:Find the username and type the value
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// Step 5:Find the password and type the value
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Step 6 :Find the Login button and click
		driver.findElement(By.className("decorativeSubmit")).click();

		// Step 7: Verify logged in
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);

		// Step 8 :Click CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// 9.Click on Leads Link
		driver.findElement(By.linkText("Leads")).click();

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
