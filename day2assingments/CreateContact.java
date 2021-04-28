package week2.day2assingments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
				
			// 9.Click Contact
				driver.findElement(By.linkText("Contacts")).click();
				
			//10.Click on Create Contact
				driver.findElement(By.linkText("Create Contact")).click();
				
			//11.Fill the First name
				driver.findElement(By.id("firstNameField")).sendKeys("test");
				
			//12.Fill the Last name
				driver.findElement(By.id("lastNameField")).sendKeys("leaf");
			 
			//13.Fill the Firstname local
				driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("T");
				
			//14.Fill the Lastname local
				driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("L");
				
			//15.Department Name
				driver.findElement(By.id("createContactForm_departmentName")).sendKeys("QA");
				
			//16.Description
				driver.findElement(By.id("createContactForm_description")).sendKeys("Testing");
				
			//17.Email
				driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
				
			//18.State Province
				WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")); 
			    Select dd1 =new Select(state);
				dd1.selectByVisibleText("New York");
				
			//19.Click on Create Contact
				driver.findElement(By.name("submitButton")).click();
				
			//20.Click on Edit 
				driver.findElement(By.linkText("Edit")).click();
				
			//21.Clear Description
				//driver.findElement(By.id("createContactForm_description")).clear();
				driver.findElement(By.id("updateContactForm_description")).clear();
				
			//22.Add Important Note
				driver.findElement(By.id("updateContactForm_description")).sendKeys("Testqa");
				
			//24.Click on Update	
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				
			//25.Get The Title of the Resulting Page
				String Title = driver.getTitle();
				System.out.println(Title);
				
				
				
				
				
				
			
				
			

	}

}
