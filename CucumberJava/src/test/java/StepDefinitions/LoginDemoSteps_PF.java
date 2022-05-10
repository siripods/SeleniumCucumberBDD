package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;
import pages.loginPage;

public class LoginDemoSteps_PF {

	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("=== Inside LoginDemoSteps_PF ===");
		System.out.println("Inside Step - browser is open");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);

		// set web driver = IE //System.setProperty("webdriver.ie.driver",projectPath +
		// "/src/test/resources/drivers/IEDriverServer.exe");
		// driver =new InternetExplorerDriver();

		// set web driver = chrome
		// //System.setProperty("webdriver.chrome.driver",projectPath +
		// "/src/test/resources/drivers/chromedriver.exe");
		// driver = newChromeDriver();

		// set web driver = microsoft edge
		System.setProperty("webdriver.edge.driver", projectPath + "/src/test/resources/drivers/msedgedriver.exe");
		driver = new EdgeDriver();

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		// driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step - user is on login page");
		driver.navigate().to("https://example.testproject.io/web");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		System.out.println("Inside Step - ^user enters (.*) and (.*)$");
		System.out.println("initializing LoginPage_PF ...");
		login = new LoginPage_PF(driver);
		System.out.println("LoginPage_PF initialized");
		login.enterUsername(username);
		login.enterPassword(password);
		Thread.sleep(3000);
	}

	@And("user clicks on Login")
	public void user_clicks_on_Login() throws InterruptedException {
		System.out.println("Inside Step - user clicks on Login");
		login.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		System.out.println("Inside Step - user is navigated to the home page");
		home = new HomePage_PF(driver);
		home.checkLogOutIsDisplayed();
		Thread.sleep(3000);

		driver.close();
		driver.quit();
	}

}
