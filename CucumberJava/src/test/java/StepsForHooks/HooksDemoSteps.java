package StepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {
	
//	WebDriver driver = null;
//	
//	@Before(order = 2)
//	public void browserSetup() {
//		
//		System.out.println("I am inside browserSetup");
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.edge.driver", projectPath + "/src/test/resources/drivers/msedgedriver.exe");
//		
//		driver = new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//		// driver.manage().window().maximize();
//	}
//	
//	@Before(order = 1)
//	public void setup2() {
//		
//		System.out.println("I am inside setup2");
//		
//	}
//	
//	@After(order = 1)
//	public void teardown() {		
//		System.out.println("I am inside teardown");
//		driver.close();
//		driver.quit();
//	}
//	
//	@After(order = 2)
//	public void teardown2() {		
//		System.out.println("I am inside teardown2");
//	}
//	
//	@BeforeStep
//	public static void beforeSteps() {
//		System.out.println("I am inside beforeSteps---");
//	}
//	
//	@AfterStep
//	public static void afterSteps() {
//		System.out.println("I am inside afterSteps---");
//	}
//	
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		
//	}
//
//	@When("user enters username and password")
//	public void user_enters_username_and_password() {
//		
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//		
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		
//	}
}
