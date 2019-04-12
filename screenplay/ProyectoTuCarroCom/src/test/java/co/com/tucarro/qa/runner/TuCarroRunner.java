package co.com.tucarro.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/resources/feature",
        glue = { "co.com.tucarro.qa.stepdefinitions" },
        snippets =  SnippetType.CAMELCASE)

public class TuCarroRunner {

}
