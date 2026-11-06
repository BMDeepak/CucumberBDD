package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	WebDriver driver;
	public login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="submit")
	WebElement btnlogin;
	
	public void enterUsername(String username) {
		txtusername.sendKeys(username);
	}
	public void enterPassword(String password) {
		txtpassword.sendKeys(password);
	}
	public void clickLogin() {
		btnlogin.click();
	}

}
