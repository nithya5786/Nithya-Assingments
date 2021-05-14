package incident.management;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateProposal {
	public static void main(String[] args) throws InterruptedException {
		// Driver setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev103117.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		// Login
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("India@123");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		//Click on Proposal

		WebElement searchIncident = driver.findElement(By.id("filter"));
		searchIncident.sendKeys("Proposal");
		Thread.sleep(2000);
		searchIncident.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='My Proposals']")).click();
		driver.switchTo().frame("gsft_main");
		Thread.sleep(2000);

		//Switch to frame and search for new proposal to be updated
		WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchField.sendKeys("STDCHG0001276");
		searchField.sendKeys(Keys.ENTER);

		//Click on the proposal
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();

		//Change state
		WebElement changeproposalstate = driver.findElement(By.id("std_change_proposal.state"));
		Select selesct = new Select(changeproposalstate);
		selesct.selectByIndex(1);
		String state = selesct.getFirstSelectedOption().getText();
		System.out.println(state);
		driver.findElement(By.xpath("//button[@data-for='sys_display.std_change_proposal.assignment_group']//span[1]"))
				.click();

		Set<String> listWindows = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<String>(listWindows);
		driver.switchTo().window(allWindows.get(1));
		driver.findElement(By.linkText("Change Management")).click();
		driver.switchTo().window(allWindows.get(0));
		driver.switchTo().frame("gsft_main");
		Thread.sleep(2000);

		//Assign to group
		String AssignedGroup = driver.findElement(By.id("sys_display.std_change_proposal.assignment_group"))
				.getAttribute("value");
		System.out.println(AssignedGroup);
		driver.findElement(By.xpath("(//span[@class='icon icon-search'])[2]")).click();
		listWindows = driver.getWindowHandles();
		allWindows = new ArrayList<String>(listWindows);
		driver.switchTo().window(allWindows.get(1));
		driver.findElement(By.linkText("Template Management")).click();
		driver.switchTo().window(allWindows.get(0));
		driver.switchTo().frame("gsft_main");
		Thread.sleep(2000);

		//Change Request Values and Assigne to Group
		driver.findElement(By.xpath("(//span[@class='tab_caption_text'])[2]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'icon-search btn')]")).click();
		listWindows = driver.getWindowHandles();
		allWindows = new ArrayList<String>(listWindows);
		driver.switchTo().window(allWindows.get(1));
		driver.findElement(By.linkText("Incident Management")).click();
		driver.switchTo().window(allWindows.get(0));
		driver.switchTo().frame("gsft_main");
		Thread.sleep(2000);
		
		//Give Justification and Risk
		driver.findElement(By.xpath("//td[@data-value='Justification']//textarea[1]")).sendKeys("Justification");
		driver.findElement(By.xpath("//td[@data-value='Risk and impact analysis']//textarea[1]")).sendKeys("None");

		//Submit
		driver.findElement(By.id("sysverb_update_bottom")).click();

		//Verify if proposal updated successfully
		if (AssignedGroup.equals("Change Management") && state.equals("In Progress")) {
			System.out.println("Proposal is updated successfully");
		}

		driver.close();
	}

}
