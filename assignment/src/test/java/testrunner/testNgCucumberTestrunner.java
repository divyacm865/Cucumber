package testrunner;



import io.cucumber.junit.CucumberOptions;



@CucumberOptions(
		features= "src/test/java/features/requirement.feature"
		,glue={"stepdefinition"})

public class testNgCucumberTestrunner  {

}
