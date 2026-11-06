package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	WebDriver driver;
	public logout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logout")
	WebElement btnlogout;
	
	public void logoutDisplayed() {
		btnlogout.isDisplayed();
	}

}
