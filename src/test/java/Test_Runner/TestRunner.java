package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/cucumberAutomation",tags ="@SeleniumTest",
glue ="Step_defination",monochrome=true,
plugin = {"pretty","html:target/report1.html","json:target/report2.json",
		"junit:target/reportInJunit.xml"})
public class TestRunner {

}
