package week3.lead;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest

{
	
	
	ChromeDriver driver;
@BeforeMethod
public void loginSetup()
{
		
			WebDriverManager.chromedriver().setup();
		//Step 1:Launch chrome Browser
			driver =new ChromeDriver(); 
		//Step 2:URL load   
			driver.get("http://leaftaps.com/opentaps");
		//Step 3:Maximize
			driver.manage().window().maximize();
		//Step 4:Find the username and type the value
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Step 5:Find the password and type th  e value
			driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Step 6 :Find the Login button and click	
			driver.findElement(By.className("decorativeSubmit")).click();
		//Step 7: Verify logged in
			String text =driver.findElement(By.tagName("h2")).getText();
			System.out.println(text);
		//Step 8 :Click CRMSFA link	
			driver.findElement(By.linkText("CRM/SFA")).click();
		//Step 9:Click on Create Lead
			driver.findElement(By.linkText("Create Lead")).click();
			
}

			@AfterMethod
			public void tearDown() 
			
			{
				// Close the browser (Do not log out)
				driver.quit();
			}


}




