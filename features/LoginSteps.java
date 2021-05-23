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

public class LoginSteps {
	ChromeDriver driver;
	@Given("Launch Chrome browser")
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
	}

	@When("Load URL {string}")
	public void loadUrl(String url)
	{
		driver.get(url);	
	}
	@And("Type username as {string}")
	public void typeUserName(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);	
	}
	@And("Type password as {string}")
	public void typePassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@And("Click Login Button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Verify Login is successful")
	public void isSuccess()
	{
		WebElement eleCrm =driver.findElement(By.linkText("CRM/SFA"));
		System.err.println(eleCrm.isDisplayed());
		
		
	}
	@And("Click CRM SFA")
	public void clickCrm()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();	
	}
	@And("Click Leads Tab")
	public void clickLead()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("Click Create Lead Menu")
	public void clickCreate()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@And("Type Company Name as (.*)$")
	public void typeCompany(String companyName)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	@And("Type First Name as (.*)$")
	public void typeFirstName(String firstName)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	@And("Type Last Name as (.*)$")
	public void typeLastName(String lastName)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	@And("Click Create Lead Button")
		public void createLead()
		{
			driver.findElement(By.className("smallSubmit")).click();
		}
	@Then("Verify the lead is created")
	   public void verifyLead()
		{
		if(driver.getTitle().contains("View Lead"))
		{
			System.out.println("Success");
		}
		
		}
		}
		
		
		
		
		
		
		
		
		
	
	

	


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	
	

