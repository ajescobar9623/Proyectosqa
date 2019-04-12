package co.com.tucarro.qa.tasks;

import static co.com.tucarro.qa.userinrinterfaces.ResultadoBusqueda.BARRA_DE_BUSQUEDA;
import static co.com.tucarro.qa.userinrinterfaces.SelecciondeVehiculo.DESCRIPCION_VEHICULO_;
import co.com.tucarro.qa.interactions.DarClick;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.openqa.selenium.Keys;
import co.com.tucarro.qa.models.ModelVehiculo;
import co.com.tucarro.qa.utils.ResaltarElementos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class BuscarVehiculo implements Task {

	private String vehiculo;

	public BuscarVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(DarClick.ClickBuscar());
		actor.attemptsTo(ResaltarElementos.marcarElementos(BARRA_DE_BUSQUEDA));
		actor.attemptsTo(Enter.theValue(vehiculo).into(BARRA_DE_BUSQUEDA).thenHit(Keys.ENTER));
		actor.attemptsTo(SeleccionarVehiculo.selecciona());
		
	}

	public static BuscarVehiculo especifico(ModelVehiculo vehiculo) {
		return instrumented(BuscarVehiculo.class, vehiculo.getListado());
	}
}
