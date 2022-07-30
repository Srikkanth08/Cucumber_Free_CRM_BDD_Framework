package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.loginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps_POM 
{
/* 	WebDriver driver = null;
	
	loginPage login;
	
	@Given("browser is open")
	public void browser_is_open() 
	{
		System.out.println(" === I'm inside LoginDemoSteps _POM === ");
		
		System.out.println("Inside step - browser is open ");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project Path : " + projectPath);
		
//		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() 
	{
		driver.navigate().to("https://example.testproject.io/web");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException 
	{
		loginPage login = new loginPage(driver);
		login.enterUsername(username);
		
		login.enterPassword(password);
		
		
//		driver.findElement(By.id("name")).sendKeys(username);
//		Thread.sleep(2000);
//		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() 
	{
		login.clickLogin(); 
//		driver.findElement(By.id("login")).click();
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() 
	{
		login.checkLogOutIsDisplayed();
		
//		driver.findElement(By.id("logout")).isDisplayed();
		
		driver.close();
		driver.quit();
	}   */
}
