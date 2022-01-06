package StepsDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.util.Timeout;

public class LoginSteps {
	WebDriver driver;
	
	
	
	@SuppressWarnings("deprecation")
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("Login page gets opened");
	   System.setProperty("WebDriver.chrome.driver",
			   "D:/New folder/eclipse/CucumberJava/src/test/resources/Driver/chromedriver.exe");
	   driver=new ChromeDriver();
	   //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  // driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    
	   
	 
	}

	@When("users enter their id and password")
	public void users_enter_their_id_and_password() {
	    // Write code here that turns the phrase above into concrete actions

		   System.out.println("Users entered valid credtionals");
	    
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions

		   System.out.println("hit the login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions

		   System.out.println("user navigate to the dashboard page");
	}

}
