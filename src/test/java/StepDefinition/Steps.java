package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;

public class Steps {

	WebDriver driver;

	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
		System.out.println("This Step open the Chrome and launch the application.");
		
		System.setProperty("webdriver.chrome.driver", "C://Users//joydeepr938//Desktop//Backup//Cucumber_Workspace//CucumberWithSelenium//Driver//chromedriver_2.38.exe");
		
		// System.setProperty("webdriver.gecko.driver", "C://Users//joydeepr938//Desktop//Backup//Cucumber_Workspace//CucumberWithSelenium//Driver//geckodriver-v0.16.1.exe");
		
				ChromeOptions options = new ChromeOptions();
				options.addArguments("headless");
				
				
		driver= new ChromeDriver(options);
		
		//		Robot robot1= new Robot();
		//		robot1.keyPress(KeyEvent.VK_SPACE);
		// options.addArguments("start-maximized");
		// driver= new FirefoxDriver();	
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4");	
		
	}

	@When("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String uname, String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This step enter the Username and Password on the login page.");
		driver.findElement(By.name("uid")).sendKeys("username12");							
		driver.findElement(By.name("password")).sendKeys("password12");
	}
	
	@Then("^Reset the credential$")
	public void Reset_the_credential() throws Throwable {
		System.out.println("This step click on the Reset button.");
		driver.findElement(By.name("btnReset")).click();	
	}

}