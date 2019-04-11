package co.com.tucarro.qa.stepsdefinitions;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import co.com.tucarro.qa.steps.TuCarroSteps;
import co.com.tucarro.qa.tasks.TuCarroExtraerTexto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TuCarroStepsDefinitions {

	@Steps
	TuCarroSteps andres;
	
		
	@Given("^Jhobany esta en la pagina web TuCarro\\.com$")
	public void jhobanyEstaEnLaPaginaWebTuCarroCom() throws Exception {
		//andres.verificar();
		andres.ingresoPagianaWeb();
		andres.clickEnBoton();
	}
	@When("^el busca el modelo de auto \"([^\"]*)\"$")
	public void elBuscaElModeloDeAuto(String vehiculo) throws Exception {
		andres.buscarVehiculo(vehiculo);
		andres.seleccionaVehiculo();	
	}
	@Then("^el verifica que el modelo este en los resultados$")
	public void elVerificaQueElModeloEsteEnLosResultados() throws Exception {
		andres.sacart();
	}
}
