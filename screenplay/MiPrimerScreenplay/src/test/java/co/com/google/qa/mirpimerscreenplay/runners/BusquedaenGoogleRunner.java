package co.com.google.qa.mirpimerscreenplay.runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)   
@CucumberOptions( features="src/test/sources",
        glue = { "co.com.google.qa.mirpimerscreenplay.stepsdefinitions" },
        snippets =  SnippetType.CAMELCASE)

public class BusquedaenGoogleRunner {

}
