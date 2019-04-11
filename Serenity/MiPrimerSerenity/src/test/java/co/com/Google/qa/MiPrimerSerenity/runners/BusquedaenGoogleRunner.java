package co.com.Google.qa.MiPrimerSerenity.runners;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;



@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/resorces/feature",
        glue = { "co.com.Google.qa.MiPrimerSerenity.StepsDefinitions" },
        snippets =  SnippetType.CAMELCASE)  


public class BusquedaenGoogleRunner {
	
} 
