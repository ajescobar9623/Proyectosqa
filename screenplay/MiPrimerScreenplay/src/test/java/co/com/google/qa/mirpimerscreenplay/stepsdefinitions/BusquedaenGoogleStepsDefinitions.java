package co.com.google.qa.mirpimerscreenplay.stepsdefinitions;



import org.openqa.selenium.WebDriver;

import co.com.google.qa.mirpimerscreenplay.questions.ThePhrase;
import co.com.google.qa.mirpimerscreenplay.tasks.LookUpPhrase;
import co.com.google.qa.mirpimerscreenplay.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.core.Is.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BusquedaenGoogleStepsDefinitions {
	
GoogleHomePage googleHomePage;
	
	@Managed(driver = "chrome")
	    private WebDriver hisBrowser;
	    private Actor andres = Actor.named("Doña Sara Dujast");
	    
	@Before
	 public void actorCanBrowseTheWeb() {
	        andres.can(BrowseTheWeb.with(hisBrowser));
	   }
	
	@Given("^arthur esta en el sitio de google$")
	public void arthurEstaEnElSitioDeGoogle()  {
		andres.wasAbleTo(Open.browserOn().the(googleHomePage));
	  
	}

	@When("^el busca la frase \"([^\"]*)\" compuesta \"([^\"]*)\"$")
	public void elBuscaLaFraseCompuesta(String palabraUno, String palabraDos)  {
	    andres.attemptsTo(LookUpPhrase.composedOfTheWords(palabraUno, palabraDos));
	  
	}

	@Then("^el verifica que la palabra \"([^\"]*)\" este en los resultados$")
	public void elVerificaQueLaPalabraEsteEnLosResultados(String resultadoEsperado)  {
	    andres.should(seeThat(ThePhrase.searched(), is(resultadoEsperado))); 
				
	}
}
