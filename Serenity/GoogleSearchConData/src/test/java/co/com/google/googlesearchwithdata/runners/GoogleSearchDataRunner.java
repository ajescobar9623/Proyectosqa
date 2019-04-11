package co.com.google.googlesearchwithdata.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/feature",
		glue= {"co.com.google.googlesearchwithdata.stepsdefinitions"},
		snippets= SnippetType.CAMELCASE,
		plugin ={"pretty" , "html:target/cucumber","json:target/cucumber.json"}) 

public class GoogleSearchDataRunner {

	
}
