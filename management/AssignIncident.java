package incident.management;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignIncident {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Open ServiceNow
		driver.get("https://dev103117.service-now.com/navpage.do");

		driver.switchTo().frame(0);
        
		//Login
		driver.findElement(By.id("user_name")).sendKeys("admin");

		driver.findElement(By.id("user_password")).sendKeys("India@123");

		driver.findElement(By.id("sysverb_login")).click();
        
		//Enter Incident in filter navigator and press enter"
		WebElement incident = driver.findElement(By.id("filter"));
		incident.sendKeys("Incident");
		incident.sendKeys(Keys.ENTER);

      // Search for the existing incident and click on the incident

		driver.findElement(By.xpath("//div[text()='Open']")).click();
		driver.switchTo().frame(0);

		Thread.sleep(2000);
		WebElement searchIncident = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchIncident.click();
		searchIncident.sendKeys("INC0011018");
		searchIncident.sendKeys(Keys.ENTER);
		
        Thread.sleep(2000);
		
		WebElement number = driver.findElement(By.xpath("//a[@class='linked formlink']"));
	    System.out.println("Incident Number: " + number.getText());
		System.out.println(" ");
		number.click();
		

		//5. Assign the incident to  Software group

		// driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']//span[1]")).click();

		driver.findElement(By.id("lookup.incident.assignment_group")).click(); // Lookup using List

		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("WindowHandling: " + allWindowHandles.size());
		List<String> lstWindowHandles = new ArrayList<String>(allWindowHandles);
		System.out.println(" ");

		// Switch to sub-window
		driver.switchTo().window(lstWindowHandles.get(1));
		
		//WebElement assignGroup = driver.findElement(By.xpath("(//label[text()='Search'])[2]/following::input"));
		WebElement assignGroup = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		assignGroup.sendKeys("Software");
		assignGroup.sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Software")).click();
		

		
		//driver.switchTo().frame(0);
        //driver.switchTo().defaultContent();
		
		        // Update the incident with Work Notes
        driver.switchTo().window(lstWindowHandles.get(0));
		//WebElement iframe = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(0);
		
					

		WebElement workPost =driver.findElement(By.id("activity-stream-comments-textarea"));
		workPost.sendKeys("Updating incident with software group assignment");
		driver.findElement(By.xpath("//button[text()='Post']")).click();
		driver.findElement(By.id("sysverb_update_bottom")).click();
		

		
		
		//Verification after the assignment
		String assignedGroup=driver.findElement(By.id("sys_display.incident.assignment_group")).getAttribute("value");
        if(assignedGroup.equals("Software"))
        {
        	System.out.println("Incident Assigned");
        	driver.close();
        	
        }
        else
        {
        	System.err.println("Incident Not Assigned -Error");
        }
		
			}


}
