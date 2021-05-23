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

public class DeleteLead {
	ChromeDriver driver;
	String LeadId;
	String Text;
	
	@Given("Launch Chrome browser for Delete Lead")
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@When("Load URL for Delete Lead {string}")
	public void loadUrl(String url)
	{
		driver.get(url);	
	}
	@And("Type username for Delete as {string}")
	public void typeUserName(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);	
	}
	@And("Type password for Delete as {string}")
	public void typePassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@And("Click Login Button for Delete")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Verify Login is successful for Delete")
	public void isSuccess()
	{
		WebElement eleCrm =driver.findElement(By.linkText("CRM/SFA"));
		System.err.println(eleCrm.isDisplayed());
		
		
	}
	@And("Click CRM SFA for Delete")
	public void clickCrm()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();	
	}
	@And("Click Leads Tab for Delete")
	public void clickLead()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("To Click on the Find Leads for Delete")
	public void findLe()
	{
		driver.findElement(By.linkText("Find Leads")).click();

	}
    @And("To click on phone")
    public void clickPhone()
    {
    	driver.findElement(By.linkText("Phone")).click();

    }
    @And("Send phone number as (.*)$")
    public void typePhone(String phoneNumber)
    {
    	driver.findElement(By.name("phoneNumber")).sendKeys(phoneNumber);
    }
    @And("Submit Find Leads button")
    public void clickFinLe() throws InterruptedException
    {
    	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

    }
  @And("Get LeadId")
  public void getLead() 
  {
	  LeadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
	  System.out.println(LeadId);

  }
  @And("Click first match")
  public void firstMatch() throws InterruptedException
  {
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();

  }
  @And("Click Delete")
  public void deleteClick() throws InterruptedException
  {
	  
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Delete")).click();

  }
  @And("Click Find Leads")
  public void findClick()
  {
	  driver.findElement(By.linkText("Find Leads")).click();
  }
  @And("Send LeadId button")
  public void sendLeadid()
  {
	  driver.findElement(By.name("id")).sendKeys(LeadId);
  }
  @And("Click Find Leads Button")
  public void clickFind()
  {
	  driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
  }
  @Then("Verify No Records Display Message")
  public void verifyMessage()
  {
	  Text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(Text);
		
		if(Text.contains("No records to display")) 
		{
			System.out.println("Lead is deleted");
		}
		else
		{
			System.out.println("Lead is not deleted");
		}
  }
}
