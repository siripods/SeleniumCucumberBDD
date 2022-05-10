package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage_PF {

	WebDriver driver = null;
	
	@FindBy(id = "logout")
	WebElement btn_logout;
	
	public HomePage_PF(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this);
	}
	public void checkLogOutIsDisplayed() {
		btn_logout.isDisplayed();
	}
}
