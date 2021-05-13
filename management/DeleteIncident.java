package incident.management;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteIncident {

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
		searchIncident.sendKeys("INC0011004");
		searchIncident.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		
		WebElement number = driver.findElement(By.xpath("//a[@class='linked formlink']"));
	    System.out.println("Incident Number: " + number.getText());
		System.out.println(" ");
		number.click();
		
		//Delete the incident
		driver.findElement(By.id("sysverb_delete")).click();
		driver.findElement(By.id("ok_button")).click();

      // Verify the deleted incident
		String expectedText = "No records to display";
		String verifyIncident = driver.findElement(By.xpath("//td[text()='No records to display']")).getText();
		System.out.println(verifyIncident);

		if (verifyIncident.equalsIgnoreCase(expectedText)) {
			System.out.println("Incident: " + number + " has been deleted");
			System.out.println(" ");
			System.out.println("Deleted Existing Incident ");
			driver.close();

		} else {
			System.out.println(number + " hasn't been deleted");
			System.out.println(" ");
			
		}


	}

}
