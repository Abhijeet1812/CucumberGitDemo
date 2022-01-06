package Step_defination;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.junit.Assert.*; 
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;


public class SearchStepDefination extends GetProperties{
	WebDriver driver;
 
	 @Given("^User is on GreenKart page$")
	    public void user_is_on_greenkart_page() throws Throwable {
		 driver=ChromeDriverCommon.getDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
		  Thread.sleep(3000);		 
	        
	    }

	 @When("^User searched for (.+) vegetable$")
	    public void user_searched_for_vegetable(String flowername)throws Throwable {
	       driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys(flowername);
	       Thread.sleep(5000);
	    }

	    @Then("^\"([^\"]*)\" should be dispplayed$")
	    public void something_should_be_dispplayed(String strArg1) throws Throwable {
	      
	    	Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
	    	Thread.sleep(5000);
	    }
	    
//	    @Then("^verify selected \"([^\"]*)\" items is displayed or not$")
//	    public void verify_selected_something_items_is_displayed_or_not(String strArg1) throws Throwable {
//	       
//	    }

	    @And("^add to items to cart$")
	    public void add_to_items_to_cart() throws Throwable {
	    	driver.findElement(By.cssSelector("a.increment")).click();
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	    	Thread.sleep(5000);
	    }

	    @And("^user procceed to checkout page$")
	    public void user_procceed_to_checkout_page() throws Throwable {
	    	driver.findElement(By.cssSelector("a.cart-icon")).click();
	    	Thread.sleep(5000); 
	    	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	    	Thread.sleep(5000);
	    }
	    
	    @Then("^verify selected (.+) items is displayed or not$")
	    public void verify_selected_items_is_displayed_or_not(String flowername) throws Throwable {
	    	String ActualResult = driver.findElement(By.cssSelector("p.product-name")).getText();
	    	Assert.assertEquals(ActualResult,flowername);
	    	Thread.sleep(5000);
	    }




}
