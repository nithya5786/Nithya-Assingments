package incident.management;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CallerDelete {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Launching URL
		driver.get("https://dev103117.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Switch to Frame
		driver.switchTo().frame("gsft_main");
		//Login
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("India@123");
		driver.findElement(By.id("sysverb_login")).click();
		//Filter with Incidents
		driver.findElement(By.id("filter")).sendKeys("Callers",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Callers']")).click();
		driver.switchTo().frame("gsft_main");
		//Search with Name
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Nithya",Keys.ENTER);
		//Click on the Name 
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		//Delete
		driver.findElement(By.id("sysverb_delete")).click();
		driver.findElement(By.id("ok_button")).click();
		System.out.println("Caller is Deleted");

	}

}
