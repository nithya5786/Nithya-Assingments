package week3.day2assignments;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailMapInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// Step 1:Launch chrome Browser
		ChromeDriver driver = new ChromeDriver();
		// Step 2:URL load
		driver.get("http://erail.in");
		// Step 3:Maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Clear and Enter From Station
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()=' Beach Jn']")).click();
		Thread.sleep(3000);
		// Clear and Enter To Station
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Delhi");
		driver.findElement(By.xpath("//div[@title='Delhi']//div[1]")).click();
		Thread.sleep(3000);
		// Uncheck the checkbox -sort on date
		driver.findElement(By.id("chkSelectDateOnly")).click();
		System.out.println("Unchecked the Sort On Date");
		// Create a Map
		Map<String, String> map = new HashMap<String, String>();
		// Create the list using the Train listed
		List<WebElement> train = driver.findElements(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader']"));
				
		// Print data from each row
		for (WebElement row : train) 
		{
		
		// Create a list for columns of each row
			List<WebElement> columns = row.findElements(By.tagName("td"));
			
			for (WebElement cols : columns) 
			{
		// Check if train column name starts with M (chosen M as there were no trains
		// starting with S)
				if (cols.getText().startsWith("M")) 
				{

					map.put(cols.getText(), cols.getText());
				}
			}

		}

		System.out.println(map.values());
	}

}
