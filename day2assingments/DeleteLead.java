package week2.day2assingments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException 
	{
		//Pre Condition 
		WebDriverManager.chromedriver().setup();
	//Step 1:Launch chrome Browser
		ChromeDriver driver =new ChromeDriver(); 
	//Step 2:URL load   
		driver.get("http://leaftaps.com/opentaps");
	//Step 3:Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Step 4:Find the username and type the value
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
	//Step 5:Find the password and type the value
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
	//Step 6 :Find the Login button and click	
		driver.findElement(By.className("decorativeSubmit")).click();
		
	//Step 7: Verify logged in
		String text =driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		
	//Step 8 :Click CRMSFA link	
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	//9.Click on Leads
		driver.findElement(By.linkText("Leads")).click();
		
	//10.Click on Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Thread.sleep(3000);
		        
	//11.Click on PhoneNumber
		driver.findElement(By.linkText("Phone")).click();
		
	//12.Enter Phone Number
		driver.findElement(By.name("phoneNumber")).sendKeys("123");
		
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
		 
		 driver.close();
	} 
	

	}


