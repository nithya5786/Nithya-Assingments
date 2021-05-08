package week4.day1assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) 
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
			//Step 5:Find the password and type th  e value
				driver.findElement(By.id("password")).sendKeys("crmsfa");
			//Step 6 :Find the Login button and click	
				driver.findElement(By.className("decorativeSubmit")).click();
			//Step 7: Verify logged in
				String text =driver.findElement(By.tagName("h2")).getText();
				System.out.println(text);
			//Step 8 :Click CRMSFA link	
				driver.findElement(By.linkText("CRM/SFA")).click();
			//Step 9:Click on contacts
				driver.findElement(By.linkText("Contacts")).click();
			//Step 10:Click on Merge Contacts
				driver.findElement(By.linkText("Merge Contacts")).click();
			//Step 11:Click on From Contacts
				driver.findElement(By.xpath("//span[text()='From Contact']//following::img")).click();
			//Step 12:Window Handles
				Set<String> allWindows =driver.getWindowHandles();
				List<String> listOfWindows = new ArrayList<String>(allWindows);
			//Step 13:Move to "From Contact" window
				driver.switchTo().window(listOfWindows.get(1));
			//Step 14:Select the first contact
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
			//Step 15:Switch to parent windows
				driver.switchTo().window(listOfWindows.get(0));
			//Step 16:Click on To Contacts
				driver.findElement(By.xpath("//span[text()='To Contact']//following::img")).click();
			//Step 17:Window Handles for "To Contact" and move to "To Contact" window
				allWindows =driver.getWindowHandles();
				listOfWindows = new ArrayList<String>(allWindows);	
				driver.switchTo().window(listOfWindows.get(1));
			//Step 18:Select the second Contact from the list
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
			//Step 19:Switch to parent windows
				driver.switchTo().window(listOfWindows.get(0));
			//Step 20:Click on Merge Contact
				driver.findElement(By.xpath("//a[text()='Merge']")).click();
			//Step 21:Accept Alert
				Alert alert =driver.switchTo().alert();
				alert.accept();
			//Step 22:Confirm the Title 	
				System.out.println(driver.getTitle());
				
				
				
				
				
		    
				
				
				
				

	}

}
