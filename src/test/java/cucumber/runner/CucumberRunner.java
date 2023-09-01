package cucumber.runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		//monochrome=false,
		//tags="TC01",
		features="src/test/resources/features",
		glue={"cucumber.steps"}
		)
public class CucumberRunner{
	
		
}
