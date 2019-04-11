package co.com.Google.qa.MiPrimerSerenity.StepsDefinitions;



import co.com.Google.qa.MiPrimerSerenity.steps.EndUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;

public class BusquedaenGoogleStepsDefinitions {

	@Steps
	EndUserSteps andres;
	
	@Given("Jhobany esta en el sitio google")
	public void jhobanyEstaEnElSitioGoogle() {
		 andres.is_the_home_page();
		 System.out.println("se ejecuto given");
		 andres.clickEnBoton();
	}
	

	@When("^el busca la palabra \"([^\"]*)\"$")
	public void elBuscaLaPalabra(String arg1) {
		andres.looks_for(arg1);  
		andres.escogerv();
	 System.out.println("se ejecuto when");   
	}

	
	@Then("^el verifica que la este en el resultado$")
	public void elVerificaQueLaPalabraEsteEnLosResultados() {
		System.out.println("se ejecuto el THEN"); 
	}	
	
}
