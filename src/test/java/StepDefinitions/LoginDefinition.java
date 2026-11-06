package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import pages.*;
import io.cucumber.java.en.*;
import pages.logout;

public class LoginDefinition {
    WebDriver driver = null;
    login login=new login(driver);
    logout logout=new logout(driver);
    
    @Given("Login validation")
    public void Login_validation() {
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/test/resources/driver/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    
    @And("move to login page")
    public void move_to_login_page(){
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }
    
    @When("^(.*) and (.*)$") 
    public void Credintials_are_passed(String username, String Password) throws InterruptedException {
//        driver.findElement(By.id("username")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(Password);
    	
    	login.enterUsername("student");
    	login.enterPassword("Password123");
        Thread.sleep(2000);
    }
    
    @And("Click login")
    public void Click_login() throws InterruptedException {
    	WebElement submitBtn = driver.findElement(By.id("submit"));
        
        // Scroll down until the submit button is in view
        org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        Thread.sleep(1000); // Short pause to let the scroll finish
        
//        submitBtn.click();
        logout.logoutDisplayed();
        Thread.sleep(2000);
    }
    
    @Then("Logout button should be shown") 
    public void Logout_button_should_be_shown() {
        boolean isDisplayed = driver.getPageSource().contains("Logout");
        Assert.assertTrue("Login failed - Logout text/button not found!", isDisplayed); 
        // Close the browser session after test completion
        if (driver != null) {
            driver.quit();
        }
    }
}