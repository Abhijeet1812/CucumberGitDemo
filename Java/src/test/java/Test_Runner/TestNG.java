package Test_Runner;

import io.cucumber.testng.*;

@CucumberOptions(features ="src/test/java/cucumberAutomation/Login.feature",
glue ="Step_defination",tags = "@RegressionTest or @FunctionalTest")
public class TestNG extends AbstractTestNGCucumberTests {

	
}
