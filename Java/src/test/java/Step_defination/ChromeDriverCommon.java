package Step_defination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverCommon {
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				 "D:/Ecplise/eclipse/CucumberJava/Java/src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		
		
		 
		
		
	}

}
