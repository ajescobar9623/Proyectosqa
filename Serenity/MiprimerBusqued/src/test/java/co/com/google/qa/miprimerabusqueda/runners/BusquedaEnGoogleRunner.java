package co.com.google.qa.miprimerabusqueda.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature",
		glue= {"co.com.google.qa.miprimerabusqueda.stepsdefinitions"},
		snippets= SnippetType.CAMELCASE,
		plugin ={"pretty" , "html:target/cucumber","json:target/cucumber.json"}) 

public class BusquedaEnGoogleRunner {

}
