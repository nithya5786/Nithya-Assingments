package incident.management;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewIncident {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Open ServiceNow
		driver.get("https://dev63235.service-now.com/navpage.do");

		driver.switchTo().frame(0);
        
		//Login
		driver.findElement(By.id("user_name")).sendKeys("admin");

		driver.findElement(By.id("user_password")).sendKeys("India@123");

		driver.findElement(By.id("sysverb_login")).click();
        
		//Click on Incidents
		driver.findElement(By.xpath("//div[text()='Incidents']")).click();
		
		//Click on New
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(iframe);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='navbar-header']//button)[2]")).click();
		String number = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println(number);

		//Type in Mandatory Fields
		driver.findElement(By.id("incident.short_description")).sendKeys("Test3");
		
		//View Source
		WebElement eleViewSource =driver.findElement(By.className("form_action_button_container"));
		int viewSource_y=eleViewSource.getLocation().getY();
		System.out.println(viewSource_y);
		
		
		//Click Submit
		//driver.findElement(By.id("sysverb_insert_bottom")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
		//driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(number, Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(number,Keys.ENTER);
		
		//driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(incident,Keys.ENTER);
		String num2 = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		if (number.equals(num2)) {
			System.out.println("Incident  created successfully");

		} else {
			System.out.println("Incident request not created");

		}

	}

	

	}


