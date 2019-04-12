package co.com.tucarro.qa.questions;
import static co.com.tucarro.qa.utils.PinConexion.ProbarConexion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarNavegacion implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return ProbarConexion();
	}
	
	public static  VerificarNavegacion Conexion() {
		return new  VerificarNavegacion();
	}
}
