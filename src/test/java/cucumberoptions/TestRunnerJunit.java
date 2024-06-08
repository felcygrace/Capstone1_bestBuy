
package cucumberoptions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageobjects.Base;
import configuration.FileReader;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepdefinitions.StepsDefinitions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions", plugin = {"pretty","html:target/cucumber.html"})

public class TestRunnerJunit {
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() throws Throwable {

		String browser = FileReader.get_Instance().get_InstanceCR().get_Browser();
		String url = FileReader.get_Instance().get_InstanceCR().get_Url();
		driver = Base.getBrowser(browser);
		driver = Base.getUrl(url);

		driver = StepsDefinitions.driver;
	}

	@AfterClass
	public static void close() {
		driver.close();

	}
}