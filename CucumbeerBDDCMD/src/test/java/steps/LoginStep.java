package steps;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.*;

public class LoginStep {
	
	WebDriver driver = null;
	LoginPage_PF loginPage;
	HomePage_PF homePage;
	
	@Before(order = 1)
	public void browserSetup() {
		
		//System.out.println("I am inside browserSetup");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", projectPath + "/src/test/resources/drivers/msedgedriver.exe");
		
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		// driver.manage().window().maximize();
	}
	
	@After(order = 1)
	public void teardown() {		
		//System.out.println("I am inside teardown");
		driver.close();
		driver.quit();
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		//System.out.println("Inside Step - user is on login page");
		driver.navigate().to("https://example.testproject.io/web");
	}

	@When("^user enters valid username and password - username: (.*), password: (.*)$")
	public void user_enters_valid_username_and_password(String username, String password) throws InterruptedException {
		//System.out.println("Inside Step - user enters valid username and password");
		loginPage = new LoginPage_PF(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		//Thread.sleep(2000);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		//System.out.println("Inside Step - user clicks on Login");
		loginPage.clickLogin();
		//Thread.sleep(2000);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		//System.out.println("Inside Step - user is navigated to the home page");
		homePage = new HomePage_PF(driver);
		boolean logOutIsDisplayed = homePage.checkLogOutIsDisplayed();
		if(logOutIsDisplayed == false) {
			
		}
		//Thread.sleep(2000);
	}

	@When("^user enters invalid username and password - username: (.*), password: (.*)$")
	public void user_enters_invalid_username_and_password(String username, String password) throws InterruptedException {
		loginPage = new LoginPage_PF(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		//Thread.sleep(2000);
	}

	@Then("error message is displayed - invalid credential")
	public void error_message_is_displayed_invalid_credential() {
		boolean checkMessageInvalidPassword = loginPage.checkMessageInvalidPassword();
		if(!checkMessageInvalidPassword) {
			
		}
		//throw new Exception("wrong error message");
		assertEquals("checkMessageInvalidPassword", true, checkMessageInvalidPassword);
	}
	
	@Given("user ??????????????????????????????????????? login page")
	public void TH_user_is_on_login_page() {
		//System.out.println("Inside Step - user is on login page");
		driver.navigate().to("https://example.testproject.io/web");
	}
	
	@When("^user ???????????? username, password ????????? - username: (.*), password: (.*)$")
	public void TH_user_enters_invalid_username_and_password(String username, String password) throws InterruptedException {
		loginPage = new LoginPage_PF(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		//Thread.sleep(2000);
	}
	
	@And("????????????????????? login button")
	public void TH_clicks_on_login_button() throws InterruptedException {
		//System.out.println("Inside Step - user clicks on Login");
		loginPage.clickLogin();
		//Thread.sleep(2000);
	}

	@Then("error message ????????????????????? - invalid credential")
	public void TH_error_message_is_displayed_invalid_credential() throws Exception {
		boolean checkMessageInvalidPassword = loginPage.checkMessageInvalidPassword();
		if(!checkMessageInvalidPassword) {
			
		}
		//throw new Exception("wrong error message");
		assertEquals("checkMessageInvalidPassword", true, checkMessageInvalidPassword);
	}
}
