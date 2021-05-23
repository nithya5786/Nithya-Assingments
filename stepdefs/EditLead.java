package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	ChromeDriver driver;
	String text;
	@Given("Launch Chrome browser for Edit Lead")
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@When("Load URL for Edit Lead {string}")
	public void loadUrl(String url)
	{
		driver.get(url);	
	}
	@And("Type username for Edit as {string}")
	public void typeUserName(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);	
	}
	@And("Type password for Edit as {string}")
	public void typePassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@And("Click Login Button for Edit")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Verify Login is successful for Edit")
	public void isSuccess()
	{
		WebElement eleCrm =driver.findElement(By.linkText("CRM/SFA"));
		System.err.println(eleCrm.isDisplayed());
		
		
	}
	@And("Click CRM SFA for Edit")
	public void clickCrm()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();	
	}
	@And("Click Leads Tab for Edit")
	public void clickLead()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("To Click on the Find Leads for Edit")
	public void findLe()
	{
		driver.findElement(By.linkText("Find Leads")).click();

	}
	@And("To enter firstname as (.*)$")
	public void firstName(String firstName)
	{
		driver.findElement(By.xpath("(//input[@name='firstName' and @class=' x-form-text x-form-field'])[3]")).sendKeys(firstName);	
	}
	@And("To click on the find leads button")
	public void findLeads() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@And ("Click on first resulting lead")
	public void ToSelectFirstResultingLead() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		Thread.sleep(2000);
	}
	@And ("To get existing company name")
	public void getExistingCompanyName() throws InterruptedException {
		 text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		Thread.sleep(2000);

		System.out.println(text);
        //Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View Lead"))
			System.out.println("Title is matching");
		else
			System.out.println("Title is not matching");
	}
	@And ("To click on Edit option") 
	public void clickEditOption() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Thread.sleep(2000);

	}
	@And ("To clear existing value and update new Company name as (.*)$") 
	public void resetAndReEnterCompanyName(String companyName) throws InterruptedException
	{
		String text = driver.findElement(By.id("updateLeadForm_companyName")).getText();
		Thread.sleep(2000);
		System.out.println(text);
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		Thread.sleep(2000);

	}

	@And ("To click on update button") 
	public void clickUpdate() {
		driver.findElementByXPath("//input[@value='Update']").click();
	}

	@Then ("Verify changed company value")
	public void verifyEditedCompanyValue() {
		String text1 = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(text1);
		
		if(text1.contains(text))
			System.out.println("Names are matching");
		else
			System.out.println("Names are not matching");

	}


	
	
}
