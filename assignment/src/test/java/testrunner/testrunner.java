package testrunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features= "src/test/java/features/requirement.feature"
		,glue={"stepdefinition","utilities"}
		,monochrome= true
		,plugin= {"pretty" , "html:report/xmlreport.html","junit:report/junitreport.junit", "json:report/jsonreport.json"})

	public class testrunner {
		
	
}
