package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class LoginDemoSteps_POM {
//	
//	WebDriver driver = null;
//	loginPage login;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside LoginDemoSteps_POM");
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
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://example.testproject.io/web");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
//		login = new loginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		Thread.sleep(3000);
//	}
//	
//	@And("user clicks on Login")
//	public void user_clicks_on_Login() throws InterruptedException {
//		login.clickLogin();
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//		login.checkLogOutIsDisplayed();
//		Thread.sleep(3000);
//		
//		driver.close();
//		driver.quit();
//	}


}