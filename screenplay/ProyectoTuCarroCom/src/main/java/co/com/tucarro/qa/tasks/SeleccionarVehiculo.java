package co.com.tucarro.qa.tasks;
import  static co.com.tucarro.qa.userinrinterfaces.SelecciondeVehiculo.SELECCIONAR_VEHICULO;
import static co.com.tucarro.qa.utils.ResaltarElementos.marcarElementos;
import  static co.com.tucarro.qa.userinrinterfaces.SelecciondeVehiculo.DESCRIPCION_VEHICULO_;

import co.com.tucarro.qa.models.ModelVehiculo;
import co.com.tucarro.qa.utils.ResaltarElementos;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarVehiculo implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(ResaltarElementos.marcarElementos(SELECCIONAR_VEHICULO));
		actor.attemptsTo(Click.on(SELECCIONAR_VEHICULO));
		actor.attemptsTo(ResaltarElementos.marcarElementos(DESCRIPCION_VEHICULO_));
	}
	public static SeleccionarVehiculo selecciona() {
		return instrumented(SeleccionarVehiculo.class);
	}
}
