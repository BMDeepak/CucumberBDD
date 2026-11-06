package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.en.*;

public class SearchSteps {
	WebDriver driver=null;
	@Given("Open edge browser")
	public void Open_edge_browser() {
		System.out.println("in given");
		String path=System.getProperty("user.dir");
		
		System.setProperty("webdriver.edge.driver", path+"/src/test/resources/driver/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@And("click on serch panel")
	public void click_on_serch_panel() throws InterruptedException {
		System.out.println("in and state");
		driver.navigate().to("https://www.google.com");
		org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.findElement(By.cssSelector(".QS5gu.sy4vM")).click();
		
	}
	@When("pass data to search")
	public void pass_data_to_search() throws InterruptedException{
		System.out.println("in when");
		driver.findElement(By.className("gLFyf")).sendKeys("cucumber");
		Thread.sleep(10);
		
	}
	@And("press enter")
	public void press_enter() throws InterruptedException {
		System.out.println("press enter");
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	@Then("data should be retrived")
	public void data_should_be_retrived() {
		System.out.println("data should be retrived");
		driver.getPageSource().contains("cucumber");
	}
	

}
