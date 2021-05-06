package week3.day2assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		// Pre Condition
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
		Thread.sleep(3000);
		driver.findElement(By.id("txtStationFrom")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()=' Beach Jn']")).click();
		// Clear and Enter To Station
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Delhi");
		driver.findElement(By.xpath("//div[@title='Delhi']//div[1]")).click();
		// Get all Train Names into list
        List<WebElement> trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]/a"));
        List<String> list1= new ArrayList<String>();
        for (int i = 0; i < trainName.size(); i++) {
        	String list =trainName.get(i).getText();
        	list1.add(list);
        	System.out.println(list);
			
		}
        //Sort all the train names
        	Collections.sort(list1);
        	System.out.println(list1);
        
	}

}
