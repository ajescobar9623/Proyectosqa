package co.com.tucarro.qa.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Random;

import co.com.tucarro.qa.utils.ResaltarElementos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.tucarro.qa.userinrinterfaces.PaginaPrincipalTucarro.BOTON_BUSCAR;
import static co.com.tucarro.qa.userinrinterfaces.SelecciondeVehiculo.SELECCIONAR_VEHICULO;

public class DarClick implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(ResaltarElementos.marcarElementos(BOTON_BUSCAR));
		actor.attemptsTo(Click.on(BOTON_BUSCAR));
	
		int id = Math.abs(new Random(2).nextInt(7));
		System.out.println(id);
	}
	public static DarClick ClickBuscar() {
		return instrumented(DarClick.class);
	}
}

