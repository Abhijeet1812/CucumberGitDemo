package Step_defination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends ChromeDriverCommon {
	@Before("@WebTest")
	public void beforeMethidAnnotation() {
		
		System.out.println("Browser get opened");
		
	}
	
	@After("@SeleniumTest")
	public void AfterMethidAnnotation() {
		System.out.println("After browser gets closed");
		driver.quit();
		
	}

}
