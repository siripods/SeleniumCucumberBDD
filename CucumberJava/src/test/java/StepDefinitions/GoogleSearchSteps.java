package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
//	WebDriver driver = null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step - browser is open");
//		
//		String projectPath  = System.getProperty("user.dir");
//		System.out.println("Project path is: " + projectPath);
//		
//		// set wev driver = IE
//		//System.setProperty("webdriver.ie.driver", projectPath + "/src/test/resources/drivers/IEDriverServer.exe");
//		//driver = new InternetExplorerDriver();
//							
//		// set wev driver = chrome
//		//System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
//		//driver = new ChromeDriver();
//		
//		// set wev driver = microsoft edge
//		System.setProperty("webdriver.edge.driver", projectPath + "/src/test/resources/drivers/msedgedriver.exe");
//		driver = new EdgeDriver();
//		
//		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//		//driver.manage().window().maximize();
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step - user is on google search page");
//		
//		driver.navigate().to("https://www.google.com");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws InterruptedException {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step - user enters a text in search box");
//		
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//		System.out.println("send keys already");
//		Thread.sleep(5000);
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step - hits enter");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		System.out.println("send keys already");
//		Thread.sleep(5000);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() throws InterruptedException {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step - user is navigated to search results");
//		
//		driver.getPageSource().contains("Online Courses");
//		System.out.println("check output already");
//		Thread.sleep(5000);
//		
//		driver.close();
//		driver.quit();
//	}

}
