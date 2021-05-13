package incident.management;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateIncidentWithoutMandatory {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Open ServiceNow
		driver.get("https://dev63235.service-now.com/navpage.do");

		driver.switchTo().frame(0);

		// Login
		driver.findElement(By.id("user_name")).sendKeys("admin");

		driver.findElement(By.id("user_password")).sendKeys("India@123");

		driver.findElement(By.id("sysverb_login")).click();

		// Click on Incidents
		// Enter Incident in filter navigator and press enter"
		WebElement incident = driver.findElement(By.id("filter"));
		incident.sendKeys("Incident");
		incident.sendKeys(Keys.ENTER);

		// Click on New
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(iframe);
		
		// Click on new button
		//driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("sysverb_new")).click();
		
		// Click on Submit
		driver.findElement(By.id("sysverb_insert_bottom")).click();

		// Verification
		String text = driver.findElement(By.xpath("//span[@class='outputmsg_text']")).getText();

		if (text.equals("The following mandatory fields are not filled in: Short description")) {
			System.out.println("Error message is displayed if mandatory fields are not filled");
		}

		driver.close();

	}

}
