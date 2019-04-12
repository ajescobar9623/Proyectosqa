package co.com.tucarro.qa.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;
import org.openqa.selenium.WebDriver;
import co.com.tucarro.qa.exceptions.ConexionInternet;
import co.com.tucarro.qa.exceptions.VehiculoEsperado;
import co.com.tucarro.qa.models.ModelVehiculo;
import co.com.tucarro.qa.questions.VerificarModeloVeehiculo;
import co.com.tucarro.qa.questions.VerificarNavegacion;
import co.com.tucarro.qa.tasks.BuscarVehiculo;
import co.com.tucarro.qa.userinrinterfaces.PaginaPrincipalTucarro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class TuCarroStepDefinitions {

	PaginaPrincipalTucarro paginaPrincipalTucarro;

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor andres = Actor.named("andres");

	@Before
	public void actorCanBrowseTheWeb() {
		andres.should(seeThat(VerificarNavegacion.Conexion(), is(true)).orComplainWith(ConexionInternet.class,
				ConexionInternet.Conexionred));
		andres.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^andres esta en la pagina web TuCarro\\.com$")
	public void jhobanyEstaEnLaPaginaWebTuCarroCom() throws Exception {
		andres.wasAbleTo(Open.browserOn().the(paginaPrincipalTucarro));
	}

	@When("^el busca el modelo de auto \"([^\"]*)\"$")
	public void elBuscaElModeloDeAuto(ModelVehiculo vehiculo) throws Exception {
		andres.attemptsTo(BuscarVehiculo.especifico(vehiculo));
	}

	@Then("^el verifica que el modelo \"([^\"]*)\" este en los resultados$")
	public void el_verifica_que_el_modelo_este_en_los_resultados(String vehiculo) throws Exception {
		andres.should(seeThat(VerificarModeloVeehiculo.DatosVehiculoEncontrado(), is(vehiculo))
				.orComplainWith(VehiculoEsperado.class, VehiculoEsperado.detallleVehiculo));
	}
}
