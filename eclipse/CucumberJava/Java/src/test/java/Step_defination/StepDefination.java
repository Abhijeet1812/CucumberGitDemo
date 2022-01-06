package Step_defination;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefination { @Given("^User on the login page$")
public void user_on_the_login_page() throws Throwable {
	System.out.println("Hello is there anything 1 ");

}

@When("^User logged in the applicaton with \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_logged_in_the_applicaton_with_something_and_something(String strArg1, String strArg2) throws Throwable {

	System.out.println("Hello is there anything 2 ");
	System.out.println(strArg1);
	System.out.println(strArg2);


}

@Then("^Home page should get displayed$")
public void home_page_should_get_displayed() throws Throwable {
	System.out.println("Hello is there anything  3");


}

@And("^Cards should Display \"([^\"]*)\"$")
public void cards_should_display_something(String strArg3) throws Throwable {
	System.out.println("Hello is there anything 4 ");
	System.out.println(strArg3);

}
@When("^User sign up following details$")
public void user_sign_up_following_details(DataTable data) throws Throwable {
	List<List<String>> objList=data.asLists();
	System.out.println(objList.get(0).get(0));
	System.out.println(objList.get(0).get(1));
	System.out.println(objList.get(0).get(2));
//	System.out.println(objList.get(0).get(4));
//	System.out.println(objList.get(0).get(5));
}
@When("^User sign up with multiple (.+) and (.+)$")
public void user_sign_up_with_and(String username, String password) throws Throwable {
	System.out.println(username);
	System.out.println(password);
}


@Given("^validate the browser$")
public void validate_the_browser() throws Throwable {
	System.out.println("validate BACKGORUNDBACKGORUND the browswer");
    
}

@When("^Browser is opened$")
public void browser_is_opened() throws Throwable {
	System.out.println("Browser BACKGORUND is opened");
   
}

@Then("^Pop up message should get displayed$")
public void popup_message_should_get_displayed() throws Throwable {
	System.out.println("Pop up BACKGORUND message should get displayed");
    
}
}

