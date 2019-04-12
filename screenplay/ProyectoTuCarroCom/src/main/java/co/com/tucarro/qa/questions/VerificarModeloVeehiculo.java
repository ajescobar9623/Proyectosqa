package co.com.tucarro.qa.questions;

import static co.com.tucarro.qa.userinrinterfaces.SelecciondeVehiculo.SELECCIONAR_VEHICULO;

import co.com.tucarro.qa.userinrinterfaces.SelecciondeVehiculo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;

public class VerificarModeloVeehiculo implements Question<String>{

	public VerificarModeloVeehiculo(){	
	}
	
	@Override
	public String answeredBy(Actor actor) {
		System.out.println(SelecciondeVehiculo.DESCRIPCION_VEHICULO_.resolveFor(actor).getText());
				return SelecciondeVehiculo.DESCRIPCION_VEHICULO_.resolveFor(actor).getText();
				
				
	}
	public static VerificarModeloVeehiculo DatosVehiculoEncontrado() {
		return new VerificarModeloVeehiculo();
	}
}

